/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

import group_assignment2.Functionalities;

/**
 *
 * @author AVITA
 */
public class SupplierEntry extends Functionalities {
    //Add Constructor
    public SupplierEntry(String[] selectedRowItems, String filePath) {
        super(selectedRowItems, filePath);
    }
    
    //Delete Constructor
    public SupplierEntry(int row, String filePath, String tempFile, String header){
        super(row, filePath, tempFile, header);
    }
    
    //Edit Constructor
    public SupplierEntry(int row, String[] selectedRowItems, String filePath, String tempFile, String header){
        super(row, selectedRowItems, filePath, tempFile, header);
    }
    
    
}
