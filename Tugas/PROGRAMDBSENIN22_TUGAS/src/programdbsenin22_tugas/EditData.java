/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programdbsenin22_tugas;

/**
 *
 * @author kalvi
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class EditData extends javax.swing.JFrame {
 String user="root";
 String pswd ="";
 String host="localhost";
 String db="dbdatasenin";
 String url="";
 private Connection Lconnection=null;
 
    /**
     * Creates new form EditData
     */
 
    public EditData() {
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
        jPanel2 = new javax.swing.JPanel();
        LBLNAME1 = new javax.swing.JLabel();
        LBLTELEPHONE = new javax.swing.JLabel();
        LBLTELEPHONE1 = new javax.swing.JLabel();
        LBLTELEPHONE2 = new javax.swing.JLabel();
        LBLTELEPHONE4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txttelepon = new javax.swing.JTextField();
        txthp = new javax.swing.JTextField();
        txtprodi = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        LBLNAME2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        BTNCEKID = new javax.swing.JButton();
        BTNCEKNAMA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        LBLNAME1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLNAME1.setForeground(new java.awt.Color(255, 255, 255));
        LBLNAME1.setText("Id");

        LBLTELEPHONE.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLTELEPHONE.setForeground(new java.awt.Color(255, 255, 255));
        LBLTELEPHONE.setText("Alamat");

        LBLTELEPHONE1.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLTELEPHONE1.setForeground(new java.awt.Color(255, 255, 255));
        LBLTELEPHONE1.setText("Handphone");

        LBLTELEPHONE2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLTELEPHONE2.setForeground(new java.awt.Color(255, 255, 255));
        LBLTELEPHONE2.setText("Telepon");

        LBLTELEPHONE4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLTELEPHONE4.setForeground(new java.awt.Color(255, 255, 255));
        LBLTELEPHONE4.setText("Prodi");

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        LBLNAME2.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        LBLNAME2.setForeground(new java.awt.Color(255, 255, 255));
        LBLNAME2.setText("Nama");

        BTNCEKID.setText("Cek ID");
        BTNCEKID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCEKIDActionPerformed(evt);
            }
        });

        BTNCEKNAMA.setText("Cek Nama");
        BTNCEKNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCEKNAMAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LBLNAME1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLTELEPHONE4)
                            .addComponent(LBLTELEPHONE2)
                            .addComponent(LBLTELEPHONE)
                            .addComponent(LBLTELEPHONE1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LBLNAME2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsimpan)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txtalamat, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txttelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txthp)
                            .addComponent(txtprodi)
                            .addComponent(txtid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNCEKID, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(BTNCEKNAMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLNAME1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTNCEKID)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLNAME2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BTNCEKNAMA)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLTELEPHONE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLTELEPHONE2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLTELEPHONE1)
                    .addComponent(txthp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLTELEPHONE4)
                    .addComponent(txtprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnsimpan)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://"+ host +"/"+ db + "?user=" + user + "&password="+ pswd;
            Connection conn=DriverManager.getConnection(url);
            PreparedStatement pStatement = conn.prepareStatement
            ("UPDATE tbdatasenin SET Nama=?, Alamat=?, Telepon=?, Handphone=?,Prodi=?  WHERE Id=?");        
            pStatement.setString(1, txtnama.getText());
            pStatement.setString(2, txtalamat.getText());
            pStatement.setString(3, txttelepon.getText());
            pStatement.setString(4, txthp.getText());
            pStatement.setString(5, txtprodi.getText());
            pStatement.setString(6, txtid.getText());

            if (pStatement.executeUpdate()>0)
            JOptionPane.showMessageDialog(this,
                "Penambahan sukses", "Informasi",
                JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,
                "Penambahan gagal", "Informasi",
                JOptionPane.INFORMATION_MESSAGE);
            
            pStatement.close();
            conn.close();
            
            txtnama.setText("");
            txtalamat.setText("");
            txttelepon.setText("");
            txthp.setText("");
            txtprodi.setText("");
            txtid.setText("");
        }
        
        catch(ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }

    }//GEN-LAST:event_btnsimpanActionPerformed

    private void BTNCEKIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCEKIDActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery (" Select * from tbdatasenin" + " where ID='" + txtid.getText() + "'");
            
            if (rs.next()) {
                btnsimpan.setEnabled(true);
                txtnama.setText(rs.getString("Nama"));
                txtalamat.setText(rs.getString("Alamat"));
                txttelepon.setText(rs.getString("Telepon"));
                txthp.setText(rs.getString("Handphone"));
                txtprodi.setText(rs.getString("Prodi"));
                txtid.setText(rs.getString("ID"));
            } else {
                JOptionPane.showMessageDialog(this,"ID: Salah", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                btnsimpan.setEnabled(false);
                txtnama.setText("");
                txtalamat.setText("");
                txttelepon.setText("");
                txthp.setText("");
                txtid.setText("");
                txtnama.requestFocus();
            }
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_BTNCEKIDActionPerformed

    private void BTNCEKNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCEKNAMAActionPerformed
        // TODO add your handling code here:
        try {
            Statement st = Lconnection.createStatement();
            ResultSet rs = st.executeQuery
            ("Select * from tb_datasenin" + " where Nama like('%" +txtnama.getText() + "%')");

            if (rs.next()) {
                btnsimpan.setEnabled(true);
                txtnama.setText(rs.getString("Nama"));
                txtalamat.setText(rs.getString("Alamat"));
                txttelepon.setText(rs.getString("Telepon"));
                txthp.setText(rs.getString("Handphone"));
                txtprodi.setText(rs.getString("Prodi"));
                txtid.setText(rs.getString("ID"));
            } else {
                JOptionPane.showMessageDialog(this,"Nama: Salah", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                btnsimpan.setEnabled(false);
                txtnama.setText("");
                txtalamat.setText("");
                txttelepon.setText("");
                txthp.setText("");
                txtprodi.setText("");
                txtid.setText("");
                
            }
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
    }//GEN-LAST:event_BTNCEKNAMAActionPerformed

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
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCEKID;
    private javax.swing.JButton BTNCEKNAMA;
    private javax.swing.JLabel LBLNAME1;
    private javax.swing.JLabel LBLNAME2;
    private javax.swing.JLabel LBLTELEPHONE;
    private javax.swing.JLabel LBLTELEPHONE1;
    private javax.swing.JLabel LBLTELEPHONE2;
    private javax.swing.JLabel LBLTELEPHONE4;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtprodi;
    private javax.swing.JTextField txttelepon;
    // End of variables declaration//GEN-END:variables
}
