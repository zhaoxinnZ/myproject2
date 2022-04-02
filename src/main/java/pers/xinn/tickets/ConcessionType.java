package main.java.pers.xinn.tickets;

public enum ConcessionType {
    COLLEGE_STUDENT("College student", 0.5f),
    EARLY_BIRD("Early bird", 0.65f);

    final String type;
    final float discount;
    ConcessionType(String type, float discount){
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
