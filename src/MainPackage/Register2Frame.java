/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import InternalPages.Accounts;
import config.DBconnector;
import config.PasswordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;


/**
 *
 * @author Rhai
 */
public class Register2Frame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerFrame
     */
    public Register2Frame() {
        initComponents();
    }
    
    
    Color hovbtn = new Color(69,60,240);
    Color defbtn = new Color(126,120,240);
    
    public String action;
    
    public void close(){
        this.dispose();
        DashboardFrame df = new DashboardFrame();
        df.setVisible(true);
        Accounts up = new Accounts();
        df.desk_pnl.add(up).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_pnl = new javax.swing.JPanel();
        userid_inp = new javax.swing.JTextField();
        userfname_inp = new javax.swing.JTextField();
        userlname_inp = new javax.swing.JTextField();
        useremail_inp = new javax.swing.JTextField();
        useruname_inp = new javax.swing.JTextField();
        userpass_inp = new javax.swing.JTextField();
        action_btn = new javax.swing.JPanel();
        action_lbl = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BG_pnl.setBackground(new java.awt.Color(204, 202, 240));
        BG_pnl.setPreferredSize(new java.awt.Dimension(425, 550));
        BG_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userid_inp.setEditable(false);
        userid_inp.setBackground(new java.awt.Color(212, 179, 127));
        userid_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userid_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "User ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(userid_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 320, 50));

        userfname_inp.setBackground(new java.awt.Color(212, 179, 127));
        userfname_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userfname_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(userfname_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 50));

        userlname_inp.setBackground(new java.awt.Color(212, 179, 127));
        userlname_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userlname_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(userlname_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 320, 50));

        useremail_inp.setBackground(new java.awt.Color(212, 179, 127));
        useremail_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        useremail_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(useremail_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, 50));

        useruname_inp.setBackground(new java.awt.Color(212, 179, 127));
        useruname_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        useruname_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(useruname_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 320, 50));

        userpass_inp.setBackground(new java.awt.Color(212, 179, 127));
        userpass_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userpass_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(userpass_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 320, 50));

        action_btn.setBackground(new java.awt.Color(126, 120, 240));
        action_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        action_btn.setPreferredSize(new java.awt.Dimension(100, 35));
        action_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                action_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                action_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                action_btnMouseExited(evt);
            }
        });

        action_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        action_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout action_btnLayout = new javax.swing.GroupLayout(action_btn);
        action_btn.setLayout(action_btnLayout);
        action_btnLayout.setHorizontalGroup(
            action_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, action_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(action_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        action_btnLayout.setVerticalGroup(
            action_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, action_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(action_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG_pnl.add(action_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 200, 50));

        close_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_btn.setText("X");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });
        BG_pnl.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/bg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        BG_pnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, -390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        close();
    }//GEN-LAST:event_close_btnMouseClicked

    private void action_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_btnMouseExited
        action_btn.setBackground(defbtn);
    }//GEN-LAST:event_action_btnMouseExited

    private void action_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_btnMouseEntered
        action_btn.setBackground(hovbtn);
    }//GEN-LAST:event_action_btnMouseEntered

    private void action_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_btnMouseClicked
        if(action.equals("Add")){
            
                String pass;
                try {
                pass = PasswordHasher.hashPassword(userpass_inp.getText());
          
        
            DBconnector dbc = new DBconnector();
            int result = dbc.insertData("INSERT INTO tbl_user (user_fname, user_lname, user_email, user_uname, user_pass) "
                    + "VALUES ('"+userfname_inp.getText()+"', '"+userlname_inp.getText()+"', '"+useremail_inp.getText()+"', '"+useruname_inp.getText()+"', '"+pass+"')");
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Successfully Registered!");
                close();
                               
            }
            else{
                 System.out.println("Saving Data Failed!");
            }
              } catch (NoSuchAlgorithmException ex) {
                System.out.println(""+ex);
            }

        }else if(action.equals("Update")){
            
                String pass;
                try {
                    
                pass = PasswordHasher.hashPassword(userpass_inp.getText());
                
                DBconnector dbc = new DBconnector();
                dbc.updateData("UPDATE tbl_user SET user_fname = '"+userfname_inp.getText()+"', user_lname = '"+userlname_inp.getText()+"', user_uname = '"+useruname_inp.getText()+"', user_email = '"+useremail_inp.getText()+"', "
                                         + "user_pass = '"+pass+"'"+ "WHERE user_id = '"+userid_inp.getText()+"'");
                close();
                
                } catch (NoSuchAlgorithmException ex) {
                System.out.println(""+ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No action selected!");
            close();
        }
        
    }//GEN-LAST:event_action_btnMouseClicked

        
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
            java.util.logging.Logger.getLogger(Register2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register2Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Register2Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_pnl;
    private javax.swing.JPanel action_btn;
    public javax.swing.JLabel action_lbl;
    private javax.swing.JLabel close_btn;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JTextField useremail_inp;
    public javax.swing.JTextField userfname_inp;
    public javax.swing.JTextField userid_inp;
    public javax.swing.JTextField userlname_inp;
    public javax.swing.JTextField userpass_inp;
    public javax.swing.JTextField useruname_inp;
    // End of variables declaration//GEN-END:variables
}
