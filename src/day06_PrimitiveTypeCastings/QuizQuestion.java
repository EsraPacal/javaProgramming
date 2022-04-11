package day06_PrimitiveTypeCastings;

public class QuizQuestion {

    public static void main(String[] args) {

        long a= 3_000L;
        double b = (float)a;
      //  System.out.println(b%1000);      // result= 0.0
        int c= (short)b;

        System.out.println(c % 1000);

        int h= 5000;
        double j = (float)h;

        System.out.println(j);
    }
}
