package day39_Recap.cydeoTask;

import day39_Recap.cydeoTask.Developer;
import day39_Recap.cydeoTask.Student;
import day39_Recap.cydeoTask.Teacher;
import day39_Recap.cydeoTask.Tester;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer1 = new Developer("Ahmet",25,'M',10,"Java Developer",120000);

        Tester tester = new Tester("Nadia",28,'F',13,"SDET",110000);

        Teacher teacher = new Teacher("Danial",31,'M',15,"Math Teacher",100000);

        Student student = new Student("Esra",33,'F',19,"SDET");

        System.out.println(developer1);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("---------------------------------------------------------------------");

        developer1.setName("Orhan");
        System.out.println(developer1.getName());

        System.out.println(developer1);

        System.out.println("----------------------------------------------------------------------");

        developer1.work();
        developer1.eat();
        developer1.sleep();
        developer1.drink();
        developer1.fixingBugs();

        System.out.println();

        tester.work();
        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();

        System.out.println();

        teacher.work();  // work method is an implemented to the teacher class in different action
        teacher.eat();
        teacher.sleep();
        teacher.drink();

        System.out.println();

        student.study();
        // student.work(); ======> false, Student is not subclass of Employee. So, work method is not inherited to the Student class



    }

}
