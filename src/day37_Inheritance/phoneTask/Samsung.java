package day37_Inheritance.phoneTask;

public final class Samsung extends Phone {

    public Samsung(String model, String size, double price, String color) {

        super("Samsung", model, size, price, color);
    }

    public void call(long phoneNumber){
        System.out.println(model+" is calling "+ phoneNumber);
    }

    public  void freeze(){
        System.out.println(brand+" "+model+ " is freezing ");
    }

    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
Create a subclass of Phone named Samsung:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    freeze()
                    toString()
 */
