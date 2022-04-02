package main.java.pers.xinn.tickets.utils.printer;

import main.java.pers.xinn.tickets.types.TicketType;

import java.util.ArrayList;
import java.util.Arrays;

public interface TicketTypePrinter {

    ArrayList<TicketType> ticketType = new ArrayList<>(Arrays.asList(TicketType.values()));

    public static void printType(){
        int i = 1;
        System.out.println("===============");
        for (TicketType ticket : ticketType){
            System.out.printf("%2d. %s\n", i, ticket.getType());
            i++;
        }
        System.out.println("===============");
    }

}
