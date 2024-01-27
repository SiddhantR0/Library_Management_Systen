package models;
import models.Book;

import java.util.ArrayList;
import java.util.List;

public class Bill {
    int billId;
    String billOwner;
    List<Book> bookList = new ArrayList<Book>();

    public Bill(int billId, String billOwner, List<Book> bookList) {
        this.billId = billId;
        this.billOwner = billOwner;
        this.bookList = bookList;
    }

    public int getbillId() {
        return billId;
    }

    public void setbillId(int billId) {
        this.billId = billId;
    }

    public String getbillOwner() {
        return billOwner;
    }

    public void setbillOwner(String billOwner) {
        this.billOwner = billOwner;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void getbillDetails(){
        System.out.println("Book order for " + billOwner);
        double totalPrice = 0;
        for(Book book: bookList){
            System.out.println(" x" + book.getQuantity() +" " + book.getBookName()+": " + "Rs." + book.getBookPrice());
            totalPrice += book.getBookPrice()*book.getQuantity();
        }
        System.out.println("The Total Price is: " +"Rs." +totalPrice);
    }
}