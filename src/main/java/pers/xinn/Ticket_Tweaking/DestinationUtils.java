package main.java.pers.xinn.Ticket_Tweaking;

import main.java.pers.xinn.destination.Destination;

import java.util.ArrayList;
import java.util.Scanner;

public interface DestinationUtils {
    public static void Print(ArrayList<Destination> Destination) {
        int i = 1;
        System.out.println("===============");
        for (Destination dest : Destination) {
            System.out.printf("%2d. %s\n", i, dest.getLocation());
            i++;
        }
        System.out.println("===============");
    }
}



