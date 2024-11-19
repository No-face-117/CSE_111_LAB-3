// CSE-111 LAB-3 TASK-2     []
// T_2 Bank Shape object !

public class Shape {
    public String name;
    public int C_R;
    public int T_A;
    public int T_B;
    public double R_A;
    public double R_B;
    
    public void setParameters(String ak, int kk_1){
        name = ak;
        C_R = kk_1;
    }

    public void setParameters(String ak, int kk_1, int kk_2){
        name = ak;
        T_A = kk_1;
        T_B = kk_2;
    }

    public void setParameters(String ak , double kk_1, double kk_2){
        name = ak;
        R_A = kk_1;
        R_B = kk_2;
    }

    public String details(){
        System.out.println("Shape Name : " + name);

        if (C_R != 0) {
            return "Area : " + (Math.PI*Math.pow(C_R, 2));
        }
        else if (T_A != 0) {
            return "Area : " + 0.5*T_A*T_B;
        }
        else if (R_A != 0) {
            return "Area : " + R_A*R_B;
        }
        else{return "a";}
    }
}
 

