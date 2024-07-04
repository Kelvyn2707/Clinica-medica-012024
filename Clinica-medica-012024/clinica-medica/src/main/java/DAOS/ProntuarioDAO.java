package DAOS;

import entidades.Prontuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProntuarioDAO {

    private Connection conn;

    public ProntuarioDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/clinica";
            String user = "root";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
        }
    }

    public void addProntuario(Prontuario prontuario) {
        String sql = "INSERT INTO prontuario (registro, exames_realizados, historico, receituario) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, prontuario.getRegistro());
            stmt.setString(2, prontuario.getExamesRealizados());
            stmt.setString(3, prontuario.getHistorico());
            stmt.setString(4, prontuario.getReceituario());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Prontuario> getAllProntuarios() {
        List<Prontuario> prontuarios = new ArrayList<>();
        String sql = "SELECT * FROM prontuario";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Prontuario prontuario = new Prontuario();
                prontuario.setId(rs.getInt("id"));
                prontuario.setRegistro(rs.getString("registro"));
                prontuario.setExamesRealizados(rs.getString("exames_realizados"));
                prontuario.setHistorico(rs.getString("historico"));
                prontuario.setReceituario(rs.getString("receituario"));
                prontuarios.add(prontuario);
            }
        } catch (SQLException e) {
        }
        return prontuarios;
    }

    public void updateProntuario(Prontuario prontuario) {
        String sql = "UPDATE prontuario SET registro = ?, exames_realizados = ?, historico = ?, receituario = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, prontuario.getRegistro());
            stmt.setString(2, prontuario.getExamesRealizados());
            stmt.setString(3, prontuario.getHistorico());
            stmt.setString(4, prontuario.getReceituario());
            stmt.setInt(5, prontuario.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteProntuario(int id) {
        String sql = "DELETE FROM prontuario WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
}