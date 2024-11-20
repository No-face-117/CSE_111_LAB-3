// CSE-111 LAB-3 TASK-5     []
// T_4 A Taxi object !

public class TaxiLagbe {
    public String name;
    public String area;
    public int Passenger;
    public int pass_number;
    public int taka;
    public String[] pass_list = new String[4];

    public void storeInfo(String kk_n, String kk_a) {
        name = kk_n;
        area = kk_a;
    }

    public void addPassenger(String kk_p_name, int ak) {
        if (pass_number < pass_list.length) {
            System.out.println("Dear " + kk_p_name + "! Welcome to TaxiLagbe.");
            pass_list[pass_number] = kk_p_name;
            taka += ak;

            pass_number ++;
        }
        else if (pass_number >= pass_list.length) {
            System.out.println("Taxi Full! No more passengers can be added.");
        }
        else{}
        
    }

    public void addPassenger(String kk_p1_name, int ak_1, String kk_p2_name, int ak_2){
        addPassenger(kk_p1_name, ak_1);
        addPassenger(kk_p2_name, ak_2);
    }

    public void printDetails() {
        System.out.println("Taxi number : " + name);
        System.out.println("This taxi can cover the " + area + " area.");
        System.out.println("Passenger number : " + pass_number);
        System.out.println("Passenger list : ");
        for (int i = 0; i < pass_list.length; i++) {
            System.out.print(pass_list[i] + " ");
        }        
        System.out.println();
        System.out.println("Total collected fare : " + taka + " taka.");
    }
    
}
 

