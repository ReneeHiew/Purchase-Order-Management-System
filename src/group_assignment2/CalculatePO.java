package group_assignment2;


import group_assignment2.OrderItems;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renee Hiew
 */
public class CalculatePO {
    
    private double sum;
    private double tax;
    private double totalTax;
    private double totalAmount;
    
    public double calculateTotalTax(){ 
        tax = 0.06;
        totalTax = sum * tax;
        return totalTax;
    }
    
    public double calculateTotalAmount(){
        totalAmount = sum + totalTax;
        return totalAmount;
    }

    public double getSum() {
        return sum;
    }
    
    public void setSum(double sum){
        this.sum = sum;
    }
}
