package kz.attractor.java.lesson44;

public class Employee {

    private String id;
    private String fullName;
    private String currentBook;

    private  String readBook;

    public Employee(String id, String fullName, String currentBook, String readBook) {
        this.id = id;
        this.fullName = fullName;
        this.currentBook = currentBook;
        this.readBook = readBook;
    }

    public Employee(String fullName, String currentBook) {
        this.fullName = fullName;
        this.currentBook = currentBook;
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
    public String getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(String currentBook) {
        this.currentBook = currentBook;
    }

    public String getReadBook() {
        return readBook;
    }

    public void setReadBook(String readBook) {
        this.readBook = readBook;
    }
}