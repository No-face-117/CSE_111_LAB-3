// CSE-111 LAB-3 UG-OP TASK- 6     []
// UG-OP T_6 A book object !

public class Book {
    public String name;
    public String a_name = "Unknown!";
    public String genre;
    public int pages;
    
    public void createBook(String n_1) {
        name = n_1;
    }

    public void createBook(String n_2, String an_1){
        createBook(n_2);
        a_name = an_1;
    }

    public void createBook(String n_3, String an_2, String g_1) {
        createBook(an_2, an_2);
        genre = g_1;
    }

    public void customizeGenre(String g_2){
        genre = g_2;
        System.out.println("Updated genre of " + name + " to " + g_2 + ".");
    }

    public void customizePages(int ap) {
        pages = ap;
        System.out.println("Updated pages of " + name + " to " + ap + " pages.");
    }

    public void displayDetails() {
        System.out.println("Title : " + name + ", Author: " + a_name + ", Genre : " + genre + ", Pages : " + pages);
    }
    
     
}
 

