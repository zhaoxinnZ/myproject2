package main.java.pers.xinn.tickets.types;

public enum TicketType {


    COLLEGE_STUDENT("College student", 0.5f),
    EARLY_BIRD("Early bird", 0.65f),
    REGULAR("Regular", 1f),
    CHILDREN("Children", 0.5f),
    SENIOR_PERSONS("Senior_persons", 0.5f),
    DISABLED("Disabled", 0.5f);

    final String type;
    final float discount;

    TicketType(String type, float discount){
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
