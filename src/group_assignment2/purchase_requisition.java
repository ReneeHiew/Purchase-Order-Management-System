/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group_assignment2;

import group_assignment2.item_entry;
import group_assignment2.PurchaseRequisition;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AVITA
 */
public class purchase_requisition extends javax.swing.JFrame {
    private DefaultTableModel prModel = new DefaultTableModel();
    private String[] prColumns = {"PR ID","Item ID","Quantity","Needed By","Supplier ID","User ID"};
    private String itemEntryFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\itemEntry.txt";
    private String prFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\purchaseRequisition.txt";
    private String prTempFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\tempPurchaseRequisition.txt";
    private String header = "PR ID , Item ID , Quantity , Needed By , Supplier ID , User ID created PR";
    private String [] supplierIDs = {};
    private String userID;
    private int row = -1;

    /**
     * Creates new form purchase_requisition
     * @param userID
     */
    public purchase_requisition(String userID) throws FileNotFoundException {
        initComponents();
        prModel.setColumnIdentifiers(prColumns);
        
        this.userID = userID;
        System.out.println(this.userID);
        // get item ID and supplier ID from Item Entry file
        File iefile = new File(itemEntryFilePath);
        Scanner sc = new Scanner(iefile);
        
        if(sc.hasNextLine())sc.nextLine();
        
        while(sc.hasNextLine()){
            String rowItemEntries = sc.nextLine();
            String[] partsItemEntries = rowItemEntries.split("[/]+");
            supplierIDs = Arrays.copyOf(supplierIDs, supplierIDs.length + 1);
            supplierIDs [supplierIDs.length - 1] = partsItemEntries[3];
            cmb_itemID.addItem(partsItemEntries[0]);
        }
        sc.close();
        
        // get data from PR file to show on table
        File prfile = new File (prFilePath);
        Scanner sc2 = new Scanner(prfile);
        
        if(sc2.hasNextLine())sc2.nextLine();
        
        while(sc2.hasNextLine()){
            String rowPR = sc2.nextLine();
            String[] partsPR = rowPR.split("[/]+");
            prModel.addRow(partsPR);
        }
        sc2.close();
    }

    private purchase_requisition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompany = new javax.swing.JLabel();
        lbl_purchaseRequisition = new javax.swing.JLabel();
        cmb_itemID = new javax.swing.JComboBox<>();
        sld_quantity = new javax.swing.JSlider();
        txt_date = new javax.swing.JTextField();
        lbl_itemID = new javax.swing.JLabel();
        lbl_quantity = new javax.swing.JLabel();
        lbl_neededBy = new javax.swing.JLabel();
        lbl_supplierID = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_prAdd = new javax.swing.JButton();
        btn_prEdit = new javax.swing.JButton();
        btn_prDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_pr = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_outSupplierID = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();
        lblCompany1 = new javax.swing.JLabel();

        lblCompany.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCompany.setText("SIGMA SDN BHD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_purchaseRequisition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_purchaseRequisition.setText("Purchase Requisition");

        cmb_itemID.setMaximumRowCount(20);
        cmb_itemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_itemIDActionPerformed(evt);
            }
        });

        sld_quantity.setMajorTickSpacing(10);
        sld_quantity.setMinimum(10);
        sld_quantity.setMinorTickSpacing(5);
        sld_quantity.setPaintLabels(true);
        sld_quantity.setPaintTicks(true);
        sld_quantity.setSnapToTicks(true);

        lbl_itemID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_itemID.setText("Item ID:");

        lbl_quantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_quantity.setText("Quantity:");

        lbl_neededBy.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_neededBy.setText("Needed By:");

        lbl_supplierID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_supplierID.setText("Supplier ID:");

        btn_prAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_prAdd.setText("Add");
        btn_prAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prAddActionPerformed(evt);
            }
        });

        btn_prEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_prEdit.setText("Edit");
        btn_prEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prEditActionPerformed(evt);
            }
        });

        btn_prDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_prDelete.setText("Delete");
        btn_prDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prDeleteActionPerformed(evt);
            }
        });

        tbl_pr.setModel(prModel);
        tbl_pr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_prMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_pr);

        lbl_outSupplierID.setText("-supplier ID-");

        btnMainMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        lblCompany1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCompany1.setText("SIGMA SDN BHD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_prAdd)
                                        .addGap(44, 44, 44)
                                        .addComponent(btn_prEdit)
                                        .addGap(46, 46, 46)
                                        .addComponent(btn_prDelete))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_supplierID)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lbl_itemID)
                                                    .addComponent(lbl_quantity)))
                                            .addComponent(lbl_neededBy, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmb_itemID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sld_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lbl_outSupplierID)
                                                    .addGap(3, 3, 3)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                                                .addComponent(txt_date))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCompany1)
                                            .addComponent(lbl_purchaseRequisition))
                                        .addGap(107, 107, 107))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMainMenu)
                                .addGap(108, 316, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMainMenu)
                            .addComponent(lblCompany1))
                        .addGap(2, 2, 2)
                        .addComponent(lbl_purchaseRequisition)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_itemID)
                            .addComponent(cmb_itemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbl_quantity)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sld_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_neededBy, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_supplierID)
                            .addComponent(jLabel1)
                            .addComponent(lbl_outSupplierID))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prAdd)
                    .addComponent(btn_prEdit)
                    .addComponent(btn_prDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prAddActionPerformed
        // TODO add your handling code here:  
        String itemID = (String)cmb_itemID.getSelectedItem();
        int quantity = sld_quantity.getValue();
        String neededBy = txt_date.getText();
        String supplierID = lbl_outSupplierID.getText();
        String prID;
        
        if(row>-1){
            JOptionPane.showMessageDialog(null, "Data already exist.");
            tbl_pr.getSelectionModel().clearSelection();
            row = -1;
            
            txt_date.setText("");
        }
        else if("".equals(neededBy)){
            JOptionPane.showMessageDialog(null, "Please fill in every criteria.");
        }
        else{

            try {
                PurchaseRequisition pr = new PurchaseRequisition();
                pr.generate_prID();
                prID = pr.getprID();
                
                String[] newPR = {prID,itemID,Integer.toString(quantity),neededBy,supplierID,userID};
                prModel.addRow(newPR);
                
                txt_date.setText("");
                
                PurchaseRequisition add = new PurchaseRequisition(newPR, prFilePath);
                add.add();
            } catch (IOException ex) {
                Logger.getLogger(purchase_requisition.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_prAddActionPerformed

    private void btn_prEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prEditActionPerformed
        // TODO add your handling code here:
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Please select a row.");

        }
        else{
            String itemID = (String)cmb_itemID.getSelectedItem();
            int quantity = sld_quantity.getValue();
            String neededBy = txt_date.getText();
            String supplierID = lbl_outSupplierID.getText();
            String prID = String.valueOf(prModel.getValueAt(row, 0));
            
            String[] newPR = {prID,itemID,Integer.toString(quantity),neededBy,supplierID,userID};
            
            prModel.setValueAt(prID, row, 0);
            prModel.setValueAt(itemID, row, 1);
            prModel.setValueAt(quantity, row, 2);
            prModel.setValueAt(neededBy, row, 3);
            prModel.setValueAt(supplierID, row, 4);
            
            PurchaseRequisition edit = new PurchaseRequisition(row, newPR, prFilePath, prTempFilePath, header);
            try {
                if (edit.edit()) JOptionPane.showMessageDialog(null, "Changes Made Saved.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(item_entry.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(item_entry.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            tbl_pr.getSelectionModel().clearSelection();
            txt_date.setText("");
            row = -1;
        }
    }//GEN-LAST:event_btn_prEditActionPerformed

    private void btn_prDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prDeleteActionPerformed
        // TODO add your handling code here:
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
        else{
            prModel.removeRow(row);
            tbl_pr.getSelectionModel().clearSelection();
            
            txt_date.setText("");
            
            PurchaseRequisition dlt = new PurchaseRequisition(row, prFilePath, prTempFilePath, header);
            try {
                if (dlt.delete()){
                    JOptionPane.showMessageDialog(null, "Row Deleted.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error Deleting Selected Row");
                }
            } catch (IOException ex) {
                Logger.getLogger(purchase_requisition.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            row = -1;   
        }
    }//GEN-LAST:event_btn_prDeleteActionPerformed

    private void cmb_itemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_itemIDActionPerformed
        // TODO add your handling code here:
        int selectedItemIDIndex = cmb_itemID.getSelectedIndex();
        lbl_outSupplierID.setText(supplierIDs[selectedItemIDIndex]);
        
    }//GEN-LAST:event_cmb_itemIDActionPerformed

    private void tbl_prMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_prMouseReleased
        // TODO add your handling code here:
        row = tbl_pr.getSelectedRow();
        String itemID = String.valueOf(prModel.getValueAt(row, 1));
        String quantity = String.valueOf(prModel.getValueAt(row, 2));
        String date = String.valueOf(prModel.getValueAt(row, 3));
        String supplierID = String.valueOf(prModel.getValueAt(row, 4));
        
        cmb_itemID.setSelectedItem(itemID);
        sld_quantity.setValue(Integer.parseInt(quantity));
        txt_date.setText(date);
        lbl_outSupplierID.setText(supplierID);
    }//GEN-LAST:event_tbl_prMouseReleased

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        new SM_MainPage(userID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(purchase_requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase_requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase_requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase_requisition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase_requisition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btn_prAdd;
    private javax.swing.JButton btn_prDelete;
    private javax.swing.JButton btn_prEdit;
    private javax.swing.JComboBox<String> cmb_itemID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblCompany1;
    private javax.swing.JLabel lbl_itemID;
    private javax.swing.JLabel lbl_neededBy;
    private javax.swing.JLabel lbl_outSupplierID;
    private javax.swing.JLabel lbl_purchaseRequisition;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_supplierID;
    private javax.swing.JSlider sld_quantity;
    private javax.swing.JTable tbl_pr;
    private javax.swing.JTextField txt_date;
    // End of variables declaration//GEN-END:variables
}
