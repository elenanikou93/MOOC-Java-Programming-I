import java.util.ArrayList;

public class Hold {
    private int maxHoldWeight;
    private ArrayList<Suitcase> suitcases;
    private int alreadyHold;

    public Hold(int maxHoldWeight) {
        this.maxHoldWeight = maxHoldWeight;
        this.suitcases = new ArrayList<>();
        this.alreadyHold = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + alreadyHold <= maxHoldWeight) {
            suitcases.add(suitcase);
            alreadyHold += suitcase.totalWeight();
        }        
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + this.alreadyHold + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }

}
