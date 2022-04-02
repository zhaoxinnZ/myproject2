package main.java.pers.xinn.tickets.utils;

import main.java.pers.xinn.tickets.classes.Ticket;
import main.java.pers.xinn.tickets.types.Destination;

public class Formatter {
    Ticket ticket;
    int number;
    public Formatter(Ticket ticket,int number){
        this.ticket = ticket;
        this.number = number;
    }

    public String Tweak() {
        return String.format(
                        "==================\n" +
                        "Ticket NO.%d\n" +
                        "%s --> %s\n" +
                        "Unit Price: %d\n" +
                        "Quantity: %d\n" +
                        "Type: %s\n" +
                        "Journey: %s\n" +
                        "Total: NT$%d\n" +
                        "==================\n",
                number,
                ticket.getStart(),
                ticket.getEnd(),
                ticket.getUnitprice(),
                ticket.getQuantity(),
                ticket.getTicketType().getType(),
                ticket.getJourneyType().getType(),
                ticket.getTotalprice());
    }
}
