package models;

public class Book {
    int bookId;
    double bookPrice;
    String bookName;

    public Book(int bookId, double bookPrice, String bookName, int quantity) {
        this.bookId = bookId;
        this.bookPrice = bookPrice;
        this.bookName = bookName;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int quantity;


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}