package DAOS;

import entidades.Funcionario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private Connection connection;

    public FuncionarioDAO() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica", "usuario", "senha");
        } catch (SQLException e) {
        }
    }

    public void addFuncionario(Funcionario funcionario) {
        String sql = "INSERT INTO Funcionario (nome, rg, orgao_emissor, cpf, endereco, numero, complemento, bairro, cidade, estado, telefone, celular, numero_pis, data_nascimento) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRg());
            stmt.setString(3, funcionario.getOrgaoEmissor());
            stmt.setString(4, funcionario.getCpf());
            stmt.setString(5, funcionario.getEndereco());
            stmt.setString(6, funcionario.getNumero());
            stmt.setString(7, funcionario.getComplemento());
            stmt.setString(8, funcionario.getBairro());
            stmt.setString(9, funcionario.getCidade());
            stmt.setString(10, funcionario.getEstado());
            stmt.setString(11, funcionario.getTelefone());
            stmt.setString(12, funcionario.getCelular());
            stmt.setString(13, funcionario.getNumeroPis());
            stmt.setDate(14, funcionario.getDataNascimento());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void updateFuncionario(Funcionario funcionario) {
        String sql = "UPDATE Funcionario SET nome = ?, rg = ?, orgao_emissor = ?, cpf = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, "
                + "cidade = ?, estado = ?, telefone = ?, celular = ?, numero_pis = ?, data_nascimento = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getRg());
            stmt.setString(3, funcionario.getOrgaoEmissor());
            stmt.setString(4, funcionario.getCpf());
            stmt.setString(5, funcionario.getEndereco());
            stmt.setString(6, funcionario.getNumero());
            stmt.setString(7, funcionario.getComplemento());
            stmt.setString(8, funcionario.getBairro());
            stmt.setString(9, funcionario.getCidade());
            stmt.setString(10, funcionario.getEstado());
            stmt.setString(11, funcionario.getTelefone());
            stmt.setString(12, funcionario.getCelular());
            stmt.setString(13, funcionario.getNumeroPis());
            stmt.setDate(14, funcionario.getDataNascimento());
            stmt.setInt(15, funcionario.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteFuncionario(int id) {
        String sql = "DELETE FROM Funcionario WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public Funcionario getFuncionarioById(int id) {
        String sql = "SELECT * FROM Funcionario WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setOrgaoEmissor(rs.getString("orgao_emissor"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setNumero(rs.getString("numero"));
                funcionario.setComplemento(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setEstado(rs.getString("estado"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setNumeroPis(rs.getString("numero_pis"));
                funcionario.setDataNascimento(rs.getDate("data_nascimento"));
                return funcionario;
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public List<Funcionario> getAllFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        String sql = "SELECT * FROM Funcionario";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setRg(rs.getString("rg"));
                funcionario.setOrgaoEmissor(rs.getString("orgao_emissor"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setNumero(rs.getString("numero"));
                funcionario.setComplemento(rs.getString("complemento"));
                funcionario.setBairro(rs.getString("bairro"));
                funcionario.setCidade(rs.getString("cidade"));
                funcionario.setEstado(rs.getString("estado"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setCelular(rs.getString("celular"));
                funcionario.setNumeroPis(rs.getString("numero_pis"));
                funcionario.setDataNascimento(rs.getDate("data_nascimento"));
                funcionarios.add(funcionario);
            }
        } catch (SQLException e) {
        }
        return funcionarios;
    }
}