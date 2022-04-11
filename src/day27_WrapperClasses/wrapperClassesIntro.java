package day27_WrapperClasses;

public class wrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        // Long n1= num1;   // all the primitives are loyal to their own classes. I can be converted only into their own classes

        Integer n1 = num1;   // autoboxing

        int num2 = n1;   // unboxing

        System.out.println("-----------------------------------------");

        Integer integerValue = 100;

        long longValue = integerValue; // classes cen be converted into all the primitives as long as they are in range

        Byte b1 = 25;

        byte a1 = b1;
        short a2= b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("--------------------------------------------");

        int num3 = 200;

      //  Long l = num3;
      //  Double d = num3;

        Integer num4 = num3;  // autoboxing

        System.out.println("---------------------------------------------");
                                  // they are neither autoboxing nor unboxing
        Integer z = 900;
        Integer y = z;           // y assigns into z

        System.out.println("---------------------------------------------");

        int [] numbers1 = {1,2,3,4,5};
        Integer[] numbers2 = {1,2,3,4,5};


    }
}
