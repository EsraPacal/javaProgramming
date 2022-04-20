package day35_Encapsulation.encapsulation;

public class Person {

    private String name; // if the value is private, it can be use only inside its own class
    private int age;

    public String getName(){   // getter method must always public in order to be accessible from outside its own class
        return name;    // returns the private instance variable
    }

    public void setName(String name){  // setter is instance method
        this.name=name;
    }

    public int getAge(){  // getter is instance method, so we can not use the "static" keyword. if the method is static, then it can not access to the instances
        return age;
    }

    public void setAge(int age){

        if(age<=0 || age>150){
            System.err.println("Invalid Age: "+age);
            System.exit(0);
        }
        this.age=age;


    }

}
