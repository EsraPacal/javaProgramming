package day15_ForLoop;

public class Alphabet{

    public static void main(String[] args) {

        /*

        Print :
        A~Z
        a~z
        Z~A
        z~a

         */

        for( char i= 'A'; i<= 'Z'; i++){
            System.out.print(i+" ");
        }

        System.out.println("\n------------------------------------");

        for(char i ='Z'; i>='A'; i--){
            System.out.print(i+" ");
        }

        System.out.println("\n-------------------------------------");

        for(char i='a'; i<='z'; i++){
            System.out.print(i+" ");
        }

        System.out.println("\n---------------------------------------");

        for (char i='z'; i >= 'a'; i--){
            System.out.print(i+" ");
        }

    }
}
