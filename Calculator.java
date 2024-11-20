// CSE-111 LAB-3 UG-OP TASK- 5     []
// UG-OP T_5 A calculator object !

public class Calculator {
    public String name;
    public int count = 0;
    public int tp = 0;
    public String[] items = new String[4];
    public int[] prices = new int[4];
    
    public int add(int ak_1, int ak_2) {
        int sum_1 = ak_1 + ak_2;
        System.out.println(sum_1);
        return sum_1;
    }

    public void add(int ak_1, int ak_2, int ak_3) {
        int sum_2 = add(ak_1, ak_2) + ak_3;
        System.out.println(sum_2);
    }

    public int multiply(int am_1, int am_2) {
        int mult_1 = am_1 * am_2;
        System.out.println(mult_1);
        return mult_1;
    }

    public void multiply(int am_1, int am_2, int am_3) {
        int mult_2 = add(am_1, am_2) * am_3;
        System.out.println(mult_2);
    }

    public void multiply(String something, int am_3) {
        for (int i = 0; i < am_3; i++) {
            System.out.print(something + "-");
        }
        System.out.println();
    }
}
 

