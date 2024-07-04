package DAOS;

import entidades.Especialidade;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EspecialidadeDAO {

    private Connection conn;

    public EspecialidadeDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/clinica";
            String user = "root";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
        }
    }

    public void addEspecialidade(Especialidade especialidade) {
        String sql = "INSERT INTO Especialidade (nome, especialidade) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, especialidade.getNome());
            stmt.setString(2, especialidade.getEspecialidade());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Especialidade> getAllEspecialidades() {
        List<Especialidade> especialidades = new ArrayList<>();
        String sql = "SELECT * FROM Especialidade";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Especialidade especialidade = new Especialidade();
                especialidade.setId(rs.getInt("id"));
                especialidade.setNome(rs.getString("nome"));
                especialidade.setEspecialidade(rs.getString("especialidade"));
                especialidades.add(especialidade);
            }
        } catch (SQLException e) {
        }
        return especialidades;
    }

    public Especialidade getEspecialidadeById(int id) {
        String sql = "SELECT * FROM Especialidade WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Especialidade especialidade = new Especialidade();
                    especialidade.setId(rs.getInt("id"));
                    especialidade.setNome(rs.getString("nome"));
                    especialidade.setEspecialidade(rs.getString("especialidade"));
                    return especialidade;
                }
            }
        } catch (SQLException e) {
        }
        return null;
    }

   public void updateEspecialidade(Especialidade especialidade) {
        String sql = "UPDATE Especialidade SET nome = ?, especialidade = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, especialidade.getNome());
            stmt.setString(2, especialidade.getEspecialidade());
            stmt.setInt(3, especialidade.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteEspecialidade(int id) {
        String sql = "DELETE FROM Especialidade WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
}