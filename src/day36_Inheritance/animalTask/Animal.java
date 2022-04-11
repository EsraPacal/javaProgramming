package day36_Inheritance.animalTask;

public class Animal {   // parent class

    public String name, breed;
    public char gender;
    public int age;
    public String size;
    public String color;


    public void setInfo(String name, String breed, char gender, int age, String size, String color) {  // setInfo method ===> shortcut ==> generate ==> Constructor==>select all==> change to public void setInfo
        this.name = name;  // in order to separate "variable String name" from the entered name, we use "this." keyword
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public void eat(){ // common feature
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void move(){
        System.out.println(name+" is moving");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    public String toString() {
        return "Animal{" +
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
Animal:
		name, breed, gender, size, age, color
		setInfo(), eat(), drink(), move(), sleep(), toString()
 */