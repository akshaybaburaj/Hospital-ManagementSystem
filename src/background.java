/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshay Baburaj
 */
public class background extends javax.swing.JFrame {

    /**
     * Creates new form background
     */
    public background() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        loginbutton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        username2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        loginbutton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(250, 250, 250));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Hospital Management System");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("     USER LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 140, -1));

        loginbutton.setBackground(new java.awt.Color(51, 255, 51));
        loginbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Akshay Baburaj\\Documents\\NetBeansProjects\\Hospital Management System\\src\\hmis.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setBackground(new java.awt.Color(250, 250, 250));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Hospital Management System");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("     USER LOGIN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("User Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        username1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        getContentPane().add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        getContentPane().add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        loginbutton1.setBackground(new java.awt.Color(51, 255, 51));
        loginbutton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginbutton1.setText("Login");
        loginbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel10.setBackground(new java.awt.Color(250, 250, 250));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Hospital Management System");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("     USER LOGIN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("User Name");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        username2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username2ActionPerformed(evt);
            }
        });
        getContentPane().add(username2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Password");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2ActionPerformed(evt);
            }
        });
        getContentPane().add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        loginbutton2.setBackground(new java.awt.Color(51, 255, 51));
        loginbutton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginbutton2.setText("Login");
        loginbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutton2ActionPerformed(evt);
            }
        });
        getContentPane().add(loginbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        String user=username.getText();
        String pwd=password.getText();
        if(user.equals("akshay")&& pwd.equals("akshay123"))
        {
            JOptionPane.showMessageDialog(null,"Login Successful");
            SelectOption so= new SelectOption();
            so.setVisible(true);
        }
        else
        {JOptionPane.showMessageDialog(null,"Incorrect Username or Password !!!");
        }
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed

    }//GEN-LAST:event_username1ActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void loginbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton1ActionPerformed
        String user=username.getText();
        String pwd=password.getText();
        if(user.equals("akshay")&& pwd.equals("akshay123"))
        {
            JOptionPane.showMessageDialog(null,"Login Successful");
            SelectOption so= new SelectOption();
            so.setVisible(true);
        }
        else
        {JOptionPane.showMessageDialog(null,"Incorrect Username or Password !!!");
        }
    }//GEN-LAST:event_loginbutton1ActionPerformed

    private void username2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username2ActionPerformed

    }//GEN-LAST:event_username2ActionPerformed

    private void password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2ActionPerformed

    private void loginbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutton2ActionPerformed
        String user=username.getText();
        String pwd=password.getText();
        if(user.equals("akshay")&& pwd.equals("akshay123"))
        {
            JOptionPane.showMessageDialog(null,"Login Successful");
            SelectOption so= new SelectOption();
            so.setVisible(true);
        }
        else
        {JOptionPane.showMessageDialog(null,"Incorrect Username or Password !!!");
        }
    }//GEN-LAST:event_loginbutton2ActionPerformed

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
            java.util.logging.Logger.getLogger(background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(background.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new background().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton loginbutton1;
    private javax.swing.JButton loginbutton2;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField username;
    private javax.swing.JTextField username1;
    private javax.swing.JTextField username2;
    // End of variables declaration//GEN-END:variables
}
