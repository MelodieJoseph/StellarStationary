
package stellarstationary;


public class OrderCreator {

    
    public static void main(String[] args) {
        
        Order o1 = new Order("Stapler", 12.7, 6);
        o1.calculate();
        System.out.println("Test case 0: " + "\n" + o1 );
        
        Order o2 = new Order();
        o2.calculate();
        System.out.println("Test case 1: " + "\n" + o2);
        
        Order o3 = new Order("Pens", 0.60, 50);
        o3.calculate();
        System.out.println("Test case 2: " + "\n" + o3);
        
        Order o4 = new Order("Pencil", 0.30, 115);
        o4.calculate();
        System.out.println("Test case 3: " + "\n" + o4);
        
        Order o5 = new Order("Ruler", 1.20, 4, 15);
        o5.calculate();
        System.out.println("Test case 4: " + "\n" + o5);
        
        Order o6 = new Order("Pencil Sharpener", 2.05, 8, 115);
        o6.calculate();
        System.out.println("Test case 5: " + "\n" + o6); 
        
        InternalOrder o7 = new InternalOrder("Compass", 4.50, 7);
        o7.calculate();
        System.out.println("Test case 5: " + "\n" + o7); 
        
        InternalOrder o8 = new InternalOrder("Eraser", 0.50, 20);
        o8.calculate();
        System.out.println("Test case 6: " + "\n" + o8 + "\n" + o8.printInternalReport());
        
    }
    
}
