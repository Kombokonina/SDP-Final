package IceCreamFactory;

public class IceCreamFactory {
    public ProductManagment createIceCream(String type) {
        switch (type.toLowerCase()) {
            case "chocolate":
                return new ChocolateIceCream();
            case "strawberry":
                return new StrawberryIceCream();
            case "vanilla":
                return new VanillaIceCream();
            default:
                throw new IllegalArgumentException("Invalid ice cream type");
        }
    }
}