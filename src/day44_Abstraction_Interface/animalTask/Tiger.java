package day44_Abstraction_Interface.animalTask;

public final class Tiger extends Animal {


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
}
/*
Tiger
					eat(): eats deer
 */