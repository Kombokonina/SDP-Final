package IceCreamFactory;

public class StrawberryIceCream implements ProductManagment {
    @Override
    public void displayInfo() {
        System.out.println("Strawberry ice cream scoop");
    }

    @Override
    public double getCost() {
        return 800.0;
    }
}