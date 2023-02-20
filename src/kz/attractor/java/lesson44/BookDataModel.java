package kz.attractor.java.lesson44;

public class BookDataModel {


    private Book book;

    public BookDataModel() {
        this.book = new Book("Harry Potter", "J.K.Rowling", "2015");
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
