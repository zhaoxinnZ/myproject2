package main.java.pers.xinn.customers;

public class SilverCustomer extends Customer{
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }

    @Override
    public int getDiscountMoney(){
        return (int) (amount - (amount * discount));
    }

}
