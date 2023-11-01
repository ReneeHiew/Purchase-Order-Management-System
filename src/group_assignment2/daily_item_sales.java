/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group_assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AVITA
 */
public class daily_item_sales extends javax.swing.JFrame {
    private DefaultTableModel disModel = new DefaultTableModel();
    private String[] disColumns = {"Item ID","Item Name","Unit Price","Sales Quantity","Sales Total","Date"};
    private String itemEntryFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\itemEntry.txt";
    private String disFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\dailyItemSales.txt";
    private String disTempFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\tempDailyItemSales.txt";
    private String header = "Item ID , Item Name , Unit Price , Sales Quantity , Sales Total , Date";
    private String[] itemNames = {};
    private String[] unitPrices = {};
    private String[] itemQuantity = {};
    private String userID;
    private int row = -1;
    /**
     * Creates new form daily_item_sales
     */
    public daily_item_sales() throws FileNotFoundException  {
        initComponents();
        disModel.setColumnIdentifiers(disColumns);
                
        //Item entry data to display on combo box and labels
        File iefile = new File(itemEntryFilePath);
        Scanner sc = new Scanner(iefile);
        
        if(sc.hasNextLine())sc.nextLine();
        
        while(sc.hasNextLine()){
            String rowItemEntries = sc.nextLine();
            String[] partsItemEntries = rowItemEntries.split("[/]+");
            if(partsItemEntries[4].trim().equals("0")) continue;
            //Get item names from Item Entry
            itemNames = Arrays.copyOf(itemNames, itemNames.length + 1);
            itemNames [itemNames.length - 1] = partsItemEntries[1];
            //Get unit prices from Item Entry
            unitPrices = Arrays.copyOf(unitPrices, unitPrices.length + 1);
            unitPrices [unitPrices.length - 1] = partsItemEntries[2];
            //Get item quantity from Item Entry
            itemQuantity = Arrays.copyOf(itemQuantity, itemQuantity.length + 1);
            itemQuantity [itemQuantity.length - 1] = partsItemEntries[4];
            //Pass all values of item ID to combo box
            cmb_itemID.addItem(partsItemEntries[0]);
        }
        
        Date tdyDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-Y");
        lbl_date.setText(dateFormat.format(tdyDate));
        
        // Data to display on table
        File disfile = new File (disFilePath);
        Scanner sc2 = new Scanner(disfile);
        
        if(sc2.hasNextLine())sc2.nextLine();
        
        while(sc2.hasNextLine()){
            String rowPR = sc2.nextLine();
            String[] partsPR = rowPR.split("[/]+");
            disModel.addRow(partsPR);
        }
        sc2.close();
    }
    
    public daily_item_sales(String userID) throws FileNotFoundException  {
        initComponents();
        disModel.setColumnIdentifiers(disColumns);
        
        this.userID = userID;
        
        //Item entry data to display on combo box and labels
        File iefile = new File(itemEntryFilePath);
        Scanner sc = new Scanner(iefile);
        
        if(sc.hasNextLine())sc.nextLine();
        
        while(sc.hasNextLine()){
            String rowItemEntries = sc.nextLine();
            String[] partsItemEntries = rowItemEntries.split("[/]+");
            if(partsItemEntries[4].trim().equals("0")) continue;
            //Get item names from Item Entry
            itemNames = Arrays.copyOf(itemNames, itemNames.length + 1);
            itemNames [itemNames.length - 1] = partsItemEntries[1];
            //Get unit prices from Item Entry
            unitPrices = Arrays.copyOf(unitPrices, unitPrices.length + 1);
            unitPrices [unitPrices.length - 1] = partsItemEntries[2];
            //Get item quantity from Item Entry
            itemQuantity = Arrays.copyOf(itemQuantity, itemQuantity.length + 1);
            itemQuantity [itemQuantity.length - 1] = partsItemEntries[4];
            //Pass all values of item ID to combo box
            cmb_itemID.addItem(partsItemEntries[0]);
        }
        
        Date tdyDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-Y");
        lbl_date.setText(dateFormat.format(tdyDate));
        
        // Data to display on table
        File disfile = new File (disFilePath);
        Scanner sc2 = new Scanner(disfile);
        
        if(sc2.hasNextLine())sc2.nextLine();
        
        while(sc2.hasNextLine()){
            String rowPR = sc2.nextLine();
            String[] partsPR = rowPR.split("[/]+");
            disModel.addRow(partsPR);
        }
        sc2.close();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmb_itemID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lbl_itemName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_unitPrice = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_salesStock = new javax.swing.JTextField();
        lbl_remainingStock = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_dailyItemSales = new javax.swing.JTable();
        btn_addDailySales = new javax.swing.JButton();
        btn_editDailySales = new javax.swing.JButton();
        btn_dltDailySales = new javax.swing.JButton();
        btn_mainMenu = new javax.swing.JButton();
        lblCompany = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel4.setText("jLabel4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Daily Item-wise Sales Entry");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Item ID:");

        cmb_itemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_itemIDActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Item Name:");

        lbl_itemName.setText("-item_name-");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Unit Price:");

        lbl_unitPrice.setText("-unit_price-");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Stock Sales / Stock Remaining:");

        jLabel9.setText("/");

        lbl_remainingStock.setText("-stock-");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Date:");

        lbl_date.setText("-today_date-");

        tbl_dailyItemSales.setModel(disModel);
        tbl_dailyItemSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_dailyItemSalesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_dailyItemSales);

        btn_addDailySales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_addDailySales.setText("Add");
        btn_addDailySales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addDailySalesActionPerformed(evt);
            }
        });

        btn_editDailySales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_editDailySales.setText("Edit");
        btn_editDailySales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editDailySalesActionPerformed(evt);
            }
        });

        btn_dltDailySales.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dltDailySales.setText("Delete");
        btn_dltDailySales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dltDailySalesActionPerformed(evt);
            }
        });

        btn_mainMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_mainMenu.setText("Main Menu");
        btn_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainMenuActionPerformed(evt);
            }
        });

        lblCompany.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCompany.setText("SIGMA SDN BHD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_mainMenu)
                                .addGap(144, 144, 144)
                                .addComponent(lblCompany))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(196, 196, 196)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_itemName)
                                    .addComponent(cmb_itemID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_unitPrice)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_salesStock, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_remainingStock))
                                    .addComponent(lbl_date))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_addDailySales)
                        .addGap(40, 40, 40)
                        .addComponent(btn_editDailySales)
                        .addGap(47, 47, 47)
                        .addComponent(btn_dltDailySales)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCompany)
                    .addComponent(btn_mainMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_itemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_itemName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_unitPrice))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_salesStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lbl_remainingStock))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbl_date))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addDailySales)
                    .addComponent(btn_editDailySales)
                    .addComponent(btn_dltDailySales))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_itemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_itemIDActionPerformed
        // TODO add your handling code here:
        int selectedItemIDIndex = cmb_itemID.getSelectedIndex();
        lbl_itemName.setText(itemNames[selectedItemIDIndex]);
        lbl_unitPrice.setText(unitPrices[selectedItemIDIndex]);
        lbl_remainingStock.setText(itemQuantity[selectedItemIDIndex]);
    }//GEN-LAST:event_cmb_itemIDActionPerformed

    private void btn_editDailySalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editDailySalesActionPerformed
        // TODO add your handling code here
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Please select a row.");

        }
        else{
            String itemID = (String)cmb_itemID.getSelectedItem();
            String itemName = lbl_itemName.getText();
            String unitPrice = lbl_unitPrice.getText();
            String salesQuantity = txt_salesStock.getText();
            double salesTotal = (Double.parseDouble(unitPrice))*(Integer.parseInt(salesQuantity));
            String date = lbl_date.getText();
            
            String[] newDailySales = {itemID, itemName,unitPrice,salesQuantity,Double.toString(salesTotal),date};
            
            disModel.setValueAt(itemID, row, 0);
            disModel.setValueAt(itemName, row, 1);
            disModel.setValueAt(unitPrice, row, 2);
            disModel.setValueAt(salesQuantity, row, 3);
            disModel.setValueAt(Double.toString(salesTotal), row, 4);
            disModel.setValueAt(date, row, 5);

            
            DailyItemSales edit = new DailyItemSales(row, newDailySales, disFilePath, disTempFilePath, header);
            try {
                if (edit.edit()) JOptionPane.showMessageDialog(null, "Changes Made Saved.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(item_entry.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(item_entry.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            tbl_dailyItemSales.getSelectionModel().clearSelection();
            txt_salesStock.setText("");
            row = -1;
        }
    }//GEN-LAST:event_btn_editDailySalesActionPerformed

    private void btn_dltDailySalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dltDailySalesActionPerformed
        // TODO add your handling code here:
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
        else{
            disModel.removeRow(row);
            tbl_dailyItemSales.getSelectionModel().clearSelection();
            
            txt_salesStock.setText("");
            
            PurchaseRequisition dlt = new PurchaseRequisition(row, disFilePath, disTempFilePath, header);
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
    }//GEN-LAST:event_btn_dltDailySalesActionPerformed

    private void btn_addDailySalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addDailySalesActionPerformed
        // TODO add your handling code here:
        String itemID = (String)cmb_itemID.getSelectedItem();
        String itemName = lbl_itemName.getText();
        String unitPrice = lbl_unitPrice.getText();
        String salesQuantity = txt_salesStock.getText();
        String stockQuantity = lbl_remainingStock.getText();
        double salesTotal = (Double.parseDouble(unitPrice))*(Integer.parseInt(salesQuantity));
        String date = lbl_date.getText();
        
        if(row>-1){
            JOptionPane.showMessageDialog(null, "Data already exist.");
            tbl_dailyItemSales.getSelectionModel().clearSelection();
            row = -1;
            
            txt_salesStock.setText("");
        }
        else if(salesQuantity.equals("") || (Integer.parseInt(salesQuantity)) <= 0 || (Integer.parseInt(salesQuantity)) >  (Integer.parseInt(stockQuantity))){
            JOptionPane.showMessageDialog(null, "Please fill in a proper value.");
        }
        else{

            try {
                String[] newDailySales = {itemID,itemName,unitPrice,salesQuantity,Double.toString(salesTotal),date};
                disModel.addRow(newDailySales);
                
                txt_salesStock.setText("");
                
                DailyItemSales add = new DailyItemSales(newDailySales, disFilePath);
                add.add();
            } catch (IOException ex) {
                Logger.getLogger(daily_item_sales.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_addDailySalesActionPerformed

    private void tbl_dailyItemSalesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dailyItemSalesMouseReleased
        // TODO add your handling code here:
        row = tbl_dailyItemSales.getSelectedRow();
        String itemID = String.valueOf(disModel.getValueAt(row, 0));
        String itemName = String.valueOf(disModel.getValueAt(row, 1));
        String unitPrice = String.valueOf(disModel.getValueAt(row, 2));
        String salesQuantity = String.valueOf(disModel.getValueAt(row, 3));
        
        cmb_itemID.setSelectedItem(itemID);
        lbl_itemName.setText(itemName);
        lbl_unitPrice.setText(unitPrice);  
        txt_salesStock.setText(salesQuantity);



    }//GEN-LAST:event_tbl_dailyItemSalesMouseReleased

    private void btn_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainMenuActionPerformed
        // TODO add your handling code here:
        new SM_MainPage(userID).setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_mainMenuActionPerformed

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
            java.util.logging.Logger.getLogger(daily_item_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daily_item_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daily_item_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daily_item_sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new daily_item_sales().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(daily_item_sales.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addDailySales;
    private javax.swing.JButton btn_dltDailySales;
    private javax.swing.JButton btn_editDailySales;
    private javax.swing.JButton btn_mainMenu;
    private javax.swing.JComboBox<String> cmb_itemID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_itemName;
    private javax.swing.JLabel lbl_remainingStock;
    private javax.swing.JLabel lbl_unitPrice;
    private javax.swing.JTable tbl_dailyItemSales;
    private javax.swing.JTextField txt_salesStock;
    // End of variables declaration//GEN-END:variables

}
