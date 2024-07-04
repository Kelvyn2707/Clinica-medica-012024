package DAOS;

import entidades.Medico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {
    private Connection connection;

    public MedicoDAO() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", "usuario", "senha");
        } catch (SQLException e) {
        }
    }

    public void addMedico(Medico medico) {
        String sql = "INSERT INTO Medico (nome, crm, especialidade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCrm());
            stmt.setString(3, medico.getEspecialidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void updateMedico(Medico medico) {
        String sql = "UPDATE Medico SET nome = ?, crm = ?, especialidade = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, medico.getNome());
            stmt.setString(2, medico.getCrm());
            stmt.setString(3, medico.getEspecialidade());
            stmt.setInt(4, medico.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteMedico(int id) {
        String sql = "DELETE FROM Medico WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public Medico getMedicoById(int id) {
        String sql = "SELECT * FROM Medico WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Medico medico = new Medico();
                medico.setId(rs.getInt("id"));
                medico.setNome(rs.getString("nome"));
                medico.setCrm(rs.getString("crm"));
                medico.setEspecialidade(rs.getString("especialidade"));
                return medico;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public List<Medico> getAllMedicos() {
        List<Medico> medicos = new ArrayList<>();
        String sql = "SELECT * FROM Medico";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Medico medico = new Medico();
                medico.setId(rs.getInt("id"));
                medico.setNome(rs.getString("nome"));
                medico.setCrm(rs.getString("crm"));
                medico.setEspecialidade(rs.getString("especialidade"));
                medicos.add(medico);
            }
        } catch (SQLException e) {
        }
        return medicos;
    }
}