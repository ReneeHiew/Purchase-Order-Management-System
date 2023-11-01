/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

/**
 *
 * @author AVITA
 */
public class DailyItemSales extends Functionalities{
    private int row;
    String [] selectedRowItems;
    String filePath, tempFilePath, header;
    
    //Add Constructor
    public DailyItemSales(String[] selectedRowItems, String filePath) {
        super(selectedRowItems, filePath);
    }
    
    //Delete Constructor
    public DailyItemSales(int row, String filePath, String tempFilePath, String header) {
        super(row, filePath, tempFilePath, header);
    }
    
    //Edit Constructor
    public DailyItemSales(int row, String[] selectedRowItems, String filePath, String tempFilePath, String header) {
        super(row,selectedRowItems, filePath, tempFilePath, header);
    }
}
