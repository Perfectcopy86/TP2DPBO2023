/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tp2;

import com.mysql.cj.jdbc.Blob;
import java.awt.GridLayout;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rasyid andriansyah
 */
public class USER_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form HOME_JFrame
     */
    public USER_JFrame()  {
        initComponents();
        setTitle("HOME : User");
        tampil();
    }
    
//    public void setPanel() {
//        mainPanel.removeAll();
//        mainPanel.setLayout(new GridLayout(0, 1));
//        mainPanel.add(new Card(1, "Cahya"));
//        mainPanel.add(new Card(2, "Satria"));
//        mainPanel.add(new Card(3, "Nelly"));
//        mainPanel.add(new Card(4, "Sekar"));
//        
//        
//        mainPanel.revalidate();
//        mainPanel.repaint();
//    }
//    
    public void tampil() 
    {
        PreparedStatement ps;
        ResultSet rs;
        
        String query = "SELECT * FROM `user`";
        mainPanel.removeAll();
        mainPanel.setLayout(new GridLayout(0, 1));
        try{
            ps = MyConnection.getConnection().prepareStatement(query);
            
//            ps.setString(1, uname);
//            ps.setString(2, pass);
            
            rs = ps.executeQuery();

            while(rs.next())
            {   
                String platform = rs.getString("username");
                String ceo = rs.getString("platform");
                int id = rs.getInt("id");
                byte[] pic = rs.getBytes("pic"); 
                mainPanel.add(new Card_User(this,id, platform,ceo,pic));
            }

            
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        mainPanel.revalidate();
        mainPanel.repaint();
            
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Greeting = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Insert_ = new javax.swing.JButton();
        jButton_User_List_ = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        Greeting.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        Greeting.setForeground(new java.awt.Color(255, 255, 255));
        Greeting.setText("Selamat Datang");
        getContentPane().add(Greeting, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0,80));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        mainPanel.setBackground(new java.awt.Color(0, 0, 0, 80));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(mainPanel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 460, 400));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0,80));

        jButton_Insert_.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Insert_.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton_Insert_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Insert_.setText("Insert Data");
        jButton_Insert_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Insert_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Insert_ActionPerformed(evt);
            }
        });

        jButton_User_List_.setBackground(new java.awt.Color(0, 0, 0));
        jButton_User_List_.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton_User_List_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_User_List_.setText("User List");
        jButton_User_List_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_User_List_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_User_List_ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Platform List");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton_User_List_)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jButton_Insert_)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Insert_)
                    .addComponent(jButton_User_List_)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 410, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rasyid andriansyah\\Downloads\\abb.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_User_List_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_User_List_ActionPerformed
        // TODO add your handling code here:
        USER_JFrame user = new USER_JFrame();
        user.setVisible(true);
        this.setVisible(false);
        user.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_User_List_ActionPerformed

    private void jButton_Insert_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Insert_ActionPerformed
        // TODO add your handling code here:
        Insert_user ins = new Insert_user(this);
        ins.setVisible(true);
        ins.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_Insert_ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        HOME_JFrame home = new HOME_JFrame();
        home.setVisible(true);
        this.setVisible(false);
        home.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(USER_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USER_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USER_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USER_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USER_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Greeting;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Insert_;
    private javax.swing.JButton jButton_User_List_;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
