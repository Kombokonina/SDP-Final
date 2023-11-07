package Adapter;

public class PayByBonus implements IPayByBonus {
    private double bonusBalance;

    public PayByBonus(double bonusBalance) {
        this.bonusBalance = bonusBalance;
    }

    @Override
    public void pay(double amount) throws LackOfBalance {
        if (bonusBalance >= amount) {
            System.out.println("Payment of " + amount + "tg by bonuses successfully finished");
        } else {
            throw new LackOfBalance();
        }
    }
}
