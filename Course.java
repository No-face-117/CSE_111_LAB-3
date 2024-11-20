// CSE-111 LAB-3 UG-OP TASK- 8     []
// UG-OP T_8 A Syllabus object !

public class Course {
    public String name;
    public String code;
    public int count = 0;
    public String[] syllabus = new String[4];
    
    public void updateDetails(String kn_1, String cn_1) {
        name = kn_1;
        code = cn_1;
    }

    public void addContent(String kn_2) {
        if (count < syllabus.length) {
            System.out.println(kn_2 + " was added.");
            syllabus[count] = kn_2;

            count ++;
        }
        else if (count > syllabus.length) {
            System.out.println("Cannot add more content.");
        }
        else{System.out.println("Cannot add more content.");}
    }

    public void addContent(String kn_3, String kn_4) {
        addContent(kn_3);
        addContent(kn_4);
    }

    public void printDetails(){
        System.out.println("Course details : ");
        System.out.println("Course Name : " + name);
        System.out.println("Course Code : " + code);
        System.out.println("Course Syllabus : ");
        for (int i = 0; i < count; i++) {
            System.out.print(syllabus[i] + " ");
        }
        System.out.println();
    }
}
 

