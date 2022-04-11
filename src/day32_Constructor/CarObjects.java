package day32_Constructor;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("AUDI","A8");

        Car car3 = new Car("Citroen","Zara",2018);

        Car car4 = new Car("Toyota","YARIS",2015,20000);

        Car car5 = new Car("RENAULT","Cynic",2007,5000,"Grey");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}
