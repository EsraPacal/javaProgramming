package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        // age: 38 years old

        byte x = 38; // x= age

        // weight: 160 pounds
        // byte weihgt = 160;     // 160 is out of byte' range
        // byte num = -129;     // -129 is out of byte' range
        short weight = 160;      // 160 is within the range of short

        // salary : 100000 $    // y = salary
        // short y = 100000;     // 100000 is out of short' range
        int salary = 100000;     // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;


        // tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);

        char grade = 'F';
        System.out.println("grade = " + grade);

        char yesNo = 'Y';
        System.out.println("yesNo = " + yesNo);

        // char ch5 = 'AB'

        boolean isEmployed = true;
        boolean isMarried = false;

        boolean result = 100>300 ;

        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);




    }



}
