/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08_1_exercise;

/**
 *
 * @author Helmi_BeLogix
 */
public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        
        // Call the setColor method on item1. Print an appropriate message, 
	//  depending upon the return value.

        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }
}
