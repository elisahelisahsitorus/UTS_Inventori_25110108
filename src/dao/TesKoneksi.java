package dao;

public class TesKoneksi {
    public static void main(String[] args) {
        if (Koneksi.getConnection() != null) {
            System.out.println("Koneksi BERHASIL");
        }
    }
}