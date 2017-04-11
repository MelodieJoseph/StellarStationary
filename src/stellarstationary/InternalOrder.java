/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stellarstationary;

/**
 *
 * @author admin
 */
public class InternalOrder extends Order {
   
    public static final int DISCOUNT = 40;
    
    
    public InternalOrder(String productName, double price, int quantity)
    {
       super (productName, price, quantity, DISCOUNT);
    }

public String printInternalReport()
{
    return message = ("Printing internal report...");
}



}



