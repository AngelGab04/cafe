/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import config.DBconnector;
import config.PasswordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Rhai
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
    }
    
    
    Color hovbtn = new Color(212,179,127);
    Color defbtn = new Color(126,120,240);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_pnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Login_pnl = new javax.swing.JPanel();
        minimize_btn = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        logemail_inp = new javax.swing.JTextField();
        logpass_inp = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JPanel();
        login_lbl = new javax.swing.JLabel();
        register_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Apprhai_ico = new javax.swing.JLabel();
        BG_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BG_pnl.setPreferredSize(new java.awt.Dimension(850, 550));
        BG_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAFE MANAGEMENT SYSTEM");
        BG_pnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 390, -1));

        Login_pnl.setBackground(new java.awt.Color(204, 202, 240));
        Login_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize_btn.setText("—");
        minimize_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_btnMouseClicked(evt);
            }
        });
        Login_pnl.add(minimize_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        close_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_btn.setText("X");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });
        Login_pnl.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, 30));

        logemail_inp.setBackground(new java.awt.Color(212, 179, 127));
        logemail_inp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logemail_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        Login_pnl.add(logemail_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 320, 70));

        logpass_inp.setBackground(new java.awt.Color(212, 179, 127));
        logpass_inp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logpass_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        logpass_inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logpass_inpActionPerformed(evt);
            }
        });
        Login_pnl.add(logpass_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 320, 70));

        login_btn.setBackground(new java.awt.Color(126, 120, 240));
        login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_btnMouseExited(evt);
            }
        });

        login_lbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        login_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_lbl.setText("LOG IN");

        javax.swing.GroupLayout login_btnLayout = new javax.swing.GroupLayout(login_btn);
        login_btn.setLayout(login_btnLayout);
        login_btnLayout.setHorizontalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        login_btnLayout.setVerticalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(login_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Login_pnl.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 180, 50));

        register_lbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        register_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_lbl.setText("New User? Click Here to Register");
        register_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_lblMouseClicked(evt);
            }
        });
        Login_pnl.add(register_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 460, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        Login_pnl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, -290, -1, -1));

        BG_pnl.add(Login_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 460, 550));

        Apprhai_ico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apprhai_ico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/caffee.png"))); // NOI18N
        BG_pnl.add(Apprhai_ico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 550));

        BG_img.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BG_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/full backg.jpg"))); // NOI18N
        BG_pnl.add(BG_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimize_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_btnMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimize_btnMouseClicked

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_close_btnMouseClicked

    private void login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseClicked
            
            String email = logemail_inp.getText().toString();
            String pass = logpass_inp.getText().toString();
            if(logemail_inp.getText().isEmpty() || logpass_inp.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "All Fields are Required!");
            }else{
            try {
                   String rehashedPassword;
                   String hashedpass;
                DBconnector dbc = new DBconnector();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE user_email = '"+email+"'");
                    if(rs.next()){
                        hashedpass = rs.getString("user_pass");
                         rehashedPassword = PasswordHasher.hashPassword(pass);
                        if(email.equals(rs.getString("user_email")) && hashedpass.equals(rehashedPassword)){
                            JOptionPane.showMessageDialog(null, "Success!");
                            DashboardFrame df = new DashboardFrame();
                            this.dispose();
                            df.setVisible(true);
                        }else{
                            JOptionPane.showMessageDialog(null, "Invalid Account!");
                            logpass_inp.setText("");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Account not Found!");
                        System.out.println("No data Found");
                    }
            } catch (NoSuchAlgorithmException | SQLException ex) {
                System.out.println(""+ ex);
            }
            }
    }//GEN-LAST:event_login_btnMouseClicked

    private void login_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseEntered
        login_btn.setBackground(hovbtn);
    }//GEN-LAST:event_login_btnMouseEntered

    private void login_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_btnMouseExited
        login_btn.setBackground(defbtn);
    }//GEN-LAST:event_login_btnMouseExited

    private void register_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_lblMouseClicked
       RegisterFrame rf = new RegisterFrame();
       rf.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_register_lblMouseClicked

    private void logpass_inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logpass_inpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logpass_inpActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apprhai_ico;
    private javax.swing.JLabel BG_img;
    private javax.swing.JPanel BG_pnl;
    private javax.swing.JPanel Login_pnl;
    private javax.swing.JLabel close_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField logemail_inp;
    private javax.swing.JPanel login_btn;
    private javax.swing.JLabel login_lbl;
    private javax.swing.JPasswordField logpass_inp;
    private javax.swing.JLabel minimize_btn;
    private javax.swing.JLabel register_lbl;
    // End of variables declaration//GEN-END:variables
}
