package assignment1.employees;

/**
 * Manager class - subclass of Employee.
 * A manager has an extra attribute: department.
 */
public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary); // call parent(Employee) constructor
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }
}
