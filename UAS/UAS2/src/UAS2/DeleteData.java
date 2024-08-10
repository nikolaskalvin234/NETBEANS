/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable; 

/**
 *
 * @author kalvi
 */
public class DeleteData extends javax.swing.JFrame {
        String user="root";         
        String pswd ="";         
        String host="localhost";         
        String db="dbaplikasikasir";         
        String url="";
        private Connection Lconnection=null;
    
    
    /**
     * Creates new form AplikasiPenjualanKasir
     */
    public DeleteData() {
        initComponents();
         btnsimpan.setEnabled(false);
        try {
        Class.forName("com.mysql.jdbc.Driver");
        url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;
        Lconnection=DriverManager.getConnection(url);
        }
        catch(ClassNotFoundException e) {
        System.out.println("Driver tidak ditemukan");
        }
        catch (SQLException e){
        System.out.println("koneksi gagal:" +
        e.toString());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txthargabarang = new javax.swing.JTextField();
        hargatanah = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hargatanah1 = new javax.swing.JLabel();
        txtjumlahbeli = new javax.swing.JTextField();
        hargatanah2 = new javax.swing.JLabel();
        txtjumlahharga = new javax.swing.JTextField();
        cmbnamabarang = new javax.swing.JComboBox<>();
        hargatanah3 = new javax.swing.JLabel();
        txtjumlahbayar = new javax.swing.JTextField();
        hargatanah4 = new javax.swing.JLabel();
        txtjumlahkembalian = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btncekID = new javax.swing.JButton();
        BTNCEKNAMA = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jLabel2.setText("Nama Barang");

        hargatanah.setText("Harga Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("APLIKASI KASIR TOKO GRIYA COMPUTER");

        hargatanah1.setText("Jumlah Beli");

        txtjumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahbeliActionPerformed(evt);
            }
        });

        hargatanah2.setText("Jumlah Harga");

        cmbnamabarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Barang", "Flashdisk", "Mouse", "Music Box", "Keyboard", "Modem" }));
        cmbnamabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbnamabarangActionPerformed(evt);
            }
        });

        hargatanah3.setText("Jumlah Bayar");

        hargatanah4.setText("Jumlah Kembalian");

        jButton1.setText("Hitung Jumlah Harga");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Hitung Jumlah Kembalian");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setText("ID");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        btncekID.setText("Cek ID");
        btncekID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncekIDActionPerformed(evt);
            }
        });

        BTNCEKNAMA.setText("Cek Nama");
        BTNCEKNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCEKNAMAActionPerformed(evt);
            }
        });

        jLabel5.setText("Nama");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hargatanah)
                                    .addComponent(hargatanah1)
                                    .addComponent(hargatanah2)
                                    .addComponent(hargatanah3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(hargatanah4)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtjumlahkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjumlahbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthargabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BTNCEKNAMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncekID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncekID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCEKNAMA)
                    .addComponent(jLabel5)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbnamabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargatanah)
                    .addComponent(txthargabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargatanah1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hargatanah2)
                    .addComponent(txtjumlahharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargatanah3)
                    .addComponent(txtjumlahbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargatanah4)
                    .addComponent(txtjumlahkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(btnsimpan))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void cmbnamabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbnamabarangActionPerformed
        // TODO add your handling code here:
        String kodebarang;
        double hargabarang = 200000;

        kodebarang = String.valueOf(cmbnamabarang.getSelectedItem());

        if (kodebarang.equals("pilih barang")) {
        }else
        if (kodebarang.equals("Flashdisk")) {
            hargabarang = 200000;
        }else
        if (kodebarang.equals("Mouse")) {
            hargabarang = 300000;
        }else
        if (kodebarang.equals("Music Box")) {
            hargabarang = 400000;
        }else
        if (kodebarang.equals("Keyboard")) {
            hargabarang = 350000;
        }else
        if (kodebarang.equals("Modem")) {
            hargabarang = 250000;    
        }else
        {
            hargabarang = 0;
        }
        
        txthargabarang.setText(""+hargabarang); 
    }//GEN-LAST:event_cmbnamabarangActionPerformed

    private void txtjumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahbeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahbeliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Double harga,jualbeli,hasil;
        harga=Double.parseDouble(txthargabarang.getText());
        jualbeli=Double.parseDouble(txtjumlahbeli.getText());
        hasil=harga*jualbeli;
        txtjumlahharga.setText(String.valueOf(hasil));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Double jumlahharga,bayar,hasil;
        jumlahharga=Double.parseDouble(txtjumlahharga.getText());
        bayar=Double.parseDouble(txtjumlahbayar.getText());
        hasil=bayar-jumlahharga;
        txtjumlahkembalian.setText(String.valueOf(hasil)); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        txthargabarang.setText("");
        txtjumlahbeli.setText("");
        txtjumlahharga.setText("");
        txtjumlahbayar.setText("");
        txtjumlahkembalian.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btncekIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncekIDActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery (" Select * from tb_kasir" + " where ID='" + txtid.getText() + "'");
            
            if (rs.next()) {
                btnsimpan.setEnabled(true);
                txtid.setText(rs.getString("ID"));
                txtnama.setText(rs.getString("Nama"));
                cmbnamabarang.setSelectedItem(rs.getString("Namabarang"));
                txthargabarang.setText(rs.getString("Hargabarang"));
                txtjumlahbeli.setText(rs.getString("Jumlahbeli"));
                txtjumlahharga.setText(rs.getString("Jumlahharga"));
                txtjumlahbayar.setText(rs.getString("Jumlahbayar"));
                txtjumlahkembalian.setText(rs.getString("Jumlahkembalian"));
                
            } else {
                JOptionPane.showMessageDialog(this,"ID: Salah", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                btnsimpan.setEnabled(false);
                txtid.setText("");
                txtnama.setText("");
                cmbnamabarang.setSelectedIndex(0);
                txthargabarang.setText("");
                txtjumlahbeli.setText("");
                txtjumlahharga.setText("");
                txtjumlahbayar.setText("");
                txtjumlahkembalian.setText("");
                
                cmbnamabarang.requestFocus();
            }
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_btncekIDActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pStatement = Lconnection.prepareStatement
            ("DELETE FROM tb_kasir WHERE Id=?");
            pStatement.setString(1, txtid.getText());

            if (pStatement.executeUpdate()>0)
            JOptionPane.showMessageDialog (this,"Delete sukses", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog (this, "Delete gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);

            pStatement.close();
            txtid.setText("");
            txtnama.setText("");
            cmbnamabarang.setSelectedIndex(0);
            txthargabarang.setText("");
            txtjumlahbeli.setText("");
            txtjumlahharga.setText("");
            txtjumlahbayar.setText("");
            txtjumlahkembalian.setText("");
            txtnama.requestFocus();
        }

        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BTNCEKNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCEKNAMAActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery
            ("Select * from tb_kasir" + " where Nama like('%" +txtnama.getText()+ "%')");

            if (rs.next()) {
                btnsimpan.setEnabled(true);
                txtnama.setText(rs.getString("Nama"));
                cmbnamabarang.setSelectedItem(rs.getString("Namabarang"));
                txthargabarang.setText(rs.getString("Hargabarang"));
                txtjumlahbeli.setText(rs.getString("Jumlahbeli"));
                txtjumlahharga.setText(rs.getString("Jumlahharga"));
                txtjumlahbayar.setText(rs.getString("Jumlahbayar"));
                txtjumlahkembalian.setText(rs.getString("Jumlahkembalian"));
                txtid.setText(rs.getString("ID"));
            } else {
                JOptionPane.showMessageDialog(this,"Nama: Salah", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                btnsimpan.setEnabled(false);
                txtnama.setText("");
                cmbnamabarang.setSelectedIndex(0);
                txthargabarang.setText("");
                txtjumlahbeli.setText("");
                txtjumlahharga.setText("");
                txtjumlahbayar.setText("");
                txtjumlahkembalian.setText("");
                txtid.setText("");
                txtnama.requestFocus();
            }
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_BTNCEKNAMAActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCEKNAMA;
    private javax.swing.JButton btncekID;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbnamabarang;
    private javax.swing.JLabel hargatanah;
    private javax.swing.JLabel hargatanah1;
    private javax.swing.JLabel hargatanah2;
    private javax.swing.JLabel hargatanah3;
    private javax.swing.JLabel hargatanah4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txthargabarang;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjumlahbayar;
    private javax.swing.JTextField txtjumlahbeli;
    private javax.swing.JTextField txtjumlahharga;
    private javax.swing.JTextField txtjumlahkembalian;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
