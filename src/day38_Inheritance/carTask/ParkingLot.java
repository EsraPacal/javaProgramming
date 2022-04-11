package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Yaris",2020,25000,"Gray",10000);

        Tesla tesla = new Tesla("Model S",2021,95000,"Black",0);

        BMW bmw = new BMW("QS",2019,20000,"White",70000);

        toyota.start();
        tesla.start();
        bmw.start();

    }
}
