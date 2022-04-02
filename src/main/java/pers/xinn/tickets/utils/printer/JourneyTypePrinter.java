package main.java.pers.xinn.tickets.utils.printer;

import main.java.pers.xinn.tickets.types.JourneyType;

import java.util.ArrayList;
import java.util.Arrays;

public interface JourneyTypePrinter {

    ArrayList<JourneyType> journeytype = new ArrayList<>(Arrays.asList(JourneyType.values()));

    public static void printType(){
        int i = 1;
        System.out.println("===============");
        for (JourneyType journey : journeytype){
            System.out.printf("%2d. %s\n", i, journey.getType());
            i++;
        }
        System.out.println("===============");
    }
}
