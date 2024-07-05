package DAOS;

import entidades.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        try {
            String url = "jdbc:mysql://localhost:3306/clinica_medica";
            String user = "root";
            String password = "1234";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
        }
    }

    public void addUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuario (nome, email, senha) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM Usuario";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
        }
        return usuarios;
    }

    public List<Usuario> getUsuariosPorNome(String nome) {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM Usuario WHERE nome LIKE ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + nome + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setSenha(rs.getString("senha"));
                    usuarios.add(usuario);
                }
            }
        } catch (SQLException e) {
        }
        return usuarios;
    }
    
    public Usuario getUsuarioById(int id) {
        String sql = "SELECT * FROM Usuario WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setSenha(rs.getString("senha"));
                    return usuario;
                }
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public void updateUsuario(Usuario usuario) {
        String sql = "UPDATE Usuario SET nome = ?, email = ?, senha = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, usuario.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void deleteUsuario(int id) {
        String sql = "DELETE FROM Usuario WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public Usuario authenticate(String email, String senha) {
        String sql = "SELECT * FROM Usuario WHERE email = ? AND senha = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);
            stmt.setString(2, senha);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getInt("id"));
                    usuario.setNome(rs.getString("nome"));
                    usuario.setEmail(rs.getString("email"));
                    usuario.setSenha(rs.getString("senha"));
                    return usuario;
                }
            }
        } catch (SQLException e) {
        }
        return null;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        try {
            addUsuario(usuario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
