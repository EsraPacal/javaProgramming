package day36_Inheritance.encapsulation;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Sema",22,'F','C',"MIT");

        student1.setAge(25);

        System.out.println(student1);
    }
}
