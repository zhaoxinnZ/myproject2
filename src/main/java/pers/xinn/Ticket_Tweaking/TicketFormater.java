package main.java.pers.xinn.Ticket_Tweaking;

import main.java.pers.xinn.destination.Destination;

public class TicketFormater {
    Destination start;
    Destination end;
    int ticketnumber;

    public TicketFormater(Destination start, Destination end, int ticketnumber){
        this.start = start;
        this.end = end;
        this.ticketnumber = ticketnumber;
    }

    public String Tweak() {
        int price = Destination.getRelative_position(start, end) * 2;
        return String.format(
                        "===============\n" +
                        "Ticket NO.%d\n" +
                        "%s --> %s\n" +
                        "Price : NT$%d\n" +
                        "===============\n",
                ticketnumber, start, end, price);
    }
}
