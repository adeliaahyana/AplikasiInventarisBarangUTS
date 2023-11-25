/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class InventarisBarang extends javax.swing.JFrame {

    /**
     * Creates new form InventarisBarang
     */
    public InventarisBarang() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        tfNamaBarang = new javax.swing.JTextField();
        dtTanggal = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        listKondisiBarang = new javax.swing.JList<>();
        tfJumlahBarang = new javax.swing.JTextField();
        cbKodeBarang = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDeskripsi = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Inventaris Barang");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("No");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Tanggal Beli");

        jLabel4.setText("Jumlah");

        jLabel5.setText("Kondisi");

        jLabel6.setText("Kode ");

        jLabel7.setText("Deskripsi");

        tfNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNoKeyTyped(evt);
            }
        });

        tfNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaBarangActionPerformed(evt);
            }
        });

        dtTanggal.setDateFormatString("yyyy-MM-dd");
        dtTanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dtTanggalPropertyChange(evt);
            }
        });

        listKondisiBarang.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Baik", "Rusak Ringan", "Rusak Berat" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listKondisiBarang);

        tfJumlahBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJumlahBarangActionPerformed(evt);
            }
        });
        tfJumlahBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfJumlahBarangKeyTyped(evt);
            }
        });

        cbKodeBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A01", "A02", "A03", "A04", "A05" }));
        cbKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKodeBarangActionPerformed(evt);
            }
        });

        taDeskripsi.setColumns(20);
        taDeskripsi.setRows(5);
        jScrollPane2.setViewportView(taDeskripsi);

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Barang", "Tanggal Beli", "Jumlah", "Kondisi", "Kode", "Deskripsi"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelData);

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnImport.setText("Impor");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnExport.setText("Ekspor");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUbah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnHapus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBatal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExport))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(btnImport))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(751, 751, 751)))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(cbKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnImport)
                            .addComponent(btnTambah)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnBatal)
                            .addComponent(btnExport))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int selectedRow = -1; // digunakan untuk menyimpan baris yang telah dipilih
    private boolean isEditMode = false; // digunakan saat pengeditan
    
    private void tfNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaBarangActionPerformed

    private void tfJumlahBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJumlahBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJumlahBarangActionPerformed

    private void cbKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKodeBarangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String no = tfNo.getText();
        String namabarang= tfNamaBarang.getText();
        Date tanggalbeli = dtTanggal.getDate();
        String jumlah = tfJumlahBarang.getText();
        String kondisi= listKondisiBarang.getSelectedValue();
        String kode= (String) cbKodeBarang.getSelectedItem();
        String deskripsi= taDeskripsi.getText();

        //Mengecek nilai yang di input
     if (no.isEmpty() || namabarang.isEmpty() || jumlah.isEmpty() || deskripsi.isEmpty()) {
         JOptionPane.showMessageDialog(null, "Lengkapi Data Yang Kosong..!",
                    "Error",JOptionPane.WARNING_MESSAGE);
     }else{
     //Menambahkan data ke dalam row
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
         model.addRow(new Object[] {no,namabarang,tanggalbeli,jumlah,kondisi,kode,deskripsi});
         JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
              
     //Membersihkan field setelah data berhasil terinput
        tfNo.setText("");
        tfNamaBarang.setText("");
        dtTanggal.setDate(tanggalbeli);
        tfJumlahBarang.setText("");
        listKondisiBarang.setSelectedValue("", rootPaneCheckingEnabled);
        cbKodeBarang.setSelectedItem("");
        taDeskripsi.setText("");
        }
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Cek apakah ada baris yang dipilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Konfirmasi pengguna untuk menghapus data
        int option = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Hapus data pada baris yang dipilih
            DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
            model.removeRow(selectedRow);

            // Bersihkan input field setelah data dihapus
            tfNo.setText("");
            tfNamaBarang.setText("");
            Date tanggalbeli = null;
            dtTanggal.setDate(tanggalbeli);
            tfJumlahBarang.setText("");
            listKondisiBarang.setSelectedValue(ABORT, isEditMode);
            cbKodeBarang.setSelectedItem("");
            taDeskripsi.setText("");

            // Reset pemilihan baris pada tabel
            tabelData.clearSelection();

            // Reset variabel selectedRow
            selectedRow = -1;
            
            // Mengembalikan ke mode tambah dan mengaktifkan kembali tombol tambah  
            isEditMode = false;
            btnTambah.setEnabled(true);
            
             // Tampilkan JOptionPane untuk memberi tahu bahwa data berhasil dihapus
             JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void dtTanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtTanggalPropertyChange

    }//GEN-LAST:event_dtTanggalPropertyChange

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // Mendapatkan baris yang dipilih saat mouse diklik pada tabel
        selectedRow = tabelData.getSelectedRow();

        // Menampilkan data dari baris yang dipilih di TextField
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
            tfNo.setText(model.getValueAt(selectedRow, 0).toString());
            tfNamaBarang.setText(model.getValueAt(selectedRow, 1).toString());

            // Mengonversi String ke Date dengan format yang sesuai
            String dateString = model.getValueAt(selectedRow, 2).toString();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.ENGLISH);

            try {
                Date tanggal = dateFormat.parse(dateString);
                dtTanggal.setDate(tanggal);
            } catch (ParseException e) {
                e.printStackTrace();
                // Tangani kesalahan jika parsing tanggal gagal
            }

            tfJumlahBarang.setText(model.getValueAt(selectedRow, 3).toString());
            listKondisiBarang.setSelectedValue(model.getValueAt(selectedRow, 4), isEditMode);
            cbKodeBarang.setSelectedItem(model.getValueAt(selectedRow, 5).toString());
            taDeskripsi.setText(model.getValueAt(selectedRow, 6).toString());
        }

    }//GEN-LAST:event_tabelDataMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        // Mengetahui apakah baris ada dipilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang mau diubah", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ambil data dari fields
        String no = tfNo.getText();
        String namabarang= tfNamaBarang.getText();
        Date tanggalbeli = dtTanggal.getDate();
        String jumlah = tfJumlahBarang.getText();
        String kondisi= listKondisiBarang.getSelectedValue();
        String kode= (String) cbKodeBarang.getSelectedItem();
        String deskripsi= taDeskripsi.getText();

        // Validasi inputan tidak ada
        if (no.isEmpty() || namabarang.isEmpty() || jumlah.isEmpty() || deskripsi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Harap lengkapi semua field",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Pembaruan data pada baris yang terpilih
        tabelData.setValueAt(no, selectedRow, 0);
        tabelData.setValueAt(namabarang, selectedRow, 1);
        tabelData.setValueAt(tanggalbeli, selectedRow, 2);
        tabelData.setValueAt(jumlah, selectedRow, 3);
        tabelData.setValueAt(kondisi, selectedRow, 4);
        tabelData.setValueAt(kode, selectedRow, 5);
        tabelData.setValueAt(deskripsi, selectedRow, 6);

        // Bersihkan input field setelah data diubah
        tfNo.setText("");
        tfNamaBarang.setText("");
        dtTanggal.setDate(tanggalbeli);
        tfJumlahBarang.setText("");
        listKondisiBarang.setSelectedValue("", rootPaneCheckingEnabled);
        cbKodeBarang.setSelectedItem("");
        taDeskripsi.setText("");

        // Reset pemilihan baris pada tabel
        tabelData.clearSelection();
        
        // Tampilkan JOptionPane untuk memberi tahu bahwa data berhasil diubah
        JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                                        

    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // TODO add your handling code here:
        // Mengimpor data dalam file ke tabel   
        String filePath = "InventarisBarang.txt";
        File file = new File(filePath);
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel(); 
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++ ){
            String[] row = lines[i].toString().split("/ ");
            model.addRow(row);
        }            
        JOptionPane.showMessageDialog(null, "Import data dari file berhasil");
            
        }catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        // Pembuatan file untuk ekspor data dari tabel ke file tersebut
        try{
            BufferedWriter out = new BufferedWriter (new FileWriter("InventarisBarang.txt"));
            
            for(int i = 0; i < tabelData.getRowCount(); i++){ // rows
                for (int j = 0; j < tabelData.getColumnCount(); j++){ // columns
                    out.write(tabelData.getValueAt(i, j).toString()+"/ ");
                }
                out.newLine();
            }            
            JOptionPane.showMessageDialog(null, "Export ke file berhasil");
            
            out.close();
        }catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void tfNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "masukkan hanya 0-9!");
            evt.consume();
        }
    }//GEN-LAST:event_tfNoKeyTyped

    private void tfJumlahBarangKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfJumlahBarangKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (! ((Character.isDigit(c) ||
                (c == KeyEvent.VK_BACK_SPACE) ||
                (c == KeyEvent.VK_DELETE))
                )) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "masukkan hanya 0-9!");
            evt.consume();
        }
    }//GEN-LAST:event_tfJumlahBarangKeyTyped

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        tfNo.setText("");
        tfNamaBarang.setText("");
        Date tanggalbeli = null;
        dtTanggal.setDate(tanggalbeli);
        tfJumlahBarang.setText("");
        listKondisiBarang.setSelectedValue("", rootPaneCheckingEnabled);
        cbKodeBarang.setSelectedItem("");
        taDeskripsi.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Keluar dari form
              int keluar = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (keluar == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarisBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarisBarang().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbKodeBarang;
    private com.toedter.calendar.JDateChooser dtTanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listKondisiBarang;
    private javax.swing.JTextArea taDeskripsi;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField tfJumlahBarang;
    private javax.swing.JTextField tfNamaBarang;
    private javax.swing.JTextField tfNo;
    // End of variables declaration//GEN-END:variables

}