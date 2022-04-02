package main.java.pers.xinn.tickets;

public enum RegularType {
    REGULAR("Regular", 0),
    CHILDREN("Children", 0.5f),
    SENIOR_PERSONS("Senior_persons", 0.5f),
    DISABLED("Disabled", 0.5f);

    final String type;
    final float discount;
    RegularType(String type, float discount){
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

