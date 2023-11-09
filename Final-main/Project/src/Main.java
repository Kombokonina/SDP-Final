import IceCreamFactory.*;
import IceCreamDecorator.*;
import Adapter.*;
import Observer.*;
import Singleton.*;

public class Main {
    public static void main(String[] args) {
       //Factory
        IceCreamFactory factory = new IceCreamFactory();
        ProductManagment strawberryIceCream = factory.createIceCream("Strawberry");
        strawberryIceCream.displayInfo();
        System.out.println("Cost: " + strawberryIceCream.getCost());
        System.out.println("///////////////////////////////////////////");


//        //Decorator
        ProductManagment strawberryWithCherrySandSprinkles = new SprinklesTopping(new CherrySyrop(strawberryIceCream));
        strawberryWithCherrySandSprinkles.displayInfo();

        double cost = strawberryWithCherrySandSprinkles.getCost();
        System.out.println("Total cost: " + cost + " тг");
        System.out.println("///////////////////////////////////////////");
//

        //Adapter + Singleton
//        Payment payment = new Payment(1700);
        BonusCheck bonusCheck = BonusCheck.getInstance(1000.0);

        PaymentAdapter payment = new PaymentAdapter(new PayByBonus(BonusCheck.getBonusBalance()));
        try {
            payment.pay(cost);
        } catch (LackOfBalance e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("///////////////////////////////////////////");

        BonusCheck.addBonus(500.0);
        try {
            bonusCheck.useBonus(300.0);
        } catch (LackOfBalance e) {
            System.err.println("Error: " + e.getMessage());
        }

        double currentBonusBalance = BonusCheck.getBonusBalance();
        System.out.println("Current bonus balance: " + currentBonusBalance);

        //Observer
        PromotionManager promotionManager = new PromotionManager();
        CafeNotificator cafeNotificator = new CafeNotificator(promotionManager);

        Follower follower1 = new Follower("Zhanna", "Arys");

        cafeNotificator.addFollower(follower1);

        promotionManager.publishEvent("50% off on coffee");
        promotionManager.publishEvent("Free pastry with any order");

        cafeNotificator.notifyFollowers();
        System.out.println("///////////////////////////////////////////");



    }

}
