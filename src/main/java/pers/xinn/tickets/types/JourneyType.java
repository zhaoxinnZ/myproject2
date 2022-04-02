package main.java.pers.xinn.tickets.types;

public enum JourneyType {
    ONE_WAY("One way", 1f),
    ROUND_TRIP("Round trip", 1.8f),;

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
