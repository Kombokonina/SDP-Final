package Adapter;

public class PaymentAdapter implements IPayByBonus {
    private IPayByBonus iPayByBonus;

    public PaymentAdapter(IPayByBonus iPayByBonus) {
        this.iPayByBonus = iPayByBonus;
    }

    @Override
    public void pay(double amount) throws LackOfBalance {
        iPayByBonus.pay(amount);
    }
}
