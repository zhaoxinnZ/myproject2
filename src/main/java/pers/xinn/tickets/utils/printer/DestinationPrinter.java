package main.java.pers.xinn.tickets.utils.printer;

import main.java.pers.xinn.tickets.types.Destination;

import java.util.ArrayList;

public interface DestinationPrinter {

    public static void printLocation(ArrayList<Destination> Destination) {
        int i = 1;
        System.out.println("===============");
        for (Destination dest : Destination) {
            System.out.printf("%2d. %s\n", i, dest.getLocation());
            i++;
        }
        System.out.println("===============");
    }
}



