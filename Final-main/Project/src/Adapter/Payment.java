package Adapter;

public class Payment  {
    private double creditCardBalance;
    private PaymentAdapter paymentAdapter;

    public Payment(double creditCardBalance) {
        this.creditCardBalance = creditCardBalance;

    }

    public void pay(double amount) throws LackOfBalance {
        if (creditCardBalance >= amount) {
            System.out.println("Payment of " + amount + "tg by credit card successfully finished");
        } else {
            throw new LackOfBalance();
        }
    }
}
