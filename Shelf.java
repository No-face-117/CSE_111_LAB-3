// CSE-111 LAB-3 TASK-3     []
// T_3 Library Shelf object !

public class Shelf {
    public int capacity;
    public int books;

    public void addBooks(int i) {
        if (books == capacity || books > capacity) {
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if (books+i > capacity ) {
            System.out.println("Exceeds capacity.");
        }
        else{
            System.out.println(i + " books added to shelf.");
            books += i;
        }
    }

    public void showDetails() {
        System.out.println("Shelf capacity : " + capacity);
        System.out.println("Number of books : " + books);
        System.out.println("Remaining slots : " + (capacity-books));
    }
    
    
}
 

