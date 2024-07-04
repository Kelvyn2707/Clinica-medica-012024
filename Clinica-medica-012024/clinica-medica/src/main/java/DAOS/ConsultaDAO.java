package DAOS;

import entidades.Consulta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaDAO {

    private Connection conn;

    public ConsultaDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/clinica";
            String user = "root";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
        }
    }

    public void addConsulta(Consulta consulta) {
        String sql = "INSERT INTO Consulta (codigoUsuario, codigoPaciente, codigoMedico, data, hora, retorno, cancelado, motivoCancelamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, consulta.getCodigoUsuario());
            stmt.setInt(2, consulta.getCodigoPaciente());
            stmt.setInt(3, consulta.getCodigoMedico());
            stmt.setDate(4, (Date) consulta.getData());
            stmt.setString(5, consulta.getHora());
            stmt.setString(6, consulta.getRetorno());
            stmt.setString(7, consulta.getCancelado());
            stmt.setString(8, consulta.getMotivoCancelamento());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Consulta> getAllConsultas() {
        List<Consulta> consultas = new ArrayList<>();
        String sql = "SELECT * FROM Consulta";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Consulta consulta = new Consulta();
                consulta.setRegistroAgenda(rs.getInt("registroAgenda"));
                consulta.setCodigoUsuario(rs.getInt("codigoUsuario"));
                consulta.setCodigoPaciente(rs.getInt("codigoPaciente"));
                consulta.setCodigoMedico(rs.getInt("codigoMedico"));
                consulta.setData(rs.getDate("data"));
                consulta.setHora(rs.getString("hora"));
                consulta.setRetorno(rs.getString("retorno"));
                consulta.setCancelado(rs.getString("cancelado"));
                consulta.setMotivoCancelamento(rs.getString("motivoCancelamento"));
                consultas.add(consulta);
            }
        } catch (SQLException e) {
        }
        return consultas;
    }

    public Consulta getConsultaById(int registroAgenda) {
        String sql = "SELECT * FROM Consulta WHERE registroAgenda = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, registroAgenda);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Consulta consulta = new Consulta();
                    consulta.setRegistroAgenda(rs.getInt("registroAgenda"));
                    consulta.setCodigoUsuario(rs.getInt("codigoUsuario"));
                    consulta.setCodigoPaciente(rs.getInt("codigoPaciente"));
                    consulta.setCodigoMedico(rs.getInt("codigoMedico"));
                    consulta.setData(rs.getDate("data"));
                    consulta.setHora(rs.getString("hora"));
                    consulta.setRetorno(rs.getString("retorno"));
                    consulta.setCancelado(rs.getString("cancelado"));
                    consulta.setMotivoCancelamento(rs.getString("motivoCancelamento"));
                    return consulta;
                }
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void updateConsulta(Consulta consulta) {
        String sql = "UPDATE Consulta SET codigoUsuario = ?, codigoPaciente = ?, codigoMedico = ?, data = ?, hora = ?, retorno = ?, cancelado = ?, motivoCancelamento = ? WHERE registroAgenda = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, consulta.getCodigoUsuario());
            stmt.setInt(2, consulta.getCodigoPaciente());
            stmt.setInt(3, consulta.getCodigoMedico());
            stmt.setDate(4, (Date) consulta.getData());
            stmt.setString(5, consulta.getHora());
            stmt.setString(6, consulta.getRetorno());
            stmt.setString(7, consulta.getCancelado());
            stmt.setString(8, consulta.getMotivoCancelamento());
            stmt.setInt(9, consulta.getRegistroAgenda());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteConsulta(int registroAgenda) {
        String sql = "DELETE FROM Consulta WHERE registroAgenda = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, registroAgenda);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
}