package day37_Inheritance.phoneTask;

public class Nokia extends  Phone{

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println("You can "+brand+" "+model+" as self defense tool");
    }

    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
