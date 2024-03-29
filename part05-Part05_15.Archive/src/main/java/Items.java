public class Items {
    private String identifier;
    private String name;

    public Items(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Items)) {
            return false;
        }

        Items comparedItem = (Items) compared;

        if (this.identifier.equals(comparedItem.identifier)) {
            return true;
        } else {
            return false;
        }
    }

}
