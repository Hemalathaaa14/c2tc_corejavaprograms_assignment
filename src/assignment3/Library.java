package assignment3;
import java.util.ArrayList;

public class Library {
    private ArrayList<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                System.out.println("- " + ((Book) item).getDetails());
            } else if (item instanceof Magazine) {
                System.out.println("- " + ((Magazine) item).getDetails());
            }
        }
    }
}
