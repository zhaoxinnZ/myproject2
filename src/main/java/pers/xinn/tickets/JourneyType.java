package main.java.pers.xinn.tickets;

public enum JourneyType {
    ONE_WAY("One way", 0),
    ROUND_TRIP("Round trip", 0.9f),;

    final String type;
    final float discount;
    JourneyType(String type, float discount){
        this.type = type;
        this.discount = discount;
    }

    public String getType() {
        return type;
    }

    public float getDiscount() {
        return discount;
    }
}
