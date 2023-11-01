package group_assignment2;


import group_assignment2.CalculateTotal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renee Hiew
 */
public class OrderItems extends CalculateTotal{
    
    private double totalPrice;
    
    public OrderItems(String itemCode, String itemName, double unitPrice, int quantity, double totalPrice) {
       super(itemCode, itemName, unitPrice, quantity);
       this.totalPrice = totalPrice;
    }
    
    public double gettotalPrice(){
        return totalPrice;
    }
    
    public String toString(){
        return super.toString() + "/" + totalPrice;
    }
}

