package group_assignment2;


import group_assignment2.OrderItems;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renee Hiew
 */
public class OrderList {
    private List<OrderItems> orders;
    
    public OrderList(){
        orders = new ArrayList<>();
    }
    
    public void addOrder(OrderItems obj1){
        orders.add(obj1);
    }
    
    public List<OrderItems> getOrders(){
        return orders;
    }
    
    public String toString(){
        return orders.toString();
    }
}
