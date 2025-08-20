package assignment3;
public class InheritanceVsCompositionDemo {
    public static void main(String[] args) {
        // Inheritance demonstration
        Book b1 = new Book(101, "Java Basics", "James Gosling");
        Magazine m1 = new Magazine(201, "Tech Today", 45);

        b1.displayInfo();
        m1.displayInfo();

        // Composition demonstration
        Library library = new Library();
        library.addItem(b1);
        library.addItem(m1);

        library.showAllItems();
    }
}
