package main.java.pers.xinn.score;

public class GraduatedStudent extends Student{
    final int thesis;


    public GraduatedStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public String toString(){
        String output = String.format(
                "name:%s, english score:%d, math score:%d",
                name, english, math);
        if (getAverage() < 60){
            output = output + " *";
        }
        output = String.format(output + " %d",thesis);
        return output + "\n";
    }


}
