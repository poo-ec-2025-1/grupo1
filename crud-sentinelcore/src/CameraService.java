import java.sql.*;
import java.util.*;

public class CameraDAO {
    private Connection conn;

    public CameraDAO() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:sentinelcore.db");
            criarTabela();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS cameras (" +
                     "id INTEGER PRIMARY KEY," +
                     "nome TEXT NOT NULL," +
                     "ligada BOOLEAN NOT NULL)";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void criar(CameraInteligente c) {
        String sql = "INSERT INTO cameras(id, nome, ligada) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, c.getId());
            pstmt.setString(2, c.getNome());
            pstmt.setBoolean(3, c.isLigada());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public CameraInteligente buscar(int id) {
        String sql = "SELECT * FROM cameras WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new CameraInteligente(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getBoolean("ligada")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void atualizar(CameraInteligente c) {
        String sql = "UPDATE cameras SET nome = ?, ligada = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, c.getNome());
            pstmt.setBoolean(2, c.isLigada());
            pstmt.setInt(3, c.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM cameras WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<CameraInteligente> listarTodas() {
        List<CameraInteligente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cameras";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new CameraInteligente(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getBoolean("ligada")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
