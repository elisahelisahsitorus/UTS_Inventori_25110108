
package view;
import dao.BarangDAO;
import javax.swing.JOptionPane;
import model.Barang;
import javax.swing.table.DefaultTableModel;

public class FormBarang extends javax.swing.JFrame {

    
    public FormBarang() {
        initComponents();
        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[] {"Komputer", "Jaringan", "Alat Ukur"}));
        setLocationRelativeTo(null);
        tampilkanData();
        setSize(760, 680);
        setMinimumSize(new java.awt.Dimension(720, 640));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKadBarang = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        lblKategori = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBersihkan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cmbKategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(214, 600));
        setPreferredSize(new java.awt.Dimension(500, 400));

        lblKadBarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblKadBarang.setText("Kode Barang");

        lblNama.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblNama.setText("Nama Barang");
        lblNama.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Stok");

        lblKategori.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblKategori.setText("Kategori");

        btnSimpan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBersihkan.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBersihkan.setText("Bersihkan");
        btnBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanActionPerformed(evt);
            }
        });

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Nama Barang", "Kategori", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Pengolahan Data Barang");

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Komputer", "Jaringan", "Alat Ukur" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKadBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama)
                            .addComponent(cmbKategori, 0, 303, Short.MAX_VALUE))))
                .addGap(651, 651, 651))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(66, 66, 66)
                                .addComponent(btnUbah)
                                .addGap(63, 63, 63)
                                .addComponent(btnHapus)
                                .addGap(50, 50, 50)
                                .addComponent(btnBersihkan))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblKadBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKategori)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBersihkan)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah)
                    .addComponent(btnSimpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

    String kode = txtKode.getText().trim();
    String nama = txtNama.getText().trim();
    String kategori = cmbKategori.getSelectedItem().toString();
    String stokText = txtStok.getText().trim();

    // 1. Kode dan nama tidak boleh kosong
    if (kode.isEmpty() || nama.isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Kode dan nama barang tidak boleh kosong!",
            "Validasi", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 2. Batas panjang sesuai kolom database
    if (kode.length() > 10 || nama.length() > 50) {
        JOptionPane.showMessageDialog(this,
            "Kode maksimal 10 karakter dan nama maksimal 50 karakter!",
            "Validasi", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 3. Stok harus angka
    int stok;
    try {
        stok = Integer.parseInt(stokText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
            "Stok harus berupa angka!",
            "Validasi", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 4. Stok tidak boleh negatif
    if (stok < 0) {
        JOptionPane.showMessageDialog(this,
            "Stok tidak boleh kurang dari 0!",
            "Validasi", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // 5. Valid: simpan lewat DAO
    Barang b = new Barang(kode, nama, kategori, stok);
    BarangDAO dao = new BarangDAO();

    if (dao.tambah(b)) {
        JOptionPane.showMessageDialog(this, "Data barang berhasil disimpan.");
         tampilkanData();
        bersihkanForm();
    } else {
        JOptionPane.showMessageDialog(this,
            "Data barang gagal disimpan.",
            "Gagal", JOptionPane.ERROR_MESSAGE);
    }
}

private void bersihkanForm() {
    txtKode.setText("");
    txtNama.setText("");
    txtStok.setText("");
    jComboBox1.setSelectedIndex(0);
    txtKode.requestFocus();

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        String kode = txtKode.getText().trim();
        String nama = txtNama.getText().trim();
        String kategori = cmbKategori.getSelectedItem().toString();
        String stokText = txtStok.getText().trim();

        if (kode.isEmpty() || nama.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Pilih data di tabel dulu. Kode dan nama tidak boleh kosong!",
                "Validasi", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int stok;
        try {
            stok = Integer.parseInt(stokText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Stok harus berupa angka!",
                "Validasi", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (stok < 0) {
            JOptionPane.showMessageDialog(this,
                "Stok tidak boleh kurang dari 0!",
                "Validasi", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Barang b = new Barang(kode, nama, kategori, stok);

        if (new BarangDAO().ubah(b)) {
            JOptionPane.showMessageDialog(this, "Data barang berhasil diubah.");
            tampilkanData();
            bersihkanForm();
        } else {
            JOptionPane.showMessageDialog(this,
                "Data gagal diubah. Pastikan kode barang sudah terdaftar.",
                "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
         String kode = txtKode.getText().trim();

        if (kode.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Pilih data di tabel yang akan dihapus!",
                "Validasi", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int pilihan = JOptionPane.showConfirmDialog(this,
            "Yakin ingin menghapus barang dengan kode " + kode + "?",
            "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (pilihan == JOptionPane.YES_OPTION) {
            if (new BarangDAO().hapus(kode)) {
                JOptionPane.showMessageDialog(this, "Data barang berhasil dihapus.");
                tampilkanData();
                bersihkanForm();
            } else {
                JOptionPane.showMessageDialog(this,
                    "Data gagal dihapus. Pastikan kode barang terdaftar.",
                    "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanActionPerformed
        bersihkanForm();
        tblBarang.clearSelection();
    }//GEN-LAST:event_btnBersihkanActionPerformed

        private void tampilkanData() {
        DefaultTableModel tm = (DefaultTableModel) tblBarang.getModel();
        tm.setRowCount(0);   // kosongkan tabel dulu supaya tidak dobel

        for (Barang b : new BarangDAO().semua()) {
            tm.addRow(new Object[] {
                b.getKodeBarang(),
                b.getNamaBarang(),
                b.getKategori(),
                b.getStok()
            });
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKadBarang;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblNama;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables

}
