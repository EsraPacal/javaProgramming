package day44_Abstraction_Interface.animalTask;

public final class Tiger extends Animal implements WildAnimal {


    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void roar(){
        System.out.println(getName()+" is roaring");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" eats deer");
    }

    @Override // implemented from WildAnimal interface
    public void hunt() {
        System.out.println(getName()+" is hunting deer");
    }
}
/*
Tiger
					eat(): eats deer
 */