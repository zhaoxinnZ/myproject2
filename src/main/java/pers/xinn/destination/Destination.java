package main.java.pers.xinn.destination;
import java.lang.Math;

public enum Destination {
    // Here only lists 6 capitals
    TAIPEI("Taipei", 225),
    NEW_TAIPEI("New Taipei", 200),
    TAOYUAN("Taoyuan", 175),
    TAICHUNG("Taichung", 125),
    TAINAN("Tainan", 25),
    KAOHSIUNG("Kaohsiung", 0);

    private final String location;
    private final int absolute_position;

    Destination(String location,int absolute_position){
        this.location = location;
        this.absolute_position = absolute_position;
    }

    public int getAbsolute_position() {
        return absolute_position;
    }

    public String getLocation() {
        return location;
    }

    public static int getRelative_position(Destination destination1, Destination destination2){
        return Math.abs(destination1.getAbsolute_position() - destination2.getAbsolute_position());
    }
}
