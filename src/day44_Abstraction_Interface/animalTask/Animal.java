package day44_Abstraction_Interface.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;   // the breed of an animal doesn't change, so we need to use final keyword
    private final char gender;
    private int age;
    private String size;
    private final String color;



    // static instance can also be set directly
    public final static boolean canBreath;   // if access mod. is public we don't need getter and setter methods

    static{  // setting the boolean in block

        canBreath= true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);   // this.name = name;  ====> we can also use it like that, but calling the method is easier than writing "this" keyword when we want to set the conditions
        this.breed = breed;

        if(  !(gender == 'M' || gender == 'F')  ) {
            throw new RuntimeException("Invalid gender: "+ gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;

    }

    public String getName() {  // the conditions are given into the getter end setter methods if the value is private

        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {   // it will repeat the condition whenever we call this method
            throw new RuntimeException("Invalid Name");
        }
        this.name = name;
    }

    public String getBreed() {   // can not be set because of final keyword
        return breed;
    }

    public char getGender() {    // can not be set because of final keyword
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {    // can not be set because of final keyword
        return color;
    }

    public final void drink(){   // this method can not be overridden due to the "final" keyword
        System.out.println(name+" is drinking");  // for all classes, the result will be same
    }

    public abstract  void eat();  // meant to be overridden due to the new keyword



    public String toString() {   // in order to print the instances
        return getClass().getSimpleName() + "{" +  // for all the classes, we can se its own class name.
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}






/*
Animal Task:
		Create an abstract class named Animal:
			Variables:
				name, breed(final), gender(final),  age, size, color(final)

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				eat(); ==> different animals eat different foods
				drink() ==> all the animals drink water
				toString() ==> to display the full info of the animal
 */