package main.java.pers.xinn.score;

public class Student {
    String name;
    int english;
    int math;
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    @Override
    public String toString(){
        String output = String.format(
                "name:%s, english score:%d, math score:%d",
                name, english, math);
        if (getAverage() < 60){
            output = output + " *";
        }
        return output + "\n";
    }

    public int getAverage() {
        return (english+math)/2;
    }
}
