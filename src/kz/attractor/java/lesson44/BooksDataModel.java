package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {

    private List <Book> books = new ArrayList<>();

    private List <Employee> employees = new ArrayList<>();


    public BooksDataModel() {
        books.add(new Book("Harry Potter", "J.K.Rowling", "2015"));
        books.add(new Book("If He Had Been with Me",  " Amber Smith", "2019"));
        books.add(new Book("The Way I Used to Be", "Laura Nowlin", "2017"));
        employees.add(new Employee("Nurislam Abdykadyrov","1"));
        employees.add(new Employee("Asel Kadyrkulova","2"));
        employees.add(new Employee("Amantur Chokmorov","3"));
        employees.add(new Employee("Sagyn Turdubaev","4"));
        employees.add(new Employee("Adel Ormonova","5"));
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
}