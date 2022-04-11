package week03;

public class DivisionAndRemainderPractice {

    public static void main(String[] args) {

        // input is some amount of seconds  (45000)
        //hours : minutes : seconds

        int inputSeconds = 4000;
        int hours, minutes, seconds; // declared

        /*
        Algorithm:
        1. 1 minute is 60 seconds, 1 hour 3600 seconds
        2. remainder
         */

        seconds = inputSeconds%60;
        minutes = inputSeconds/60;
        hours = inputSeconds / 3600;

        String clock = "Hours : "+hours +" Minutes : " + minutes + " Seconds : " + seconds;

        System.out.println("clock = " + clock);


    }
}
