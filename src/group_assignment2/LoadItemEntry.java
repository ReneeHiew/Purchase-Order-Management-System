package group_assignment2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renee Hiew
 */
public class LoadItemEntry {
    
    public static DefaultTableModel loadItems() throws IOException {
    
        DefaultTableModel dtm = new DefaultTableModel();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\60125\\Documents\\OODJ Group Assignment\\itemEntry.txt"))) {
                String headerLine = br.readLine().trim();
                String[] header = headerLine.split(",");
                dtm.setColumnIdentifiers(header);

                String line;
                while ((line = br.readLine()) != null) {
                    String[] itemEntry = line.split("/");
                    dtm.addRow(itemEntry);
                }
        }
        return dtm;
    }
}
