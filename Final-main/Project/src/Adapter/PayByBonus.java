package Adapter;

import Singleton.BonusCheck;

public class PayByBonus implements IPayByBonus {
    private BonusCheck bonusCheck;

    public PayByBonus(double bonusBalance) {
        this.bonusCheck = BonusCheck.getInstance(bonusBalance);
    }

    @Override
    public void pay(double amount) throws LackOfBalance {
        try {
            bonusCheck.useBonus(amount);
            System.out.println("Payment of " + amount + "tg by bonuses successfully finished");
        } catch (LackOfBalance e) {
            throw e;
        }
    }
}
