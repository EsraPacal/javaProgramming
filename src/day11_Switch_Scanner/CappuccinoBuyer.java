package day11_Switch_Scanner;

public class CappuccinoBuyer {
    public static void main(String[] args) {

       char size= 'V';


        if( (size== 'T') || (size== 'G') || (size=='V')){

            switch (size){

                case 'T':
                    System.out.println("tall:\n       price is $3.69 \n       90 calories");
                    break;
                case 'G':
                    System.out.println("grande:\n       price is $3.99 \n       120 calories");
                    break;
                default:
                    System.out.println("venti:\n       price is $4.29\n       150 calories");
                    break;

            }


        }else{
            System.out.println("Invalid Size");
        }






    }
}
            /*
       1. Create a class called  CappuccinoBuyer. A variable named Size is given,
       write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed

             */