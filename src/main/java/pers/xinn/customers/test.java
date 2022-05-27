package main.java.pers.xinn.customers;

import java.util.LinkedList;

public class test {


    public static void main(String[] args) {
        Customer customer = new NormalCustomer("123",100);
        System.out.println(customer);

        Customer customer1 = new SilverCustomer("456", 120);
        System.out.println(customer1);

        Customer customer2 = new GoldenCustomer("789", 300);
        System.out.println(customer2);

        customer.print();
        customer1.print();
        customer2.print();

    }
}
