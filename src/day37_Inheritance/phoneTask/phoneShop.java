package day37_Inheritance.phoneTask;

public class phoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12","6.7 inches",1000,"Black");

        Samsung samsung = new Samsung("Galaxy S19","4 inches",900,"Gray");

        Nokia nokia = new Nokia("Brick","6 inches",50,"White");

        System.out.println();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println();

        iphone.call(911);
        iphone.text(123456788);
        iphone.faceTime(123654887);
        iphone.faceTime("esra@gmail.com");

        System.out.println("---------------------------------------------------");

        samsung.call(1254639);
        samsung.text(7896544);
        samsung.freeze();

        System.out.println("---------------------------------------------------");

        nokia.call(4563217);
        nokia.text(5563214);
        nokia.selfDefense();

        System.out.println("----------------------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);



    }
}
