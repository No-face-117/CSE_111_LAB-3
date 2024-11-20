// CSE-111 LAB-3 UG-OP TASK- 4     []
// UG-OP T_1 A grocery object !

public class Customer {
    public String name;
    public int count = 0;
    public int tp = 0;
    public String[] items = new String[4];
    public int[] prices = new int[4];
    
    public void createCustomer(String kk) {
        name = kk;
    }

    public void addItem(String lk_1, int nk_1, String lk_2, int nk_2) {
        if (count < items.length) {
            System.out.println(lk_1 + " and " + lk_2 + " added to cart.");
            items[count] = lk_1;
            prices[count] = nk_1;
            tp += nk_1;

            count ++;

            items[count] = lk_2;
            prices[count] = nk_2;
            tp += nk_2;

            count ++;
        }
        else if (count > items.length) {
            System.out.println("Cart is full!");
        }
        else{}
    }

    public void addItem(String lk, int nk) {
        if (count < items.length) {
            System.out.println(lk + " added to cart.");
            items[count] = lk;
            prices[count] = nk;
            tp += nk;

            count ++;
        }
        else if (count > items.length) {
            System.out.println("Cart is full!");
        }
        else{System.out.println("Cart is full!");}
    }

    public void calculatePrice() {
        System.out.println("Total : " + tp);
    }

    public void showCart() {
        System.out.println("Customer : " + name);

        for (int i = 0; i < count; i++) {
            System.out.println("Item : " + items[i] + " Price : " + prices[i]);
        }
    }
}
 

