public class Book51 {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book51(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book51(String isbn){
        this(isbn,"unknown","unknown");
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book51 is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy "+this.title);
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoy the book, Please leave a review");
        }
        else{
            System.out.println("This book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book51 designOfThings = new Book51("1","design","vaibhav");
        Book51 myBook = new Book51("2");
        System.out.println(getTotalBooks());
        myBook.borrowBook();
        designOfThings.borrowBook();
        myBook.borrowBook();
        myBook.returnBook();
        myBook.returnBook();
    }

}
