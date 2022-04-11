package day37_Inheritance.Animals;

public class Dog extends Animal {

    public Dog(String name, String breed, char gender, int age, String size, String color){
        super(name,breed,gender,age,size,color); // don't give any value in this constructor, if i do  that, all the animals will have the same values
    }

    public void bark(){
        System.out.println(name+" is barking");
    }


}
