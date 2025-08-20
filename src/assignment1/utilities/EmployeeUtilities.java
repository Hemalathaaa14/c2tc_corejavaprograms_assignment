package assignment1.utilities;

import assignment1.employees.Employee;

/**
 * EmployeeUtilities - helper class to work with Employee objects.
 */
public class EmployeeUtilities {

    // Method to print details of any employee
    public void printEmployeeDetails(Employee emp) {
        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    // Method to increase salary of any employee
    public void increaseSalary(Employee emp, double amount) {
        emp.setSalary(emp.getSalary() + amount);
        System.out.println(emp.getName() + "'s new salary: " + emp.getSalary());
    }
}

