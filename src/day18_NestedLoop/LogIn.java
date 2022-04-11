package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your username:");
        String user= scan.next();

        System.out.println("Enter your password: ");

        String pass = scan.next();

        if(user.equals("Cydeo") && pass.equals("Wooden Spoon") ){
            System.out.println("Logged In");

        }else{
            for(int i =1; i< 4; i++) {

                System.out.println("Incorrect username or password");

                System.out.println("Enter your username: ");
                user= scan.next();

                System.out.println("Enter your password: ");
                pass= scan.next();

                if(user.equals("Cydeo") && pass.equals("Wooden Spoon") ){

                    System.out.println("Logged In");
                    break;
                }
            }
            if(!(user.equals("Cydeo") && pass.equals("Wooden Spoon")) ){
                System.err.println("Your account is locked, please contact support team");
            }

        }
        scan.close();


    }
}
  /*
          2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched,
                        the program should allow the user to have three attempts to enter correct credentials and
                         if all three attempts are failed, then print "Your account is locked."


         */