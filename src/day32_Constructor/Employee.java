package day32_Constructor;

public class Employee {

    // =================v  instance variables
    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name=name;
    }



    public Employee(String name, char gender){      // =======>   Constructor
       // Employee(name);    ============> constructor can not be called by its name

        this(name);  // this.name=name;  // we call other instance name that was created separately above
        this.gender = gender;
    }

    public Employee(String name, char gender, String jobTitle){  // ======> Constructor

        this(name, gender); // this.name=name;  //this.gender=gender;
        // we call other instance name that was created separately above. Calling method, it allows us to reuse attributes
        this.jobTitle=jobTitle;
    }

    public Employee(String name, char gender, String jobTitle,double salary){
        this(name, gender, jobTitle);
        this.salary=salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
