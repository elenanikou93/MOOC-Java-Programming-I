import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;

    public Stack() {
        this.strings = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (strings.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {
        strings.add(0, value);

    }

    public ArrayList<String> values() {
        return strings;
    }

    public String take() {
        String taken = strings.get(0);
        strings.remove(taken); 
        return taken;       
    }

}
