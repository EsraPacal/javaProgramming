package day23_CustomMethod_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("-----------------------------------------------");

        helloCydeo5Times();

        System.out.println("-----------------------------------------------");

        evenNumbers();

        System.out.println("-----------------------------------------------");

        evenNumber2();


    }


    // create a function that can print hello world 5 times   =====> helloWorld5Times()
    public static void helloWorld5Times() {

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello World!");

        }

    }

    // create a function that can print hello Cydeo 5 times

    public static void helloCydeo5Times() {
        for (int i = 0; i < 5; i++) {


            System.out.println("Hello Cydeo1");
        }


    }


    // create a function that can print all the even numbers from 1 to 10 =====>   1~10 =====>even numbers
    public static void evenNumbers() {

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }

        }

    }
    // another form to find the even numbers
    public static void evenNumber2() {

        for (int i = 2; i <= 12; i += 2) {
            System.out.print(" \n"+i);
        }

    }


}
