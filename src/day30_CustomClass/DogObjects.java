package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name="Lucy";
        dog1.breed="Husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";

        Dog dog2 = new Dog();

        dog2.name="Charlie";
        dog2.breed="Bulldog";
        dog2.age=2;
        dog2.gender='M';
        dog2.size="Medium";
        dog2.color="White";

        Dog dog3= new Dog();

        dog3.setInfo("Bully","German Shephard",2,'M',"Large","Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();
        dog3.eat();


        Dog dog4 = new Dog();
        dog4.setInfo("Harry","Bulldog",4,'M',"Large","Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Shay","Chow Chow",3,'F',"Small","Yellow");

        System.out.println("----------------------------------------------");

        Dog[] dogs  = {dog1, dog2, dog3,dog4, dog5};

        ArrayList<Dog> femaleDog = new ArrayList<>();
        ArrayList<Dog> maleDog = new ArrayList<>();


    }
}


