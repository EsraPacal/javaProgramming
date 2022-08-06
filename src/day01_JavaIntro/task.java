package day01_JavaIntro;

import java.util.Scanner;

public class task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        /*sender = message.substring(message.indexOf("<")+1, message.lastIndexOf(">"));

        phoneNumber =  message.substring(message.indexOf("[")+1, message.lastIndexOf("]"));

        messageBody =  message.substring(message.indexOf("{")+1, message.lastIndexOf("}"));

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);

         */

        System.out.println("message = " + message);

    }
}
