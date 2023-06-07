/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import InternalPages.Product;
import config.DBconnector;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rhai
 */
public class ProductFrame extends javax.swing.JFrame {

    /**
     * Creates new form CustomerFrame
     */
    public ProductFrame() {
        initComponents();
    }
    
    Color hovbtn = new Color(69,60,240);
    Color defbtn = new Color(126,120,240);
    
    public String action;
    
    public void close(){
        this.dispose();
        DashboardFrame df = new DashboardFrame();
        df.setVisible(true);
        Product up = new Product();
        df.desk_pnl.add(up).setVisible(true);
    }

     public String destination = "";
    File selectedFile;
    public String oldpath;
    String path;
    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: ");
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
        public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    
public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/prod_images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
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
        prodid_inp = new javax.swing.JTextField();
        prodname_inp = new javax.swing.JTextField();
        prodprice_inp = new javax.swing.JTextField();
        prodquantity_inp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodscript_inp = new javax.swing.JTextArea();
        choose_btn = new javax.swing.JPanel();
        choose_lbl = new javax.swing.JLabel();
        action_btn = new javax.swing.JPanel();
        action_lbl = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        Image_lbl = new javax.swing.JLabel();
        prodimg_display = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        BG_pnl.setBackground(new java.awt.Color(204, 202, 240));
        BG_pnl.setPreferredSize(new java.awt.Dimension(850, 550));
        BG_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prodid_inp.setEditable(false);
        prodid_inp.setBackground(new java.awt.Color(212, 179, 127));
        prodid_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        prodid_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Product ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(prodid_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 320, 50));

        prodname_inp.setBackground(new java.awt.Color(212, 179, 127));
        prodname_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        prodname_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        BG_pnl.add(prodname_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, 50));

        prodprice_inp.setBackground(new java.awt.Color(212, 179, 127));
        prodprice_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        prodprice_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        prodprice_inp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prodprice_inpKeyTyped(evt);
            }
        });
        BG_pnl.add(prodprice_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 320, 50));

        prodquantity_inp.setBackground(new java.awt.Color(212, 179, 127));
        prodquantity_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        prodquantity_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Quanitity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        prodquantity_inp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prodquantity_inpKeyTyped(evt);
            }
        });
        BG_pnl.add(prodquantity_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 320, 50));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        prodscript_inp.setEditable(false);
        prodscript_inp.setBackground(new java.awt.Color(212, 179, 127));
        prodscript_inp.setColumns(20);
        prodscript_inp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        prodscript_inp.setRows(5);
        prodscript_inp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(prodscript_inp);

        BG_pnl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 320, 170));

        choose_btn.setBackground(new java.awt.Color(212, 179, 127));
        choose_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        choose_btn.setPreferredSize(new java.awt.Dimension(100, 35));
        choose_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choose_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choose_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choose_btnMouseExited(evt);
            }
        });

        choose_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        choose_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choose_lbl.setText("Choose a file...");

        javax.swing.GroupLayout choose_btnLayout = new javax.swing.GroupLayout(choose_btn);
        choose_btn.setLayout(choose_btnLayout);
        choose_btnLayout.setHorizontalGroup(
            choose_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(choose_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        choose_btnLayout.setVerticalGroup(
            choose_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(choose_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        BG_pnl.add(choose_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 200, 50));

        action_btn.setBackground(new java.awt.Color(212, 179, 127));
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
                .addComponent(action_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );
        action_btnLayout.setVerticalGroup(
            action_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, action_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(action_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG_pnl.add(action_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 200, 50));

        close_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close_btn.setText("X");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });
        BG_pnl.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 30, 30));

        Image_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Image_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Image_lbl.setText("Image");
        BG_pnl.add(Image_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 50, 25));

        prodimg_display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        prodimg_display.setPreferredSize(new java.awt.Dimension(150, 150));
        BG_pnl.add(prodimg_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/a1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        BG_pnl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -20, -1, -1));

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

    private void choose_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose_btnMouseClicked
       JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                
                
                
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            prodimg_display.setIcon(ResizeImage(path, null, prodimg_display));
                            System.out.println(""+destination);
                        
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "FILE "+ex);
                    }
                }
    }//GEN-LAST:event_choose_btnMouseClicked

    private void choose_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose_btnMouseEntered
        choose_btn.setBackground(hovbtn);
    }//GEN-LAST:event_choose_btnMouseEntered

    private void choose_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choose_btnMouseExited
        choose_btn.setBackground(defbtn);
    }//GEN-LAST:event_choose_btnMouseExited

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        close();
    }//GEN-LAST:event_close_btnMouseClicked

    private void action_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_btnMouseClicked
        if(action.equals("Add")){
           try{
            DBconnector dbc = new DBconnector();
            Connection con = dbc.connect_db();
            String sql = "INSERT INTO tbl_product (name, description, price, quantity, product_image) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, prodname_inp.getText());
            pst.setString(2, prodscript_inp.getText());
            pst.setString(3, prodprice_inp.getText());
            pst.setString(4, prodquantity_inp.getText());
            pst.setString(5,destination);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            
            close();
            
        }catch(Exception e){
            System.out.println(e);
        }
           
           
       }else if(action.equals("Update")){
          DBconnector dbc = new DBconnector();
           try{
           String sql = "UPDATE tbl_product SET name = ?, description = ?, price = ?, quantity = ?, product_image = ? WHERE  product_id = '"+prodid_inp.getText()+"'";
           PreparedStatement pst = dbc.connect.prepareStatement(sql);
             pst.setString(1, prodname_inp.getText());
            pst.setString(2, prodscript_inp.getText());
            pst.setString(3, prodprice_inp.getText());
            pst.setString(4, prodquantity_inp.getText());
            pst.setString(5,destination);
            pst.execute();
           
           close();

           imageUpdater(oldpath, path);
           
           File existingFile = new File(oldpath);
            if (existingFile.exists()) {
                existingFile.delete();
            }
           
           JOptionPane.showMessageDialog(null, "Successfully Updated!");
           }catch(SQLException e){
              JOptionPane.showMessageDialog(null,e);
           }
       }else{
           JOptionPane.showMessageDialog(null, "No action selected!");
           close();
       }
    }//GEN-LAST:event_action_btnMouseClicked
    
    private void action_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_btnMouseEntered
        action_btn.setBackground(hovbtn);
    }//GEN-LAST:event_action_btnMouseEntered

    private void action_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_action_btnMouseExited
       action_btn.setBackground(defbtn);
    }//GEN-LAST:event_action_btnMouseExited

    private void prodprice_inpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodprice_inpKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_prodprice_inpKeyTyped

    private void prodquantity_inpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodquantity_inpKeyTyped
       char c = evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_prodquantity_inpKeyTyped

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
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_pnl;
    private javax.swing.JLabel Image_lbl;
    private javax.swing.JPanel action_btn;
    public javax.swing.JLabel action_lbl;
    private javax.swing.JPanel choose_btn;
    private javax.swing.JLabel choose_lbl;
    private javax.swing.JLabel close_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField prodid_inp;
    public javax.swing.JLabel prodimg_display;
    public javax.swing.JTextField prodname_inp;
    public javax.swing.JTextField prodprice_inp;
    public javax.swing.JTextField prodquantity_inp;
    public javax.swing.JTextArea prodscript_inp;
    // End of variables declaration//GEN-END:variables
}