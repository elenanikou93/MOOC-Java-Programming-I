import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;    

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();        
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            items.add(item);
        }
        
    }

    public String toString() {
        String printOutput = "";

        if (items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (items.size() == 1) {
            return "1 item (" + items.get(0).getWeight() + " kg)"; 
        }

        if (items.size() > 1) {
            printOutput = items.size() + " items (" + totalWeight() + " kg)";
        }

        return printOutput;
    }

    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sumOfWeight = 0;

        for (Item item: items) {
            sumOfWeight += item.getWeight();
        }

        return sumOfWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item item: items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;

    }

}
