package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");

        Student student2 = new Student("Aygun",'F');

        Student student3 = new Student("Esra",32);

        Student student4 = new Student("Mert",12,'A');

        Student student5 = new Student("Cihat",'M',25);

        Student student6 = new Student("Sema",'F',24,18);

        Student student7 = new Student("Omer",'M',29,19,'B');


        System.out.println(student1==student2);  //   false  ================>  if equal or not

        Student[] students = {student1, student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

    }




}
