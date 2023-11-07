import IceCreamFactory.*;
import IceCreamDecorator.*;
import Adapter.*;
import Observer.*;

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

        //Adapter
//        Payment payment = new Payment(1700);
        PaymentAdapter payment = new PaymentAdapter(new PayByBonus(1000.0));

        try {
            payment.pay(cost);
        } catch (LackOfBalance e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("///////////////////////////////////////////");

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
