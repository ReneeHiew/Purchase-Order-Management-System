/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Renee Hiew
 */
public class deleteFile {
    
    public static void deletePO(String selectedPO, String selectedPOItem) {
       try {
           File oriFile = new File("C:\\Users\\60125\\Documents\\OODJ Group Assignment\\purchaseOrder.txt");
           File replacedFile = new File("replacedPO.txt");

           BufferedReader br = new BufferedReader(new FileReader(oriFile));
           BufferedWriter writer = new BufferedWriter(new FileWriter(replacedFile));

           String POLine;

           while ((POLine = br.readLine()) != null) {
               if (POLine.startsWith(selectedPO) && POLine.contains(selectedPOItem)) {
                   continue;
               }
               writer.write(POLine + System.getProperty("line.separator"));
           }

           writer.close();
           br.close();

           if (oriFile.delete()) {
               replacedFile.renameTo(oriFile);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   } 
}
