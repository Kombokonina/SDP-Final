package IceCreamDecorator;
import IceCreamFactory.*;

public class PeanutTopping extends IceCreamDecorator{
    public PeanutTopping(ProductManagment iceCream) {
        super(iceCream);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Nut topping added");
    }

    @Override
    public double getCost(){
        return super.getCost() + 50.0;
    }
}
