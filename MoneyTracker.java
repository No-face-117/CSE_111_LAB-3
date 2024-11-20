// CSE-111 LAB-3 UG-OP TASK-8     []
// UG-OP T_1 A money tracker object !

public class MoneyTracker {
    public String name;
    public double balance = 1.0;
    public double add = 0.0;
    public double spend = 0.0;
    
    public void createTracker(String ank) {
        name = ank;
    }

    public void income(int ak) {
        balance += ak;
        add += ak;
        System.out.println("Balance Updated!");
    }

    public void expense(int kk) {
        if (balance <= 0 || (balance - kk) == 0) {
            System.out.println("You're broke!");
        }
        else if (balance > 0 && balance < kk) {
            System.out.println("Not enough balance.");
        }
        else if (balance >= kk) {
            balance -= kk;
            spend += kk;
        }
        else{}
    }

    public String info() {
        return "Name : " + name + "\n"
                 + "Current Balance : " + balance;
    }

    public void showHistory() {
        System.out.println("Last added : " + add);
        System.out.println("Last spent : " + spend);
    }
    
}
 

