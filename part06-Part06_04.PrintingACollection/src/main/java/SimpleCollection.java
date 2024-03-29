
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String printOutput = "The collection " + this.name;

        if (elements.isEmpty()) {
            return printOutput + " is empty.";
        }

        String elementInCollection = "";

        if (elements.size() == 1) {
            elementInCollection = elementInCollection + elements.get(0);
            return printOutput + " has 1 element:\n" + elementInCollection;
        }

        for (String element: elements) {
            elementInCollection = elementInCollection + element + "\n";
        }

        return printOutput + " has " + elements.size() + " elements:\n" + elementInCollection;
    }
    
}
