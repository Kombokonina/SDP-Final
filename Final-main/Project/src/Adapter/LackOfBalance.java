package Adapter;

public class LackOfBalance extends Exception {
    public LackOfBalance() {
        super("Insufficient balance for payment");
    }
}
