package Week2.Percobaan1;

public class Employee {
    private int id;
    private String name;
    private String gender;
    private String title;
    private double salary;

    public Employee(int id, String name, String gender, String title, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.title = title;
        this.salary = salary;
    }

    public void viewPersonalData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Title: " + title);
    }

    public void viewSalary() {
        System.out.println("Salary: " + salary);
    }
}
