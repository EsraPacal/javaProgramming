package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        //String username= "Cydeo";
        //String password= "Cydeo123";


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");

        String username= scan.next();

        System.out.println("Enter your password: ");

        String password = scan.next();

        if(username.equals("Cydeo")  && password.equals("Cydeo123") ) {

            System.out.println("Logged in");

        }else{

            int attempt = 3; // 3, 2 , 1

            while( !(username.equals("Cydeo")  && password.equals("Cydeo123") )  && attempt>0){ //while the credentials are invalid
                System.out.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username:");
                username= scan.next();

                System.out.println("Enter your password:");
                password= scan.next();

                attempt--;  // 3, 2, 1

            }
            if(username.equals("Cydeo") && password.equals("Cydeo123") ){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked");
            }
        }

        scan.close();






    }
}
/*
  2. You are writing a code for the log-in fu.nction of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123
 0;0;00;0000.
        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."



    	for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}

    	}





 */