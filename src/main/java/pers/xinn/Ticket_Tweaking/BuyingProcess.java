package main.java.pers.xinn.Ticket_Tweaking;

import main.java.pers.xinn.destination.Destination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//This is the Ticket main process
public class BuyingProcess implements DestinationUtils {
    public static void main(String[] args) {
        ArrayList<Destination> tickets = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            ArrayList<Destination> locations = new ArrayList<>(Arrays.asList(Destination.values()));
            Destination[] results = new Destination[2];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please select your starting point");
            DestinationUtils.Print(locations);

            boolean process1 = false;
            while (!process1) {
                int start = scanner.nextInt();
                if (start >= 1 && start <= 6) {
                    System.out.printf("Seleted: %s\n",
                            locations.get(start - 1).getLocation());
                    results[0] = locations.get(start - 1);
                    locations.remove(start - 1);
                    process1 = true;
                } else {
                    System.out.printf("Please only select between 1 and %d!",
                            locations.size());
                }
            }

            System.out.println("Please enter your destination");
            DestinationUtils.Print(locations);

            boolean process2 = false;
            while (!process2) {
                int end = scanner.nextInt();
                if (end >= 1 && end <= 5) {
                    System.out.printf("Selected: %s\n",
                            locations.get(end - 1).getLocation());
                    results[1] = locations.get(end - 1);
                    process2 = true;
                } else {
                    System.out.printf("Please only select between 1 and %d!",
                            locations.size());
                }
            }
            tickets.add(results[0]);
            tickets.add(results[1]);

            System.out.println("Countinue buying? 0:exit 1:continue");
            boolean process3 = false;
            while (!process3) {
                int selection = scanner.nextInt();
                exit = (selection == 0) ? true : false;
                process3 = (selection == 0 || selection == 1) ? true : false;
            }
        }

        int i = 0;
        while (i <= (tickets.size()/2)){
            Destination d1 = tickets.get(0);
            Destination d2 = tickets.get(1);
            TicketFormater ticketFormater = new TicketFormater(d1, d2, i + 1);
            System.out.println(ticketFormater.Tweak());
            for (int j = 0; j<2; j++){
                tickets.remove(0);
            }
            i++;
        }
    }
}
