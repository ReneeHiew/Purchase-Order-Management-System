/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author AVITA
 */
public class ItemEntry extends Functionalities{
    private int row;
    String [] selectedRowItems;
    String filePath, tempFilePath, header;
    
    //Add Constructor
    public ItemEntry(String[] selectedRowItems, String filePath) {
        super(selectedRowItems, filePath);
    }
    
    //Delete Constructor
    public ItemEntry(int row, String filePath, String tempFile, String header){
        super(row, filePath, tempFile, header);
    }
    
    //Edit Constructor
    public ItemEntry(int row, String[] selectedRowItems, String filePath, String tempFilePath, String header) {
        this.row = row;
        this.selectedRowItems = selectedRowItems;
        this.filePath = filePath;
        this.tempFilePath = tempFilePath;
        this.header = header;
    }
    
    
    @Override
    public boolean edit()throws FileNotFoundException, IOException{
        File mainFile = new File(filePath);
        File tempFile = new File(tempFilePath);
        
        Scanner sc = new Scanner (mainFile);
        FileWriter fw = new FileWriter(tempFile);
        
        if(sc.hasNextLine())sc.nextLine();
        
        String[] allRows = {};
        while(sc.hasNextLine()){
            String thisRow = sc.nextLine();
            allRows = Arrays.copyOf(allRows, allRows.length + 1);
            allRows[allRows.length - 1] = thisRow;
        }
        System.out.println(Arrays.toString(allRows));
        
        String oldData = allRows[row];
        System.out.println(oldData);
        
        String newData = "";
        for (String selectedRowItem : selectedRowItems) {
            newData += selectedRowItem + "/";
        }
        newData += "0";
        
        System.out.println(newData);
        
        allRows[row] = allRows[row].replace(oldData, newData);
        
        fw.write(header + "\n");
        for(String rows:allRows) fw.write(rows + "\n");
        sc.close();
        fw.close();
        
        mainFile.delete();
        boolean editStatus = tempFile.renameTo(mainFile);
        return editStatus;
    }
}
