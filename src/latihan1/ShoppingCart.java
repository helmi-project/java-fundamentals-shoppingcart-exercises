/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ex03_1_exercise;

/**
 *
 * @author Helmi_BeLogix
 */
package latihan1;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Mary Smith";
        String message;
        
        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "Scarf";
        items[3] = "Skirt";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
        System.out.println("Items purchased: ");
        
        for (String item : items ){
           System.out.print(item + ", ");
        }
    }
}
