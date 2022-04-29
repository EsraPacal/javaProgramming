package day43_Abstraction.car;

public final class Audi extends Car{

    public Audi( String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push the start button");

    }

    // this method can't be inherited, since the class signature has final keyword
    public void autoPark(){  // in order not to be copied this method, add final keyword to the class signature
        System.out.println(getBrand()+" "+getModel()+" has auto park feature");
    }
}
