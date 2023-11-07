package IceCreamFactory;


public class ChocolateIceCream implements ProductManagment {
    @Override
    public void displayInfo() {
        System.out.println("Chocolate ice cream scoop");
    }

    @Override
    public double getCost() {
        return 800.0;
    }
}