package day37_Inheritance.phoneTask;

public final class Iphone extends Phone{  // final class Iphone can NEVER be a parent (super) class
 // if the class is final, we don't need to use final keyword for the variables or methods. from the final class, there is no way to override the instances

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