package assignment2;

public class Assignment {
    public static void main(String[] args) {
        // Create Student object (default constructor will run)
        Student s = new Student();

        // Create Commission object
        Commission c = new Commission();

        // Accept details and calculate commission
        c.acceptDetails();
        c.calculateCommission();
    }
}

