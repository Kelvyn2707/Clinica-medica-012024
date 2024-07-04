package DAOS;

import entidades.Convenio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConvenioDAO {

    private Connection conn;

    public ConvenioDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/clinica";
            String user = "root";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
        }
    }

    public void addConvenio(Convenio convenio) {
        String sql = "INSERT INTO Convenio (empresa, cnpj, telefone, codigo) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, convenio.getEmpresa());
            stmt.setString(2, convenio.getCnpj());
            stmt.setString(3, convenio.getTelefone());
            stmt.setString(4, convenio.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Convenio> getAllConvenios() {
        List<Convenio> convenios = new ArrayList<>();
        String sql = "SELECT * FROM Convenio";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Convenio convenio = new Convenio();
                convenio.setId(rs.getInt("id"));
                convenio.setEmpresa(rs.getString("empresa"));
                convenio.setCnpj(rs.getString("cnpj"));
                convenio.setTelefone(rs.getString("telefone"));
                convenio.setCodigo(rs.getString("codigo"));
                convenios.add(convenio);
            }
        } catch (SQLException e) {
        }
        return convenios;
    }

    public Convenio getConvenioById(int id) {
        String sql = "SELECT * FROM Convenio WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Convenio convenio = new Convenio();
                    convenio.setId(rs.getInt("id"));
                    convenio.setEmpresa(rs.getString("empresa"));
                    convenio.setCnpj(rs.getString("cnpj"));
                    convenio.setTelefone(rs.getString("telefone"));
                    convenio.setCodigo(rs.getString("codigo"));
                    return convenio;
                }
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void updateConvenio(Convenio convenio) {
        String sql = "UPDATE Convenio SET empresa = ?, cnpj = ?, telefone = ?, codigo = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, convenio.getEmpresa());
            stmt.setString(2, convenio.getCnpj());
            stmt.setString(3, convenio.getTelefone());
            stmt.setString(4, convenio.getCodigo());
            stmt.setInt(5, convenio.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteConvenio(int id) {
        String sql = "DELETE FROM Convenio WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
}