package main.java.pers.xinn.tickets.utils;

import main.java.pers.xinn.tickets.types.Destination;
import main.java.pers.xinn.tickets.utils.printer.*;
import main.java.pers.xinn.tickets.utils.printer.JourneyTypePrinter;
import main.java.pers.xinn.tickets.utils.printer.TicketTypePrinter;
import main.java.pers.xinn.tickets.types.JourneyType;
import main.java.pers.xinn.tickets.types.TicketType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Selector {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Destination> Location(){
        ArrayList<Destination> tickets = new ArrayList<>();

        ArrayList<Destination> locations = new ArrayList<>(Arrays.asList(Destination.values()));

        System.out.println("Please select your starting point");
        DestinationPrinter.printLocation(locations);

        boolean pause_start = false;
        while (!pause_start) {
            int selection_start = scanner.nextInt();
            if (selection_start >= 1 && selection_start <= locations.size()) {
                System.out.printf("Seleted: %s\n",
                        locations.get(selection_start - 1).getLocation());
                tickets.add(locations.get(selection_start - 1));
                locations.remove(selection_start - 1);
                pause_start = true;
            } else {
                System.out.printf("Please only select between 1 and %d!",
                        locations.size());
            }
        }

        System.out.println("Please enter your destination");
        DestinationPrinter.printLocation(locations);

        boolean pause_destination = false;
        while (!pause_destination) {
            int selection_end = scanner.nextInt();
            if (selection_end >= 1 && selection_end <= locations.size()) {
                System.out.printf("Selected: %s\n",
                        locations.get(selection_end - 1).getLocation());
                tickets.add(locations.get(selection_end - 1));
                pause_destination = true;
            } else {
                System.out.printf("Please only select between 1 and %d!",
                        locations.size());
            }
        }
        return tickets;
    }

    public TicketType TicketType(){
        ArrayList<TicketType> ticketTypes = new ArrayList<>(Arrays.asList(TicketType.values()));
        System.out.println("Please select your TicketType!");
        TicketTypePrinter.printType();

        int selection = scanner.nextInt();
        return ticketTypes.get(selection - 1);
    }

    public JourneyType JourneyType(){
        ArrayList<JourneyType> journeyTypes = new ArrayList<>(Arrays.asList(JourneyType.values()));
        System.out.println("Please select your JourneyType!");
        JourneyTypePrinter.printType();

        int selection = scanner.nextInt();
        return journeyTypes.get(selection - 1);


    }

    public int Quantity(){
        System.out.println("How many tickets you want to buy?");

        int quantity = 0;
        boolean exit = false;
        while (!exit) {
            int selection = scanner.nextInt();
            if (selection > 0){
                quantity = selection;
                exit = true;
                break;
            } else {
                System.out.println("The amount cannot be less or equal to 0!");
            }
        }
        return quantity;
    }

    public boolean ifStay(){
        System.out.println("Countinue buying? 0:exit 1:continue");
        boolean pause_continue;
        int selection_pause = scanner.nextInt();
        pause_continue = (selection_pause == 0) ? true : false;

        return pause_continue;
    }

}
