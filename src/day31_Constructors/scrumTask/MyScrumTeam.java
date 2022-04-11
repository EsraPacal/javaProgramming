package day31_Constructors.scrumTask;

import java.util.ArrayList;

public class MyScrumTeam {

    public static void main(String[] args) {


        // 4 testers objects

        Tester tester1 = new Tester("Floyd", 10, "QA", 100000);
        Tester tester2 = new Tester("Clear", 11, "SDET", 110000);
        Tester tester3 = new Tester("Gina", 12, "SE", 135000);
        Tester tester4 = new Tester("George", 15, "SDET", 115000);

        Tester[] testers = {tester2, tester3, tester4};

        // 4 devs objects
        Developer developer1= new Developer("Hasan",123,"Java Developer", 125000);
        Developer developer2= new Developer("Jale",456,"Java Master", 145000);
        Developer developer3= new Developer("Murat",789,"Software Developer", 120000);
        Developer developer4= new Developer("Aaron",987,"Senior Developer", 200000);

        Developer[] developers = {developer2, developer3,developer4};

        // 1 scrumTeam Object
        ScrumTeam scrum = new ScrumTeam("Selin","Josh","David",14);
        scrum.addTester(tester1);   // it will be added into the Scrum Team
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);  // add the array list
        scrum.addDevelopers(developers);  // add the array list

        System.out.println(scrum);

        System.out.println("--------------------------------------------------------");

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name+ " : "+eachTester.salary);
        }

        System.out.println("---------------------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name+" : "+ eachDeveloper.salary);
        }

        System.out.println("---------------------------------------------------------");

        scrum.removeTester(10);

        System.out.println( scrum);

        scrum.removeDeveloper(987);

        System.out.println(scrum);



    }

}

/*
create a class called MyScrumTeam:
	                    1. create an array of Testers and add the testers from your group
	                    2. create an array of developers add the developers from your group
	                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team

 */