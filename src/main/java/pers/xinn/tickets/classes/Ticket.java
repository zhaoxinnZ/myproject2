package main.java.pers.xinn.tickets.classes;

import main.java.pers.xinn.tickets.types.Destination;
import main.java.pers.xinn.tickets.types.JourneyType;
import main.java.pers.xinn.tickets.types.TicketType;

public class Ticket {
    Destination start;
    Destination end;
    TicketType ticketType;
    JourneyType journeyType;
    int unitprice;
    int quantity;
    int totalprice;

    public static class Builder {
        Ticket ticket = new Ticket();

        public Builder(){};

        public Builder setStart(Destination start) {
            ticket.start = start;
            return this;
        }

        public Builder setEnd(Destination end) {
            ticket.end = end;
            return this;
        }

        public Builder setTicketType(TicketType ticketType) {
            ticket.ticketType = ticketType;
            return this;
        }

        public Builder setJourneyType(JourneyType journeyType) {
            ticket.journeyType = journeyType;
            return this;
        }

        public Builder setunitprice(int unitprice) {
            ticket.unitprice = unitprice;
            return this;
        }

        public Builder setquantity(int quantity) {
            ticket.quantity = quantity;
            return this;
        }

        public Builder settotalprice(int totalprice){
            ticket.totalprice = totalprice;
            return this;
        }

        public Ticket Build() {
            return ticket;
        }
    }

    public Destination getStart() {
        return start;
    }

    public Destination getEnd() {
        return end;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public JourneyType getJourneyType() {
        return journeyType;
    }

    public int getUnitprice() {
        return unitprice;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalprice() {
        return totalprice;
    }
}
