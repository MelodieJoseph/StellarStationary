
package stellarstationary;


public class Order {  // class name
    
    public String productName; // instance variable
    public double price;
    public double discount;
    public int quantity;
    public double total;
    public String message;

    public boolean isDiscounted = false; // state variable
    public boolean isValidOrder = true;
        
    public static int orderNum = 0; //class variable, static variable
    
    
    public Order(){
        ++orderNum;
        isValidOrder = false;
        message = "ERROR: You have not specified any parameters for the order";
    }
    
    public Order(String productName,double price,int quantity){
        ++orderNum;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public Order(String productName,double price,int quantity,double discount){
        ++orderNum;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        
        if (( discount >= 1) && (discount <= 100)){
            isDiscounted = true;
            this.discount = discount; 
        }
        else {
            isValidOrder = false;
            message = "ERROR: The discount value: " + discount + "is not valid";
        }
    }
   public void calculate()
   {
        if (isValidOrder == false) {
            message = "ERROR: Order number: " + orderNum + "cannot be totalled as it is invalid";
            
        }
        else if (isValidOrder == true && isDiscounted == false) {
            total = quantity * price;
        }
        else  
        {
            total = quantity * price - quantity*price*(discount/100);
        }
        
          }
    
    public String toString()
        {
         
         if ((isValidOrder == true) & (isDiscounted == false))
            {
               return message = ("Order number: " + orderNum + "\n" + " Product Name: " + productName + "\n" + " Product Price: " + price + "\n" + " Order Quantity: "  + quantity + "\n" + " Total Price: " + total);
            }
         else if ((isValidOrder == true) & (isDiscounted == true))
         {
             return message = ("Order number: " + orderNum +  "\n"  + "Product Name: " + productName + "\n" + "Product Price: " + price + "\n" + " Order Quantity: " + quantity + "\n" + " Discount: " + discount +  "\n" + "Total Price: " + total);
         }
         else
         {
             return message;
         }
    }
    
}


