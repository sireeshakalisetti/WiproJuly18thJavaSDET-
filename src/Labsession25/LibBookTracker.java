package Labsession25;

public class LibBookTracker {
    public static void main(String[] args) {
        Book b1 = new Book("DBMS", "Paulo Coelho", "123456");
        Book b2 = new Book("chemistry", "George Orwell", "789012");

       
        b1.issueBook();

        b1.displayBookInfo();

        b2.returnBook();

        b2.displayBookInfo();
    }
}
