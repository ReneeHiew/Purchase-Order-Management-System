/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

import group_assignment2.Functionalities;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AVITA
 */
public class PurchaseRequisition extends Functionalities{
    private String prFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\purchaseRequisition.txt";
    private String [] prIDLists = {};
    private String prID;

    public PurchaseRequisition() {
    }
    
    //Add Constructor
    public PurchaseRequisition(String[] selectedRowItems, String filePath) {
        super(selectedRowItems, filePath);
    }
    
    //Delete Constructor
    public PurchaseRequisition(int row, String filePath, String tempFile, String header){
        super(row, filePath, tempFile, header);
    }
    
    //Edit Constructor
    public PurchaseRequisition(int row, String[] selectedRowItems, String filePath, String tempFile, String header){
        super(row, selectedRowItems, filePath, tempFile, header);
    }
    
    public void generate_prID() throws FileNotFoundException{
        File prfile = new File(prFilePath);
        Scanner sc = new Scanner(prfile);
        
        if(sc.hasNextLine())sc.nextLine();
        
        while(sc.hasNextLine()){
            String rowPR = sc.nextLine();
            String[] partsPR = rowPR.split("[/]+");
            prIDLists = Arrays.copyOf(prIDLists, prIDLists.length + 1);
            prIDLists [prIDLists.length - 1] = partsPR[0];
        }
        sc.close();
        
        if(prIDLists.length == 0){
            prID = "PR001";
        }
        else if (prIDLists.length > 0 && prIDLists.length < 999){
            prID = String.format("PR%03d", prIDLists.length + 1);
        }
        else{
             JOptionPane.showMessageDialog(null,"Ran out of PR IDs.");
        }
        
    }
    
    public String getprID(){
        return prID;
    }
}
