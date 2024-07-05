package DAOS;

import entidades.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {
    private Connection connection;

    public MedicoDAO() {
        try {
            // Configure sua conexão com o banco de dados aqui
            String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
            String user = "seu_usuario";
            String password = "sua_senha";
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
        }
    }

    // Método para adicionar um novo médico
    public void adicionarMedico(Medico medico) {
        String sql = "INSERT INTO Medico (nomeMedico, crm, especialidade, senhaMedico) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, medico.getNomeMedico());
            stmt.setString(2, medico.getCrmMedico());
            stmt.setString(3, medico.getEspecialidadeMedico());
            stmt.setString(4, medico.getSenhaMedico());
            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    medico.setIdMedico(generatedKeys.getInt(1));
                }
            }

        } catch (SQLException e) {
        }
    }

    // Método para atualizar um médico existente
    public void atualizarMedico(Medico medico) {
        String sql = "UPDATE Medico SET nomeMedico = ?, crm = ?, especialidade = ?, senhaMedico = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, medico.getNomeMedico());
            stmt.setString(2, medico.getCrmMedico());
            stmt.setString(3, medico.getEspecialidadeMedico());
            stmt.setString(4, medico.getSenhaMedico());
            stmt.setInt(5, medico.getIdMedico());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    // Método para deletar um médico
    public void deletarMedico(int id) {
        String sql = "DELETE FROM Medico WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    // Método para buscar um médico pelo ID
    public Medico buscarMedicoPorId(int id) {
        String sql = "SELECT * FROM Medico WHERE id = ?";
        Medico medico = null;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    medico = new Medico(rs.getString("nomeMedico"), rs.getString("senhaMedico"));
                    medico.setIdMedico(rs.getInt("id"));
                    medico.setCrmMedico(rs.getString("crm"));
                    medico.setEspecialidadeMedico(rs.getString("especialidade"));
                }
            }
        } catch (SQLException e) {
        }

        return medico;
    }

    // Método para buscar todos os médicos
    public List<Medico> buscarTodosMedicos() {
        String sql = "SELECT * FROM Medico";
        List<Medico> medicos = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Medico medico = new Medico(rs.getString("nomeMedico"), rs.getString("senhaMedico"));
                medico.setIdMedico(rs.getInt("id"));
                medico.setCrmMedico(rs.getString("crm"));
                medico.setEspecialidadeMedico(rs.getString("especialidade"));
                medicos.add(medico);
            }
        } catch (SQLException e) {
        }

        return medicos;
    }
}