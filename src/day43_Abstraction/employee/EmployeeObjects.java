package day43_Abstraction.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        // Person person= new Person("Josh",35,'M');   // person class is an abstract class
        // Employee employee = new Employee("Ali",30, 'M',42,"Sdet",145000.00);

        Tester tester = new Tester("Ali",30,'M',42,"Sdet",145000.00);
        Developer developer = new Developer("Alex", 28, 'M',32,"Web Developer", 155000.00);
        Teacher teacher = new Teacher("Esra", 33, 'F',28,"English Teacher", 90000.00);
        Driver driver = new Driver("Mark", 30, 'M',32,"Taxi Driver", 750000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("------------------------------------------------");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();

        System.out.println("------------------------------------------------");

        teacher.work();
        teacher.eat();
        teacher.sleep();

        System.out.println("------------------------------------------------");

        driver.eat();
        driver.work();
        driver.sleep();

    }
}
