package day37_Inheritance.phoneTask;

public class Phone {  // parent class: only contains the common features of all the subclasses

    public String brand;  // if there are multiple brands====> instance variable
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery;
    // public static boolean hasBattery = true;  // we can give value here also, then we don't need to use static block

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static{   // in order to run static variable
        hasBattery= true;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+ " is calling "+ phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand+" "+model+ " is texting "+ phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
1.4 Create a sub class of Phone named Nokia:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    selfDefense()
                    toString()
 */
