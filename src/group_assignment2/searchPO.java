/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renee Hiew
 */
public class searchPO {
    
    public static void searchPurchaseOrder(DefaultTableModel model, String searchPO) {
       boolean exists = false;
       String filepath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\purchaseOrder.txt";

       if (searchPO.isEmpty()) {
           JOptionPane.showMessageDialog(null, "Please enter a Purchase Order ID to view.", "No Purchase Order ID Detected", JOptionPane.ERROR_MESSAGE);
       } else {
           try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
                String headerLine = br.readLine().trim();
                String[] header = headerLine.split(",");
                model.setColumnIdentifiers(header);
               
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith(searchPO)) {
                       exists = true;
                       String[] purchaseOrder = line.split("/");
                       model.addRow(purchaseOrder);
                    }
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
            if (!exists) {
               JOptionPane.showMessageDialog(null, "Purchase Order ID: " + searchPO + " not found.", "Invalid Purchase Order ID", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void viewData(DefaultTableModel model, String filepath) {
       
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String headerLine = br.readLine().trim();
            String[] header = headerLine.split(",");
            model.setColumnIdentifiers(header);
           
            String line;
                while ((line = br.readLine()) != null) {
                    if (!line.trim().isEmpty()){
                        String[] purchaseOrder = line.split("/");
                        model.addRow(purchaseOrder);
                    }
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

