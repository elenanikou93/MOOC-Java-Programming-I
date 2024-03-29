public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        } else {
            return;
        }
        
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        } else {
            return;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            if (this.balance < 150.0) {
                this.balance += amount;
            }

            if (this.balance >= 150.0) {
                this.balance = 150.0;
            }
        } else if (amount <= 0) {
            this.balance = this.balance;
        }
    }

}
