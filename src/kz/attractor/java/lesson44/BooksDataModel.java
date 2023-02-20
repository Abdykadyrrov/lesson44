package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {

    private List <Book> books = new ArrayList<>();


    private Book book;
    private List <Employee> employees = new ArrayList<>();


    public BooksDataModel() {
        books.add(new Book("Harry Potter", "J.K.Rowling", "2015"));
        books.add(new Book("If He Had Been with Me",  " Amber Smith", "2019"));
        books.add(new Book("The Way I Used to Be", "Laura Nowlin", "2017"));
        employees.add(new Employee("5","Nurislam Abdykadyrov","Harry Potter",""));
        employees.add(new Employee("1","Asel Kadyrkulova","If He Had Been with Me","Harry Potter"));
        employees.add(new Employee("2","Amantur Chokmorov"," ","If He Had Been with Me "));
        employees.add(new Employee("3","Sagyn Turdubaev"," "," "));
        employees.add(new Employee("4","Adel Ormonova"," The Way I Used to Be","Harry Potter"));
        this.book = new Book("Harry Potter", "J.K.Rowling", "2015");
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
