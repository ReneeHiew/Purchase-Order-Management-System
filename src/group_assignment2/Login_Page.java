/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AVITA
 */
public class Login_Page{
    private String role;
    private String username;
    private String password;
    private String userID;
    private boolean authStatus = false;

    public Login_Page() {
    }
    
    public Login_Page(String role, String username, String password){
        this.role = role;
        this.username = username.toLowerCase();
        this.password = password;
    }

    public boolean login_auth(){
        String userlogFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\user_log.txt";
        
        try {
            File userfile = new File(userlogFilePath);
            Scanner sc = new Scanner (userfile);
            
            //skips the first line
            if(sc.hasNextLine()){
                sc.nextLine();
            }
            
            //reads from 2nd line onwards
            while (sc.hasNextLine()){
               String credentialLine = sc.nextLine();
               String[] credentialParts = credentialLine.split("[ ,]+");
               
               if(credentialParts[0].equals(role) && credentialParts[2].equals(username) && credentialParts[3].equals(password)){
                   userID = credentialParts[1];
                   authStatus = true;
                   break;
                }
            }
            sc.close();
            
            if(authStatus){
                JOptionPane.showMessageDialog(null,"User Authenticated", "Welcome User", JOptionPane.INFORMATION_MESSAGE);
                switch(role){
                    case "administrator":
                        System.out.println(userID);
                        new admin_main(userID).setVisible(true);
                        JOptionPane.showMessageDialog(null,"Welcome Admin", "Admin Main Menu", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "purchase_manager":
                        new PM_MainPage().setVisible(true);
                        JOptionPane.showMessageDialog(null,"Welcome Purchase Manager", "Purchase Manager Main Menu", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "sales_manager":
                        System.out.println(userID);
                        new SM_MainPage(userID).setVisible(true);
                        JOptionPane.showMessageDialog(null,"Welcome Sales Manager", "Sales Manager Main Menu", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }  
            }
            else{
                JOptionPane.showMessageDialog(null,"Incorrect username or password. Please Try Again", "Invalid Credential", JOptionPane.WARNING_MESSAGE);
            }
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error Occurred", "Error Detacted", JOptionPane.ERROR_MESSAGE);
        }
        
        return authStatus;
    }
}
