package kz.attractor.java.lesson44;

public class Employee {

    private String id;
    private String fullName;
    private String bookList;

    private  String usedBook;

    public Employee(String id, String fullName, String bookList, String usedBook) {
        this.id = id;
        this.fullName = fullName;
        this.bookList = bookList;
        this.usedBook = usedBook;
    }

    public Employee(String fullName, String bookList) {
        this.fullName = fullName;
        this.bookList = bookList;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getBookList() {
        return bookList;
    }

    public void setBookList(String bookList) {
        this.bookList = bookList;
    }

    public String getUsedBook() {
        return usedBook;
    }

    public void setUsedBook(String usedBook) {
        this.usedBook = usedBook;
    }
}