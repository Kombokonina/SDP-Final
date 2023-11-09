package Adapter;

public interface IPayByBonus {
    void pay(double amount) throws LackOfBalance;
}
