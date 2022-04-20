package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) throws ArithmeticException {   // throws keyword is used only for the checked exceptions

        System.out.println("Test completed");

        System.out.println(8/0);  // unchecked/runtime exception

        System.out.println("Test completed");  // This statement will not be printed
    }
}
