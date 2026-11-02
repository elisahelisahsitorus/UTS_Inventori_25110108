package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {

    private static final String URL  = "jdbc:mysql://localhost:8111/db_inventori";
    private static final String USER = "root";
    private static final String PASS = "";   // default XAMPP kosong

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");   // Connector/J 5.1.x
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                "Driver MySQL tidak ditemukan.\nTambahkan library MySQL JDBC Driver ke proyek.",
                "Koneksi Gagal", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Tidak dapat terhubung ke database db_inventori.\n"
                + "Pastikan MySQL di XAMPP sudah berjalan dan database sudah dibuat.\n\n"
                + "Detail: " + e.getMessage(),
                "Koneksi Gagal", JOptionPane.ERROR_MESSAGE);
        }
        return null;   // dikembalikan null jika gagal
    }
}