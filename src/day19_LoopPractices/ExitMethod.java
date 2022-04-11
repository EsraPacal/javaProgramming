package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {

            if(i == 3){
                // break;  // terminates the loop
                // continue;  // skips number 3 then continues printing the other numbers
                           // terminates the current iteration of the loop

                System.exit(0);  // terminates the program
            }

            System.out.println(i);

        }
        System.out.println("Wooden Spoon");
    }
}
