package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);  // int  ====>
        //  int  = int converted from String  ========> assignment

        System.out.println(num+1);  // 124  =======>
        System.out.println(str+1);  // 1231

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2+1); // 11.5


        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;

        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);

        String s1 = "true";

        boolean b = Boolean.parseBoolean(s1);

        System.out.println(b);

        System.out.println("-----------------------------------");

        String s2= "123";
        Integer x = Integer.valueOf(s2);  // Integer     // valueOf=====> converts String into the Wrapper Class
        int y = Integer.valueOf(s2);   // Integer

        System.out.println("y = " + y);
        System.out.println("y = " + y);

        String s3 = "1.5";
        Double z = Double.parseDouble(s3);    // Double

        System.out.println("z = " + z);

        System.out.println("-------------------------------------");


        char ch1 = 'A';

        // isDigit()
        boolean r2 = Character.isDigit(ch1);

        // isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4 = ! Character.isLetterOrDigit(ch1);

        //upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("----------------------------------------");

        String s= "ab1cd2ef3g4";

        int sum = 0;

        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }
        System.out.println("sum = " + sum);





    }
}
