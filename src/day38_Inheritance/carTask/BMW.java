package day38_Inheritance.carTask;

public class BMW extends Car{

    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown(){
        System.out.println(brand+" "+model+" is breaking down");
    }

    public void race(){
        System.out.println(brand+" "+model+" is racing");
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