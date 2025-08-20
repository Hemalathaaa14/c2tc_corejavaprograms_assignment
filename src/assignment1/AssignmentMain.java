package assignment1;
import assignment1.employees.*;
import assignment1.utilities.EmployeeUtilities;

/**
 * Main class to test Manager, Developer, and EmployeeUtilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create objectsch
        Manager manager = new Manager("Alice", 101, 80000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Create utility helper
        EmployeeUtilities util = new EmployeeUtilities();

        System.out.println("Manager Details:");
        util.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        util.printEmployeeDetails(developer);

        // Increase salaries
        util.increaseSalary(manager, 5000);
        util.increaseSalary(developer, 4000);
    }
}

