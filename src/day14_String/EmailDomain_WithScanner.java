package day14_String;

import java.util.Locale;
import java.util.Scanner;

public class EmailDomain_WithScanner {
    public static void main(String[] args) {

        // String email = "Esra.Pacal@gmail.com";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a valid email address");
        String email = scan.nextLine();

       // domain;
        int beginningIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex , endingIndex);
        //String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(domain);

        scan.close();    // closing the scan





    }
}
