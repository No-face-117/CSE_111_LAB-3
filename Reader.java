// CSE-111 LAB-3 TASK-8     []
// T_8 An Readers code object !

public class Reader {
    public String name = "New user.";
    public int count = 0;
    public double discount = 0.0;
    public int capacity = 0;
    public String[] books;
    
    
    public String createReader(String something, int nothing){
        name = something;
        capacity = nothing;
        books = new String[nothing];

        return "A new reader is created!";
    }

    public void addBook(String ak){
        if (count < books.length) {
            books[count] = ak;  
            count ++;
        }
        else if (count >= books.length) {
            System.out.println("No more capacity!");
        }
        else{}
    }

    public void readerInfo(){
        System.out.println("Name : " + name + ".");
        System.out.println("Capacity : " + capacity + " books.");
        System.out.println("Books : ");
        
        if (count == 0) {
            System.out.println("No books added yet.");
        }
        else if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Book " + (i+1) + " : " + books[i]);
            }
        }
        else{}
    }

    
}
 

