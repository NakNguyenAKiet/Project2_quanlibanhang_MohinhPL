/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrderManagementUI;

import Utils.CustomJButton;
import Utils.CustomJTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JFrame;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

/**
 *
 * @author NGOC BAU
 */
public class EditProductQtyUI extends javax.swing.JFrame {

    /**
     * Creates new form AddProductQtyUI
     */
    CustomJTextField customJTextField = new CustomJTextField();
    CustomJButton customJButton = new CustomJButton();

    public EditProductQtyUI() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("");

        customJTextField.setTextFieldBackgroundColor(Color.WHITE);
        customJTextField.setTextFieldForegroundColor(new Color(30, 39, 46));
        customJTextField.setTextFieldFont("Cambria");
        customJTextField.setTextFieldFontStyle(Font.PLAIN);
        customJTextField.setTextFieldFontSize(13);
        customJTextField.setTextFieldBorderColor(new Color(223, 228, 234));
        customJTextField.setTextFieldBorderWeight(1);
        customJTextField.setTextFieldPadding(5);
        customJTextField.custom(textField_editProdQty_productID);
        
        customJButton.setButtonForegroundColor(Color.WHITE);
        customJButton.setButtonFont("Cambria");
        customJButton.setButtonFontStyle(Font.BOLD);
        customJButton.setButtonFontSize(12);
        customJButton.setButtonBorderColor(Color.WHITE);
        customJButton.setButtonBorderWeight(0);
        customJButton.setButtonBorderRadius(10);
        IconFontSwing.register(FontAwesome.getIconFont());

        customJButton.setButtonBackgroundColor(new Color(125, 95, 255));
        customJButton.custom(button_editProdQty_save);
        
        customJButton.setButtonBackgroundColor(Color.RED);                
        customJButton.custom(button_editProdQty_close);
        
        customJButton.setButtonBackgroundColor(new Color(255, 56, 56));
        Icon iconDeleteProduct = IconFontSwing.buildIcon(FontAwesome.TRASH, 17, Color.WHITE);
        customJButton.setButtonIcon(iconDeleteProduct);
        customJButton.custom(button_editProdQty_delete);
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
        jPanel7 = new javax.swing.JPanel();
        textField_editProdQty_productID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSpinner_editProdQty_qty = new javax.swing.JSpinner();
        button_editProdQty_close = new javax.swing.JButton();
        button_editProdQty_save = new javax.swing.JButton();
        button_editProdQty_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        textField_editProdQty_productID.setEditable(false);
        textField_editProdQty_productID.setBackground(new java.awt.Color(255, 255, 255));
        textField_editProdQty_productID.setText("SP0012");
        textField_editProdQty_productID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        textField_editProdQty_productID.setEnabled(false);
        textField_editProdQty_productID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_editProdQty_productIDActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 64, 198));
        jLabel8.setText("Mã sản phẩm:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField_editProdQty_productID)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 89, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_editProdQty_productID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 64, 198));
        jLabel9.setText("Số lượng sản phẩm:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jSpinner_editProdQty_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner_editProdQty_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        button_editProdQty_close.setText("ĐÓNG");
        button_editProdQty_close.setBorder(null);
        button_editProdQty_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_editProdQty_close.setFocusable(false);
        button_editProdQty_close.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_editProdQty_close.setIconTextGap(5);
        button_editProdQty_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_editProdQty_closeMouseClicked(evt);
            }
        });
        button_editProdQty_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editProdQty_closeActionPerformed(evt);
            }
        });

        button_editProdQty_save.setText("LƯU");
        button_editProdQty_save.setBorder(null);
        button_editProdQty_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_editProdQty_save.setFocusable(false);
        button_editProdQty_save.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_editProdQty_save.setIconTextGap(5);
        button_editProdQty_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editProdQty_saveActionPerformed(evt);
            }
        });

        button_editProdQty_delete.setText("XÓA");
        button_editProdQty_delete.setBorder(null);
        button_editProdQty_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_editProdQty_delete.setFocusable(false);
        button_editProdQty_delete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        button_editProdQty_delete.setIconTextGap(5);
        button_editProdQty_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editProdQty_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(button_editProdQty_save, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_editProdQty_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_editProdQty_close, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_editProdQty_save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editProdQty_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editProdQty_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_editProdQty_productIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_editProdQty_productIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_editProdQty_productIDActionPerformed

    private void button_editProdQty_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editProdQty_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_editProdQty_closeActionPerformed

    private void button_editProdQty_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editProdQty_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_editProdQty_saveActionPerformed

    private void button_editProdQty_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editProdQty_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_editProdQty_deleteActionPerformed

    private void button_editProdQty_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_editProdQty_closeMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_button_editProdQty_closeMouseClicked

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
            java.util.logging.Logger.getLogger(EditProductQtyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProductQtyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProductQtyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProductQtyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new EditProductQtyUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_editProdQty_close;
    private javax.swing.JButton button_editProdQty_delete;
    private javax.swing.JButton button_editProdQty_save;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSpinner jSpinner_editProdQty_qty;
    private javax.swing.JTextField textField_editProdQty_productID;
    // End of variables declaration//GEN-END:variables
}