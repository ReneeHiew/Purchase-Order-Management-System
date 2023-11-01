/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_assignment2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AVITA
 */
public class Admin {
    private String userRole, userID, tempUsername ,tempPassword = "123", userName, userDOB, userEmail;
    private String idType;
    private String generatedID;
    private String userlogFilePath = "C:\\Users\\60125\\Documents\\OODJ Group Assignment\\user_log.txt";
    private boolean createUserStatus;

    public Admin(String userRole, String userName, String userDOB, String userEmail) {
        this.userRole = userRole;
        this.userName = userName;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
    }
        
    public void getIDType(){
        switch(userRole){
            case "administrator": idType = "AD"; break;
            case "sales_manager": idType = "SM"; break;
            case "purchase_manager": idType = "PM"; break;
            default: JOptionPane.showMessageDialog(null,"Invalid Role");
        }
    }
    
    public void generate_userID (){
        int userCount = 0;
        String id = null;
        try {
            File userfile = new File(userlogFilePath);
            Scanner sc = new Scanner (userfile);
            
            //counts the number of the specific role
            while (sc.hasNextLine()){
               String userLine = sc.nextLine();
               String[] credentialParts = userLine.split("[ ,]+");
               
               if(credentialParts[0].equals(userRole)){
                   userCount += 1;
                }
            }
            sc.close();
            
            //TODO: change the following process using String.format()
            //increase the id by 1 from the total of that specific role
            if(userCount >= 0 && userCount < 9){ //single digit ID
                id = "0" + (userCount + 1);
            }
            else if (userCount >= 9 && userCount < 99){ //double digit ID
                id = String.valueOf(userCount + 1);
            }
            else{
                JOptionPane.showMessageDialog(null,userRole + " role ran out of ID numbers.");
            }
        }
        catch (IOException ex){
            JOptionPane.showMessageDialog(null,"Error");
        }
        
        generatedID = id;
    }
    //NOTE: Text file formatting algorithm
//    public void userDataFormatting(){
//        List<String[]> userData = new ArrayList<>();
//        try{
//            //Reads all the data in the file to an ArrayList
//            File userfile = new File(userlogFilePath);
//            Scanner sc = new Scanner (userfile);
//            
//            while(sc.hasNextLine()){
//                String userDataLine = sc.nextLine();
//                String[] userDataParts = userDataLine.split("[ ,]+");
//                userData.add(userDataParts);
//            }
//            
//            sc.close();
//            
//            //Calculate the column width
//            int[] columnWidths = new int[userData.get(0).length]; //initailization of the array
//            for (String[] row : userData){
//                for (int i = 0; i<row.length; i++){
//                    columnWidths[i] = Math.max(columnWidths[i], row[i].length());
//                }
//            }
//            
//            //Format the data
//            FileWriter fw = new FileWriter(userlogFilePath);
//            for(String[] row : userData){
//                StringBuilder formattedLine = new StringBuilder();
//                for(int i = 0; i<row.length; i++){
//                    formattedLine.append(String.format("%-"+(columnWidths[i] + 2) + "s" ,row[i])); //left-justifying
//                }   
//                formattedLine.append("\n");
//                fw.write(formattedLine.toString());
//            }
//            fw.close();
//        }
//        catch (IOException ex){
//            JOptionPane.showMessageDialog(null,"Error");
//        }
//    }
    
    public boolean register_user(){
        getIDType();
        generate_userID();
        userID = idType + generatedID;
        tempUsername = userName.toLowerCase() + "_" + idType.toLowerCase();
        
        try{
            FileWriter fw = new FileWriter (userlogFilePath, true);
            String userDetails = userRole + "," + userID + "," + tempUsername + "," + tempPassword + "," + userName + "," + userDOB + "," + userEmail + "\n";
            fw.write(userDetails);
            fw.close();
            createUserStatus = true;
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
        return createUserStatus;
    }
    
}
