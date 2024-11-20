// CSE-111 LAB-3 TASK-6     []
// T_6 A Schilership object !

public class Student {
    public String name = "Not set!";
    public String department = "CSE";
    public String status = "Not set!";
    public int credits = 9;
    public double cgpa = 0.0;
    public String[] pass_list = new String[4];

    public void updateDetails(String ak, double kk){
        name = ak;
        cgpa = kk; 
    }

    public void updateDetails(String ak, double kk, int jk){
        updateDetails(ak, kk);
        credits = jk; 
    }

    public void updateDetails(String ak, double kk, int nk, String ik){
        updateDetails(ak, kk, nk);
        department = ik;   
    }       

    public void checkScholarshipEligibility(){
        if (cgpa < 3.5 && credits < 10) {
            System.out.println("Mim is not eligible for scholarship!");
            status = "No scholarship.";
        }
        else if (cgpa >= 3.5 && credits > 10) {
            if (cgpa >= 3.5 && cgpa <3.7) {
                System.out.println(name + " is eligible for Need based scholership!");
                status = "Need based scholarship.";
            }
            else if (cgpa >= 3.7) {
                System.out.println("is eligible for Merit based scholarship!");
                status = "Merit based scholarship.";
            }
            else{}
        }
        else{}
    }

    public void showDetails(){
        System.out.println("Name : " + name + ".");
        System.out.println("Department : " + department + ".");
        System.out.println("CGPA : " + cgpa);
        System.out.println("Credits : " + credits);
        System.out.println("Scholarship Status : " + status);
    }
}
 

