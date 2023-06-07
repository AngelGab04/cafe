/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import InternalPages.OrderItem;
import config.DBconnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Rhai
 */
public class OrderItemFrame extends javax.swing.JFrame {
Connection con;
    /**
     * Creates new form CustomerFrame
     */
    public OrderItemFrame() {
        initComponents();
        orderreport();
    }
    
    
    
    Color hovbtn = new Color(212,179,127);
    Color defbtn = new Color(126,120,240);
    
    public String action;
    
    public void close(){
        this.dispose();
        DashboardFrame df = new DashboardFrame();
        df.setVisible(true);
        OrderItem up = new OrderItem();
        df.desk_pnl.add(up).setVisible(true);
    }
   public void orderreport(){

 ORPT.setText("*****************************************************\n");
 ORPT.setText(ORPT.getText()+"-------------------ORDER ITEM REPORT--------------------\n");
 ORPT.setText(ORPT.getText()+"*******************************************************\n");
 
 Date date = new Date();  // or replace with your own date object

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Replace with your desired format
        String formattedDate = dateFormat.format(date);
 

  ORPT.setText(ORPT.getText()+"\nDATE: "+formattedDate+"\n");
 ORPT.setText(ORPT.getText()+"\nORDER ITEM ID:\t"+orderitemid_inp.getText()+"\n");
 ORPT.setText(ORPT.getText()+"\nORDER ID:\t"+ orderidf_inp.getText()+"\n");
 ORPT.setText(ORPT.getText()+"\nPRODUCT ID:\t"+ prodidf_inp.getText()+"\n");
 ORPT.setText(ORPT.getText()+"\nQUANTITY:\t"+ orderitemquantity_inp.getText()+"\n");
ORPT.setText(ORPT.getText()+"\nUNIT PRICE:\t"+ orderitemunit_inp.getText()+"\n");
 }
    //print
 public void print(){
 
     try {
         ORPT.print();
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "print failed"+e);
     }
 }
 
 
  private void getprod(){
 int prodid= Integer.parseInt(orderidf_inp.getText());
 try{
  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");
  PreparedStatement pst = con.prepareStatement("SELECT * FROM tbl_product where product_id =?");
  
  pst.setInt(1, prodid);
  ResultSet rs = pst.executeQuery();
    if(rs.next()){
  orderitemquantity_inp.setText(rs.getString("quantity"));
  orderitemunit_inp.setText(rs.getString("price"));
    }
 }catch (SQLException ex){
 ex.printStackTrace();
 
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

        BG_pnl = new javax.swing.JPanel();
        orderitemid_inp = new javax.swing.JTextField();
        orderidf_inp = new javax.swing.JTextField();
        prodidf_inp = new javax.swing.JTextField();
        orderitemquantity_inp = new javax.swing.JTextField();
        orderitemunit_inp = new javax.swing.JTextField();
        action_btn = new javax.swing.JPanel();
        action_lbl = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ORPT = new javax.swing.JTextArea();
        generate = new javax.swing.JPanel();
        action_lbl1 = new javax.swing.JLabel();
        PRINT = new javax.swing.JPanel();
        action_lbl2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BG_pnl.setBackground(new java.awt.Color(204, 202, 240));
        BG_pnl.setPreferredSize(new java.awt.Dimension(425, 550));
        BG_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orderitemid_inp.setBackground(new java.awt.Color(212, 179, 127));
        orderitemid_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        orderitemid_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Order Item ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(orderitemid_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 320, 50));

        orderidf_inp.setBackground(new java.awt.Color(212, 179, 127));
        orderidf_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        orderidf_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Order ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(orderidf_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 50));

        prodidf_inp.setBackground(new java.awt.Color(212, 179, 127));
        prodidf_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        prodidf_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Product ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        prodidf_inp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                prodidf_inpFocusLost(evt);
            }
        });
        BG_pnl.add(prodidf_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 320, 50));

        orderitemquantity_inp.setBackground(new java.awt.Color(212, 179, 127));
        orderitemquantity_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        orderitemquantity_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Quantity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        orderitemquantity_inp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orderitemquantity_inpKeyTyped(evt);
            }
        });
        BG_pnl.add(orderitemquantity_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, 50));

        orderitemunit_inp.setBackground(new java.awt.Color(212, 179, 127));
        orderitemunit_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        orderitemunit_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Unit Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        orderitemunit_inp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orderitemunit_inpKeyTyped(evt);
            }
        });
        BG_pnl.add(orderitemunit_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 320, 50));

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

        BG_pnl.add(action_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 200, 50));

        close_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_btn.setText("X");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });
        BG_pnl.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 30, 30));

        ORPT.setColumns(20);
        ORPT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        ORPT.setRows(5);
        jScrollPane1.setViewportView(ORPT);

        BG_pnl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 310, 380));

        generate.setBackground(new java.awt.Color(126, 120, 240));
        generate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        generate.setPreferredSize(new java.awt.Dimension(100, 35));
        generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generateMouseExited(evt);
            }
        });

        action_lbl1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        action_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        action_lbl1.setText("GENERATE REPORT");
        action_lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                action_lbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout generateLayout = new javax.swing.GroupLayout(generate);
        generate.setLayout(generateLayout);
        generateLayout.setHorizontalGroup(
            generateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(action_lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        generateLayout.setVerticalGroup(
            generateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generateLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(action_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG_pnl.add(generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 190, 50));

        PRINT.setBackground(new java.awt.Color(126, 120, 240));
        PRINT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PRINT.setPreferredSize(new java.awt.Dimension(100, 35));
        PRINT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PRINTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PRINTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PRINTMouseExited(evt);
            }
        });

        action_lbl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        action_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        action_lbl2.setText("PRINT");
        action_lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                action_lbl2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PRINTLayout = new javax.swing.GroupLayout(PRINT);
        PRINT.setLayout(PRINTLayout);
        PRINTLayout.setHorizontalGroup(
            PRINTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(action_lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        PRINTLayout.setVerticalGroup(
            PRINTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PRINTLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(action_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG_pnl.add(PRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/a1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        BG_pnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            
            try{
                DBconnector dbc = new DBconnector();
                Connection con = dbc.connect_db();
                String sql = "INSERT INTO tbl_order_item (order_id, product_id, quantity, unit_price) VALUES (?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, orderidf_inp.getText());
                pst.setString(2, prodidf_inp.getText());
                pst.setString(3, orderitemquantity_inp.getText());
                pst.setString(4, orderitemunit_inp.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Updated!");
                
                close();

            }catch(Exception e){
                System.out.println(e);
            }

        }else if(action.equals("Update")){
                
                DBconnector dbc = new DBconnector();
                dbc.updateData("UPDATE tbl_order_item SET order_id = '"+orderidf_inp.getText()+"', product_id = '"+prodidf_inp.getText()+"', quantity = '"+orderitemquantity_inp.getText()+"', "
                                         + "unit_price = '"+orderitemunit_inp.getText()+"'"+ "WHERE order_item_id = '"+orderitemid_inp.getText()+"'");
                close();
        }else{
            JOptionPane.showMessageDialog(null, "No action selected!");
            close();
        }
        
    }//GEN-LAST:event_action_btnMouseClicked

    private void orderitemunit_inpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderitemunit_inpKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_orderitemunit_inpKeyTyped

    private void orderitemquantity_inpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderitemquantity_inpKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_orderitemquantity_inpKeyTyped

    private void action_lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_lbl1MouseClicked
        orderreport();
    }//GEN-LAST:event_action_lbl1MouseClicked

    private void generateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseClicked
        orderreport();
    }//GEN-LAST:event_generateMouseClicked

    private void generateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_generateMouseEntered

    private void generateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_generateMouseExited

    private void action_lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_lbl2MouseClicked
        print();
    }//GEN-LAST:event_action_lbl2MouseClicked

    private void PRINTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINTMouseClicked
        print();
    }//GEN-LAST:event_PRINTMouseClicked

    private void PRINTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINTMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PRINTMouseEntered

    private void PRINTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PRINTMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PRINTMouseExited

    private void prodidf_inpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prodidf_inpFocusLost
      getprod();
    }//GEN-LAST:event_prodidf_inpFocusLost

        
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
            java.util.logging.Logger.getLogger(OrderItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderItemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new OrderItemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_pnl;
    private javax.swing.JTextArea ORPT;
    private javax.swing.JPanel PRINT;
    private javax.swing.JPanel action_btn;
    public javax.swing.JLabel action_lbl;
    public javax.swing.JLabel action_lbl1;
    public javax.swing.JLabel action_lbl2;
    private javax.swing.JLabel close_btn;
    private javax.swing.JPanel generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField orderidf_inp;
    public javax.swing.JTextField orderitemid_inp;
    public javax.swing.JTextField orderitemquantity_inp;
    public javax.swing.JTextField orderitemunit_inp;
    public javax.swing.JTextField prodidf_inp;
    // End of variables declaration//GEN-END:variables
}
