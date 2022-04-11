package day06_PrimitiveTypeCastings;

public class Birthday {

    public static void main(String[] args) {


        String name = "John";
        int birthDay = 25;
        String month = "April";
        int birthYear = 1995;

        System.out.println(name + " was born on " + month + "/" + birthDay + "/" + birthYear + "." );


        System.out.println("________________________________________________________");


        // My favorite book is "bookName"

        String bookName = "Germinal";

        System.out.println("My favorite book is \"" + bookName + "\".");

        /*
         \n
         \t
         \'
         \"
         \\


         */


    }
}


      /*
      1. Create a class named BirthDay and create the following variable
			 name, birthDay(int), birthMonth(String), birthYear(int)

			 use concatenation to display the birthday of the person

			 	if  name = "John"
			 		birthDay = 25
			 	    birthMonth = "April"
			 	    birthYear = 1995;

			 	output:
			 		John was born on April/25/1995.
		*/