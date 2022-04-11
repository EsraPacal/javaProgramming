package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    // in order to enter information about car
    public void setInfo(String carBrand, String carModel, String carColor,int carYear, double carPrice){
        brand = carBrand;
        model=carModel;
        color = carColor;
        year= carYear;
        price = carPrice;
    }

    public void drive(){
        System.out.println("I drive a "+color+" "+model);
    }

    public void stop (){
        System.out.println(brand+" "+model+" has stopped in the middle of the route");
    }
    public void start (){
        System.out.println(brand+" "+model+" has started.");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
