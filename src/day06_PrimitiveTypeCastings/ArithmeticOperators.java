package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10+20); // 30, Addition
        System.out.println(100-50);
        System.out.println(25*2);
        System.out.println(100/3);  // 33
        System.out.println((double) 10/4);
        System.out.println(50d/2);   // also can be added "d" letter d= decimal

        int a = 100;
        double b = a/6;  // 16.0
        System.out.println(b);

        double c = (double) a/6;

        System.out.println(c);


        System.out.println(100D);  // added "D"

    }

}

     /*
         +: Addition
         -: Subtraction
         *: Multiplication
         /: Division
         %: Remainder

                  integer / integer =======> integer
                  decimal / integer =======> decimal
                  integer / decimal =======> decimal
                  decimal / decimal =======> decimal


                  in maths:
                        10/4 = 2.5


                  in java:
                         10/4: 2  // 10 = int number

                         10.0 /2 : 2.5 //   10.0 = floating num
     */