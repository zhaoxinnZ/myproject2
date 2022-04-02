package main.java.pers.xinn.customers;

public class GoldenCustomer extends SilverCustomer{
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
    }

    @Override
    public int getDiscountMoney() {
        return (int) (amount - (amount * discount));
    }
}
