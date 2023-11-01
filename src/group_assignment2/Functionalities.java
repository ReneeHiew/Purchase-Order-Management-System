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
public class Functionalities {
    private String filePath, tempfilePath, header;
    private int row;
    private String[] selectedRowItems;
    
    public Functionalities(){
        
    }
    
    //constructor used for Delete
    public Functionalities(int row, String filePath, String tempfilePath, String header){
        this.row = row;
        this.filePath = filePath;
        this.tempfilePath = tempfilePath;
        this.header = header;
    }
    
    //constructor used for Add
    public Functionalities(String[] selectedRowItems, String filePath) {
        this.selectedRowItems = selectedRowItems;
        this.filePath = filePath;
    }

    //constructor used for Edit
    public Functionalities(int row, String[] selectedRowItems, String filePath, String tempfilePath, String header) {
        this.row = row;
        this.selectedRowItems = selectedRowItems;
        this.filePath = filePath;
        this.tempfilePath = tempfilePath;
        this.header = header;
    }
    
    public void add() throws IOException{
        System.out.println(Arrays.toString(selectedRowItems));
        
        FileWriter fw = new FileWriter(filePath, true);
        for (int i = 0; i<selectedRowItems.length - 1; i++){
            fw.write(selectedRowItems[i] + "/");
        }
        
        fw.write(selectedRowItems[selectedRowItems.length - 1] + "\n");
        fw.close();
    }
    
    public boolean delete() throws FileNotFoundException, IOException{
        File mainFile = new File(filePath);
        File tempFile = new File(tempfilePath);
        
        Scanner sc = new Scanner(mainFile);
        FileWriter fw = new FileWriter(tempFile);
        
        if(sc.hasNextLine())sc.nextLine();
        
        String[] allRows = {};
        while(sc.hasNextLine()){
            String thisRow = sc.nextLine();
            allRows = Arrays.copyOf(allRows, allRows.length + 1);
            allRows[allRows.length - 1] = thisRow;
        }
        
        fw.write(header + "\n");
        for(String rows:allRows){
            if (rows.equals(allRows[row])) continue;
            fw.write(rows + "\n");
        }
        sc.close();
        fw.close();
        
        mainFile.delete();
        boolean deleteStatus = tempFile.renameTo(mainFile);
        return deleteStatus;
    }
    
    public boolean edit()throws FileNotFoundException, IOException{
        File mainFile = new File(filePath);
        File tempFile = new File(tempfilePath);
        
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
        for (int i = 0; i<selectedRowItems.length - 1; i++) {
            newData += selectedRowItems[i] + "/";
        }
        newData += selectedRowItems[selectedRowItems.length - 1];
            
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
    
    public void view(){
        
    }
}
