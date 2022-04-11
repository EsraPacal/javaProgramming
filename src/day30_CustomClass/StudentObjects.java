package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Esra",'F',32,2022,'A');

        Student student2= new Student();
        student2.setInfo("Ilhan",'M',36,2021,'B');

        Student student3= new Student();
        student3.setInfo("Omer",'M',20,2020,'A');

        Student student4= new Student();
        student4.setInfo("Mike",'F',28,2010,'F');

        Student student5= new Student();
        student5.setInfo("Ahmet",'M',34,2052,'C');

        Student[] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("----------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>();  // grade: A
        ArrayList<Student> angryBirrd = new ArrayList<>();

        for (Student student : students) {
            
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirrd.add(student);
            }

        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirrd = " + angryBirrd);







    }


}
