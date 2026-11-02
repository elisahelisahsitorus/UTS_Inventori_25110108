package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Barang;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class BarangDAO {

    public boolean tambah(Barang b) {
        String sql = "INSERT INTO barang2 (kode_barang, nama_barang, kategori, stok) "
                   + "VALUES (?, ?, ?, ?)";

        try (Connection conn = Koneksi.getConnection()) {
            if (conn == null) {
                return false;   // pesan error sudah ditampilkan oleh Koneksi
            }
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, b.getKodeBarang());
                ps.setString(2, b.getNamaBarang());
                ps.setString(3, b.getKategori());
                ps.setInt(4, b.getStok());
                return ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {   // kode MySQL untuk duplicate key
                JOptionPane.showMessageDialog(null,
                    "Kode barang '" + b.getKodeBarang() + "' sudah ada.",
                    "Gagal Menyimpan", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                    "Gagal menyimpan data.\nDetail: " + e.getMessage(),
                    "Gagal Menyimpan", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }
    }
        public List<Barang> semua() {
        List<Barang> daftar = new ArrayList<>();
        String sql = "SELECT kode_barang, nama_barang, kategori, stok "
                   + "FROM barang2 ORDER BY kode_barang";

        try (Connection conn = Koneksi.getConnection()) {
            if (conn == null) {
                return daftar;
            }
            try (PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    daftar.add(new Barang(
                        rs.getString("kode_barang"),
                        rs.getString("nama_barang"),
                        rs.getString("kategori"),
                        rs.getInt("stok")));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Gagal mengambil data.\nDetail: " + e.getMessage(),
                "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        return daftar;
    }
            public boolean ubah(Barang b) {
        String sql = "UPDATE barang2 SET nama_barang = ?, kategori = ?, stok = ? "
                   + "WHERE kode_barang = ?";

        try (Connection conn = Koneksi.getConnection()) {
            if (conn == null) {
                return false;
            }
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, b.getNamaBarang());
                ps.setString(2, b.getKategori());
                ps.setInt(3, b.getStok());
                ps.setString(4, b.getKodeBarang());
                return ps.executeUpdate() > 0;   // 0 berarti kode tidak ditemukan
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Gagal mengubah data.\nDetail: " + e.getMessage(),
                "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean hapus(String kodeBarang) {
        String sql = "DELETE FROM barang2 WHERE kode_barang = ?";

        try (Connection conn = Koneksi.getConnection()) {
            if (conn == null) {
                return false;
            }
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, kodeBarang);
                return ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Gagal menghapus data.\nDetail: " + e.getMessage(),
                "Kesalahan", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}