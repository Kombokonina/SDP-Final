package IceCreamDecorator;
import IceCreamFactory.*;

public class ChocolateSyrop extends IceCreamDecorator{
    public ChocolateSyrop(ProductManagment iceCream) {
        super(iceCream);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Chocolate syrop added");
    }

    @Override
    public double getCost(){
        return super.getCost() + 50.0;
    }
}
