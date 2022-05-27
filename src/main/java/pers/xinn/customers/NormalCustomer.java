package main.java.pers.xinn.customers;

public class NormalCustomer extends Customer{
    public NormalCustomer(String id, int amount) {
        super(id, amount);
        super.discount = 0.1f;
    }

    @Override
    public void print() {
        System.out.println("Normal Customer");
    }

}
