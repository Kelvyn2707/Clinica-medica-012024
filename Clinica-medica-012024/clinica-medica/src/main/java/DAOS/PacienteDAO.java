package DAOS;

import entidades.Paciente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO {

    private Connection conn;

    public PacienteDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/clinica";
            String user = "root";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
        }
    }

    public void addPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente (nome, cpf, rg, cidade, bairro, numero_residencia, cep, idade, sexo, email, telefone, data_nascimento, status) VALUES (?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getRg());
            stmt.setString(4, paciente.getCidade());
            stmt.setString(5, paciente.getBairro());
            stmt.setString(6, paciente.getNumeroResidencia());
            stmt.setString(7, paciente.getCep());
            stmt.setInt(8, paciente.getIdade());
            stmt.setString(9, paciente.getSexo());
            stmt.setString(10, paciente.getEmail());
            stmt.setString(11, paciente.getTelefone());
            stmt.setDate(12, new java.sql.Date(paciente.getDataNascimento().getTime()));
            stmt.setString(13, paciente.getStatus());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Paciente> getAllPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM paciente";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setRg(rs.getString("rg"));
                paciente.setCidade(rs.getString("cidade"));
                paciente.setBairro(rs.getString("bairro"));
                paciente.setNumeroResidencia(rs.getString("numero_residencia"));
                paciente.setCep(rs.getString("cep"));
                paciente.setIdade(rs.getInt("idade"));
                paciente.setSexo(rs.getString("sexo"));
                paciente.setEmail(rs.getString("email"));
                paciente.setTelefone(rs.getString("telefone"));
                paciente.setDataNascimento(rs.getDate("data_nascimento"));
                paciente.setStatus(rs.getString("status"));
                pacientes.add(paciente);
            }
        } catch (SQLException e) {
        }
        return pacientes;
    }

    public void updatePaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET nome = ?, cpf = ?, rg = ?, cidade = ?, bairro = ?, numero_residencia = ?, cep = ?, idade = ?, sexo = ?, email = ?, telefone = ?, "
                + "data_nascimento = ?, status = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, paciente.getNome());
            stmt.setString(2, paciente.getCpf());
            stmt.setString(3, paciente.getRg());
            stmt.setString(4, paciente.getCidade());
            stmt.setString(5, paciente.getBairro());
            stmt.setString(6, paciente.getNumeroResidencia());
            stmt.setString(7, paciente.getCep());
            stmt.setInt(8, paciente.getIdade());
            stmt.setString(9, paciente.getSexo());
            stmt.setString(10, paciente.getEmail());
            stmt.setString(11, paciente.getTelefone());
            stmt.setDate(12, new java.sql.Date(paciente.getDataNascimento().getTime()));
            stmt.setString(13, paciente.getStatus());
            stmt.setInt(14, paciente.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deletePaciente(int id) {
        String sql = "DELETE FROM paciente WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }
}