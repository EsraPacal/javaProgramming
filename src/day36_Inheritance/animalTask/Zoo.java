package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog= new Dog();
        dog.setInfo("Max","Husky",'M',2,"Smal","White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();

        dog.bark();
        // dog.hunt();  =====>  dog does not share the methods of the cat
        // dog.scratch(); ====> dog does not share the methods of the cat

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Lilou","Persian Cat",'F',3,"Medium","Grey");
        cat.eat();
        cat.sleep();
        cat.move();
        cat.drink();

        cat.scratch();
        cat.meow();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',5,"Large","Yellow");
        tiger.eat();
        tiger.drink();
        tiger.move();
        tiger.sleep();

        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);
    }
}
