package day03_EscapeSequences;  // package name of the class

public class Println_VS_Print2 {

    public static void main(String[] args) {

        System.out.println("Knock Knock");  // first it prints Knock Knock, and then it appends a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("--------------------------------");

        System.out.print("Knock Knock");  // prints Knock Knock, does not append a new line
        System.out.print("Who is this?");
        System.out.println("this is Java");

        System.out.println();
        System.out.println("---------------------------------");

        System.out.println("Hello everyone? How are all today? Today, we will learn Escape Sequences, and next week we will learn Variables ");

        System.out.println("-----------------------------------");

        System.out.print("Hello Everyone, How are you all today?");
        System.out.print("Today, we will learn Escape Sequences, ");
        System.out.print("and next week we will learn Variables");

        System.out.println();


    }


}


 //Single Line Comment goes here