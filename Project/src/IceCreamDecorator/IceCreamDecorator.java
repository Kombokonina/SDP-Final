package IceCreamDecorator;
import IceCreamFactory.ProductManagment;

public abstract class IceCreamDecorator implements ProductManagment {
    public ProductManagment iceCream;
    public IceCreamDecorator(ProductManagment iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public void displayInfo() {
        iceCream.displayInfo();
    }

    @Override
    public double getCost(){
        return iceCream.getCost();
    }
}
