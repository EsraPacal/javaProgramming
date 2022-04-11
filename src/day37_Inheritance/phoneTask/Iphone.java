package day37_Inheritance.phoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, double price, String color) {  // I deleted String brand because now it s not an instance
        super("Apple", model, size, price, color);  // all the brands of Iphone is Apple... So, it can be given a value to the brand in this class
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+" is having a Face Time with"+ phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+" is having a Face Time with"+ email);
    }


}


/*
1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */