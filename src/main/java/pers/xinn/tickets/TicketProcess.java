package main.java.pers.xinn.tickets;

import main.java.pers.xinn.tickets.classes.Ticket;
import main.java.pers.xinn.tickets.types.Destination;
import main.java.pers.xinn.tickets.types.JourneyType;
import main.java.pers.xinn.tickets.types.TicketType;
import main.java.pers.xinn.tickets.utils.Formatter;
import main.java.pers.xinn.tickets.utils.Selector;

import java.util.ArrayList;

public class TicketProcess {

    public static void main(String[] args) {
        ArrayList<Ticket> ticketArrayList = new ArrayList<>();

        boolean exit = false;
        while (!exit){
            Selector selector = new Selector();
            ArrayList<Destination> destinations = selector.Location();
            Destination start = destinations.get(0);
            Destination end = destinations.get(1);
            TicketType ticketType = selector.TicketType();
            JourneyType journeyType = selector.JourneyType();
            int unitprice =
                    (int) (Destination.getRelative_position(start, end) *
                            ticketType.getDiscount() *
                            journeyType.getDiscount());
            ;
            int quantity = selector.Quantity();
            int totalprice = unitprice * quantity;

            Ticket ticket = new Ticket.Builder()
                    .setStart(start)
                    .setEnd(end)
                    .setTicketType(ticketType)
                    .setJourneyType(journeyType)
                    .setunitprice(unitprice)
                    .setquantity(quantity)
                    .settotalprice(totalprice)
                    .Build();

            ticketArrayList.add(ticket);

            exit = selector.ifStay();
        }
        int i = 1;
        for (Ticket ticket : ticketArrayList){
            Formatter formatter = new Formatter(ticket, i);
            System.out.println(formatter.Tweak());
            i++;
        }
    }
}
