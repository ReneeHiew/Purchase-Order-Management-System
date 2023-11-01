package group_assignment2;


import group_assignment2.OrderItems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renee Hiew
 */
public class writeFile{
    
    private String filepath;
    
    public writeFile(String filepath){
        this.filepath = filepath;
    }

    public boolean appendOrder(String orderData){
        try{
            FileWriter append = new FileWriter(filepath, true);
            PrintWriter print = new PrintWriter(append);
            print.println(orderData);
            print.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean verifyPOid(String POid) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
           
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(POid.toUpperCase())) {
                    br.close();
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean verifyPurID(String PurID){
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
           
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(PurID.toUpperCase())) {
                    br.close();
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean verifyReq(String Req) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
           
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(Req.toUpperCase())) {
                    br.close();
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
