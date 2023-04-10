/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Tp2;


import javax.swing.ImageIcon;

/**
 *
 * @author Rasyid Andriansyah
 */
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Card extends javax.swing.JPanel {
    
    /**
     * Creates new form Card
     */
    int id = 0;
    String platform = null;
    String ceo = null;
    byte[] pic = null;
    HOME_JFrame home;
    public Card(HOME_JFrame home, int id, String platform, String ceo, byte[] pic) {
        initComponents();
        labelNama.setText(platform);
        labelceo.setText(ceo);
        ImageIcon imageIcon = new ImageIcon(pic);
        gambar.setIcon(imageIcon);
        this.platform = platform;
        this.ceo= ceo;
        this.pic= pic;
        this.id = id;
        this.home = home;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        jButton_Delete_ = new javax.swing.JButton();
        jButton_Update_ = new javax.swing.JButton();
        gambar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelceo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(438, 169));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Platform");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        labelNama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("(Nama)");
        jPanel1.add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jButton_Delete_.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Delete_.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton_Delete_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete_.setText("Delete");
        jButton_Delete_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Delete_, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 80, -1));

        jButton_Update_.setBackground(new java.awt.Color(0, 102, 255));
        jButton_Update_.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton_Update_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update_.setText("Update");
        jButton_Update_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Update_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Update_ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Update_, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 80, -1));

        gambar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 16, 100, 120));

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CEO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        labelceo.setForeground(new java.awt.Color(255, 255, 255));
        labelceo.setText("(CEO)");
        jPanel1.add(labelceo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(":");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, -1));

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(":");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 40, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 0, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 220, 70));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // TODO add your handling code here:
        HOME_JFrame mainFrame = (HOME_JFrame) this.getTopLevelAncestor();
        PreparedStatement ps;
        
        String query = "DELETE FROM company WHERE id =" +id;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ps = MyConnection.getConnection().prepareStatement(query);
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Delete successfully!");
            }
            home.tampil();
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
        
        
//        mainFrame.setTextLabel(labelNama.getText());
        
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jButton_Update_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Update_ActionPerformed
        // TODO add your handling code here:
        Update_data up = new Update_data(home, id, platform, ceo, pic);
        up.setLocationRelativeTo(null);
        up.setVisible(true);
    }//GEN-LAST:event_jButton_Update_ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gambar;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Update_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelceo;
    // End of variables declaration//GEN-END:variables
}
