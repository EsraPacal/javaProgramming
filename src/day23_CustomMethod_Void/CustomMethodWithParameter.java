package day23_CustomMethod_Void;

public class CustomMethodWithParameter {

    public static void main(String[] args) {


      //  oddOrEven();  // the method demands additional info to complete its task

        oddOrEven(10);

        System.out.println("-------------------------------------------------");
        
        ageOfPerson(1989);

        System.out.println("-------------------------------------------------");

        printNumbers(20,35);


    }





    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number){

        if(number%2== 0){
            System.out.println(number+" is Even number");
        }else{
            System.out.println(number+ " is Odd number");
        }






    }
    
    
    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        
        int age = 2022 - birthYear;

        System.out.println("Your age is " + age);
        
        
    }


    // create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){

        for (int i = 20; i <=35 ; i++) {

            System.out.print(i+" ");
        }

    }


}
