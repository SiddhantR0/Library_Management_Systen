import java.util.ArrayList;
import java.util.List;
import models.Bill;
import models.Book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(1, 500, "Old Is Gold",1);
        Book book2 = new Book(2, 350, "Gold Is Old", 1);
        Book book3 = new Book(3, 200, "I am Gold",1);

        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3); 

        Bill myBill = new Bill(1, "Siddhant", bookList);

        myBill.getbillDetails();

    }
}