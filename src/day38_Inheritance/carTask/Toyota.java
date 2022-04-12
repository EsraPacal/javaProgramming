package day38_Inheritance.carTask;

public class Toyota extends Car{

    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }

    @Override   // in order to check the method is overridden  or not
    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }


}
/*
Create the following sub classes of Car:
			1. Toyota:
					extra methods:
							reliabile()

			2. BMW:
					extra methods:
						breaksDown()
						racing()

			3. Tesla:
					extra methods:
						autoPilot();
 */