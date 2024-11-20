// CSE-111 LAB-3 TASK-7     []
// T_7 An IKEA object !

public class Cart {
    public int count = 0;
    public double discount = 0.0;
    public int cart_number = 0;
    public String[] items = new String[3];
    public double[] prices = new double[3];
    
    public void create_cart(int nothing){
        cart_number = nothing;
    }

    public void addItem(String ak, double pk){
        if (count < items.length) {
            System.out.println(ak + " Added to cart " + cart_number + "." );
            items[count] = ak;
            prices[count] = pk;    
            count ++;
            System.out.println("You have " + count + " item(s) in your cart now.");
        }
        else if (count >= items.length) {
            System.out.println("You already have 3 items on your cart!");
        }
        else{}
    }

    public void addItem(double nk, String lk){
        addItem(lk, nk);
    }

    public void giveDiscount(int sk){
        discount = sk;
    }

    public void cartDetails(){
        double sum = 0.0;
        double dc = 0.00000000;
        System.out.println("Your cart(c " + cart_number + ") : ");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i] + " - " + prices[i]);
            sum += prices[i];
        }
        dc = sum - (sum*(discount/100));
        System.out.println("Discount Applied : " + discount + "%");
        System.out.println("Total price : " + dc);
    }

    
}
 

