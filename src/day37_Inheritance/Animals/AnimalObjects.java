package day37_Inheritance.Animals;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Charlie", "Doberman", 'M', 3, "Large", "Black");
        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Pinky", "British", 'F', 2, "Small", "White");
        System.out.println(cat1);
        cat1.meow();

        Parrot parrot1= new Parrot("Talkie","Bird",'M',1,"Medium","Colorful");
        System.out.println(parrot1);
        parrot1.sing();

    }
}
