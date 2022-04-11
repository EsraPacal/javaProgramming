package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {

        String str = "Cydeo";

        String str2 = str.repeat(4);   // on the console, it repeats the String 4 times.
                                       // CydeoCeydeoCydeoCydeo
        System.out.println(str2);

        String s1 = "Wooden Spoon ";  // give a space after Spoon in order to make it readable.
        String s2 = s1.repeat(30);

        System.out.println(s2);

        System.out.println("--------------------------------------------");

        System.out.println("FADY ".repeat(10));
        System.out.println("ESRA\n".repeat(10));


        String name = "Java";

        // System.out.println( name.repeat(5));
        System.out.println(name + " ".repeat(5));


    }
}
