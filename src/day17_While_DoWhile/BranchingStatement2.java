package day17_While_DoWhile;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for ( char i= 'A'; i<= 'E'; i++){

            if(i == 'C'){    // 'C' will be skipped, then 'D' and 'E' will be printed

                continue;
            }
            System.out.println(i);
        }

        System.out.println("-------------------------------------");

        // print all the even numbers 1~ 10 (skip the odd numbers)

        for (int i = 1; i <= 10; i++ ) {

            if (i%2 != 0){  // !=

                continue;

            }
            System.out.println(i);

        }

        System.out.println("-------------------------------------");

        // print all the odd numbers 1-10

        for(int i =1; i<= 10; i++ ){

            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
