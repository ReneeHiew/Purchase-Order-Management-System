package group_assignment2;

import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renee Hiew
 */
public class CalculateTotal {
    private String itemCode;
    private String itemName;
    private double unitPrice;
    private int quantity;

    public CalculateTotal(String itemCode, String itemName, double unitPrice, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double totalPrice() {
        return unitPrice * quantity;
    }
    
    public String toString(){
        return itemCode + "/" + itemName + "/" + unitPrice + "/" + quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }
}