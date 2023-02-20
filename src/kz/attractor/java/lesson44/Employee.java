package kz.attractor.java.lesson44;

public class Employee {

    private String id;
    private String fullName;

    public Employee(String fullName, String id) {
        this.fullName = fullName;
        this.id = id;
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
}