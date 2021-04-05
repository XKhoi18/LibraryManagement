/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8librarymanagement.gui;

import g8librarymanagement.dao.employee_listDAO;
import g8librarymanagement.model.employee_list;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import javax.swing.JOptionPane;
//import javax.swing.SwingUtilities;

/**
 *
 * @author Admin
 */
public class JFramelogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public JFramelogin() {
        initComponents();
        this.setMinimumSize(new Dimension(800, 670));
    }

    public void login() {
        employee_listDAO emDAO=new employee_listDAO();
        String user,pass;
        user=txt_username.getText();
        pass=txt_password.getText(); //pass field convert to string
        employee_list rs=emDAO.findemployee_listByUserPass(user, pass);
        if(user.length()==0){
            JOptionPane.showMessageDialog(null, "Please input username!");
        } else if(pass.length()==0) {
            JOptionPane.showMessageDialog(null, "Please input password!");
        } else if (rs==null) {
            JOptionPane.showMessageDialog(null, "Log in failed!");
        } else {             
            JFramemain jfm = new JFramemain();
            jfm.setVisible(true);
            this.dispose();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        but_login = new javax.swing.JButton();
        but_reset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 150, 270, 80);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 55)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Management System");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 220, 490, 63);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 300, 90, 20);

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        txt_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usernameKeyPressed(evt);
            }
        });
        getContentPane().add(txt_username);
        txt_username.setBounds(320, 290, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(220, 350, 90, 20);

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        getContentPane().add(txt_password);
        txt_password.setBounds(320, 350, 220, 30);

        but_login.setBackground(new java.awt.Color(204, 204, 204));
        but_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_login.setText("Log in");
        but_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_loginActionPerformed(evt);
            }
        });
        but_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                but_loginKeyPressed(evt);
            }
        });
        getContentPane().add(but_login);
        but_login.setBounds(300, 400, 90, 30);

        but_reset.setBackground(new java.awt.Color(204, 204, 204));
        but_reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_reset.setText("Reset");
        but_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_resetActionPerformed(evt);
            }
        });
        getContentPane().add(but_reset);
        but_reset.setBounds(440, 400, 90, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 790, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_resetActionPerformed
        // TODO add your handling code here:
        txt_username.setText("");
        txt_password.setText("");
    }//GEN-LAST:event_but_resetActionPerformed

    private void but_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_loginActionPerformed
    login();    
    }//GEN-LAST:event_but_loginActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void but_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_but_loginKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_but_loginKeyPressed

    private void txt_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usernameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txt_usernameKeyPressed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(JFramelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramelogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramelogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_login;
    private javax.swing.JButton but_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

}