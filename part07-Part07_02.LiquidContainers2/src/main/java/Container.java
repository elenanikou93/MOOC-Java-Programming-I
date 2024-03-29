public class Container {
    private int liquidInContainer;

    public Container() {
        this.liquidInContainer = 0;

    }

    public int contains() {
        return this.liquidInContainer;
    }

    public void add(int amount) {
        if (amount >= 0) {
            if (this.liquidInContainer + amount <= 100) {
                this.liquidInContainer += amount;
            } else {
                this.liquidInContainer = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount >= 0) {
            if (this.liquidInContainer - amount >= 0) {
                this.liquidInContainer -= amount;
            } else {
                this.liquidInContainer = 0;
            }
        }
    }

    public String toString() {
        return this.liquidInContainer + "/100";
    }

}
