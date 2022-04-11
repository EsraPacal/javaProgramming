package day18_NestedLoop;

public class TriangleNested {

    public static void main(String[] args) {
        
        String str= "* ";

        for (int i = 0; i < 10; i++) {
            System.out.print(str);
            i++;

            for (int j = 0; j < 9 ; j++) {

                System.out.print(str);
                j++;
                String result= j +str;
                System.out.println(result.substring(0,result.length()-1));
            }

        }

     

    }
}
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *

 */