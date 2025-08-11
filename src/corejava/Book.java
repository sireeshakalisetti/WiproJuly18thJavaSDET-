package corejava;
/*Library Book Tracker
Fields: title, author, isbn, isAvailable
Use encapsulation to:
Issue a book (setAvailable(false))
Return a book (setAvailable(true))
Get book info
Write a small test class to simulate issuing and returning books.
*/
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book issued: " + title);
        } else {
            System.out.println("Book already available: " + title);
        }
    }

    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not issued: " + title);
        }
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + isAvailable);
        System.out.println();
    }
    public static void main(String[] args) {
        Book b1 = new Book("DBMS", "Paulo Coelho", "123456");
        Book b2 = new Book("chemistry", "George Orwell", "789012");

       
        b1.issueBook();

        b1.displayBookInfo();

        b2.returnBook();

        b2.displayBookInfo();
    }
}
