package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "     batch 25     ";
        str1 = str1.trim();  // "batch 25" // by the trim method, the unnecessary spaces at the beginning and at the end of the paragraph
                                // will be dissimulated.
        System.out.println(str1);
        
        String str2 = "Cydeo School";
               int n1 = str2.indexOf("h");

        System.out.println("n1 = " + n1);
        
        int n2 = str2.indexOf("o");

        System.out.println("n2 = " + n2);

        int n3 = str2.indexOf("ool");   // it gives the premier number "o" in this syllable.
        System.out.println("n3 = " + n3);  // result: 9
        
        String str3 = "Java Programming Language";
        
        int n4 = str3.indexOf("a");
        System.out.println("n4 = " + n4);
        
        int n5= str3.indexOf("a ");
        System.out.println("n5 = " + n5);
        
        int n6= str3.indexOf("amm");
        System.out.println("n6 = " + n6);
        
        int n7 = str3.indexOf("ang");
        System.out.println("n7 = " + n7);
        
        int n8 = str3.indexOf("g");
        System.out.println("n8 = " + n8);
        
        int n9 = str3.indexOf("g ");
        System.out.println("n9 = " + n9);
         
        int n10 = str3.indexOf("gua");
        System.out.println("n10 = " + n10);

        int n11 = str3.lastIndexOf("g");  // used for the last index number which is asked... it's opposite of the indexOf Method.
        System.out.println("n11 = " + n11);

        System.out.println("-------------------------------------------------------");
        
        String s = "Java Nova Cava Wawa orange";
        
        int firstA = s.indexOf("a");

        System.out.println("firstA = " + firstA);
        
        int lastA= s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int secondA=  s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA= s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

       // int fourthA= s.indexOf("ava W");  the one way

        int fourthA = s.lastIndexOf("av"); // lastIndex starts from right to left. we have to count the index right to left
        // int fourthA = s.indexOf("Ca") +1;  // this format gives us the number of fourth index number "a"

        System.out.println("fourthA = " + fourthA);
        
       // int fifthA = s.lastIndexOf("va")+1;
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
        
        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);
        
        // int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);
        
        
        
        

    }
}
