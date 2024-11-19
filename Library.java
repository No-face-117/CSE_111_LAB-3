// CSE-111 LAB-3 TASK-4     []
// T_4 Library object !

public class Library {
    public int capacity;
    public int books_n;
    public String[] books;

    public void setBookCapacity(int ak){
        capacity = ak;
        books = new String[ak];
    }

    public void addBook(String kk) {
        if (books_n == capacity || books_n > capacity) {
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if (books_n + 1 > capacity ) {
            System.out.println("Exceeds capacity.");
            System.out.println("You cannot add more then " + capacity + " books");
        }
        else{
            System.out.println("Book " + kk + " added to the library.");
            books[books_n] = kk;
            books_n ++;
        }
    }

    public void printDetail() {
        System.out.println("Maximum Capacity : " + capacity);
        System.out.println("Total Books : " + books_n);
        System.out.println("Remaining Capacity : " + (capacity-books_n));
        System.out.println("Book list:");

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
    
    
}
 

