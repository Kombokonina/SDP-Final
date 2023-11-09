package Singleton;

import Adapter.LackOfBalance;

public class BonusCheck {
    private static double bonusBalance;
    private static BonusCheck instance = null;

    private BonusCheck(double bonusBalance) {
        this.bonusBalance = bonusBalance;
    }

    public static BonusCheck getInstance(double initialBalance) {
        if (instance == null) {
            instance = new BonusCheck(initialBalance);
        }
        return instance;
    }

    public static double getBonusBalance() {
        return bonusBalance;
    }

    public static void addBonus(double amount) {
        bonusBalance += amount;
    }

    public void useBonus(double amount) throws LackOfBalance {
        if (bonusBalance >= amount) {
            bonusBalance -= amount;
        } else {
            throw new LackOfBalance();
        }
    }
}
