package IceCreamFactory;

public class VanillaIceCream implements ProductManagment {

    @Override
    public void displayInfo() {
        System.out.println("Vanilla ice cream scoop ");
    }

    @Override
    public double getCost() {
        return 800.0;
    }
}
