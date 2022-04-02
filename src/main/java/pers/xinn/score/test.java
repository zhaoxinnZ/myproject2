package main.java.pers.xinn.score;

public class test {



    public static void main(String[] args) {
        Student student = new Student("Jeff",100,90);
        Student student1 = new Student("Jeffery", 60,40);
        Student student2 = new GraduatedStudent("Jaff", 60, 50, 2);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
    }
}
