package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str = "";

        boolean r = str.isEmpty();

        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);

        String str2 = "Cydeo";

        boolean r2 = str2.isBlank();
        boolean r3 = str2.isEmpty();

        System.out.println(r2);
        System.out.println(r3);

        System.out.println("-------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));              // it doesn't ignore the case type
        System.out.println(s1.equalsIgnoreCase(s2));   // it ignores the CASE type ( upper or lower case)

        System.out.println("------------------------------------------- ");

        System.out.println("yEs".equals("Yes"));
        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("--------------------------------");

        String sentence = "My favorite programming language is java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");    // or all toUpperCase!!!!!!!
        boolean result = sentence.contains("java") || sentence.contains("Java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);
        System.out.println("result = " + result);

        System.out.println("----------------------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2));   // false
        System.out.println(input1.equalsIgnoreCase(input2));    // false

        System.out.println(input1.contains("Java"));  // false

        System.out.println(input1.toLowerCase().contains("java"));  // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("-----------------------------------------");

        String a = "Wooden Spoon";

        boolean x= a.startsWith("Woo");  // true
        boolean x2 = a.startsWith("oo");   // false
        boolean x3 = a.startsWith("Spoon");   //false
        boolean y= a.endsWith("Spoon"); // true
        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first  create the lower case/ upper case version of string and then

        System.out.println(x);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(y);
        System.out.println(z);




    }
}
