// CSE-111 LAB-3 TASK-1     []
// T_1 Bank account object object.

public class BankAccount {
    public int Account_No = 0;
    public String Type = "Not Set.";

    public void setInfo(int ak, String kk) {
        System.out.println("Account information updated!");
        Account_No = ak;
        Type = kk;
    }

    public String printDetails(){
        return "Account No : " + Account_No + "\n" + "Type : " + Type;
    }

}
 

