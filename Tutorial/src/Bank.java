public class Bank {
    private int money = 0;

    public Bank() {
    }

    public void deposit(int amount) {
        this.money += amount;
    }

    public void withdrawal(int amount) {
        this.money -= amount;
    }

    @Override
    public String toString() {
        return "You have: " + this.money + "$";
    }
}
