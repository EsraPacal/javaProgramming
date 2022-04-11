package day14_String;

public class EmailDomain2_Substring {
    public static void main(String[] args) {

        String str1 = "Java is fun, Java is cool";
        //             0123456789
        //
        String s1 = str1.substring(0, 10+1) ;  // Java is fun

        int beginn =str1.lastIndexOf("J");

        String s2 = str1.substring(beginn);   // Java is cool

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("---------------------------------------------");

        String str3 = "Java is fun, Java is cool, I love Java";
        //             0123456789
        //
        String s3 = str3.substring(0, 10+1) ;  // Java is fun

        int beg = str3.indexOf(" J")+1; // in order not to print space" " , we add +1
        int end = str3. lastIndexOf(",");

        String s4 = str3.substring(beg,end);   // Java is cool

        System.out.println(s3);
        System.out.println(s4);

        String s5 = str3.substring(str3.lastIndexOf("I"));

        System.out.println( s5);

    }
}
