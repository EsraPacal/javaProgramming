package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

//__________________________________________________
        int c = b;  // c= 15;      // c = temporary variable


        b = a;    // b=10
        a = c;

//___________________________________________________
        System.out.println("a = " + a);   // 15
        System.out.println("b = " + b);    // 10

    }
}
/*
1. Write a program that can swap two variables' value by using a temporary variable

       Ex:

           if a= 10   b= 15

           output:
           a= 15
           b=10


 */