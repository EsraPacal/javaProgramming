package day11_Switch_Scanner;

import java.util.Scanner;   // scanner package is into the "Util" package, util package is into the "scanner" package.
                            // util pac. is imported from java pac. Scanner pac. is imported from util pac.

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");

        int num1= input.nextInt();

        System.out.println("Enter a decimal: ");

        double num2= input.nextDouble();

        System.out.println(num1);

        System.out.println(num2);

        System.out.println("multiplication: "+(num1*num2));


        input.close();   // closes the scanner, after this, scanner can not be use anymore




    }

}


