package main.java.pers.xinn.customers;

public abstract class Customer {
    String id;
    int amount;
    float discount;

    public Customer(String id,int amount){
        this.id = id;
        this.amount = amount;
    }

    public int getDiscountMoney() {
        return (int) (amount - (amount/1000) * discount * 1000);
    }

    @Override
    public String toString(){
        return String.format(
                "id:%s \n" +
                "amount:%d \n" +
                "discount:%d \n",
                id, amount, getDiscountMoney());
    }

}
