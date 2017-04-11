package stellarstationary;

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
