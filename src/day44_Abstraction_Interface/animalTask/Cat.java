package day44_Abstraction_Interface.animalTask;

public final class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
    }


    @Override
    public void eat() {
        System.out.println(getName()+" is eating Biryani");
    }

}
/*
Cat
					eat(): eats Biryani
 */