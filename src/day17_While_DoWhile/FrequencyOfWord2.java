package day17_While_DoWhile;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String str = str = "Cat Cat Python CAT Dog Python cat cAT";

        int frequency = 0;

        // < str.length () -2  =======>   same solution
        for (int i = 0; i <= str.length() -3; i++) {   // in order not to exceed the length while we are adding 3 to each ch,
            // we need to subtract 3 from the length !!!!!

            String eachSub = str.substring(i, i + 3);

            //  System.out.println(eachSub);

            if (eachSub.equals("Cat")) {
           // if ( eachSub.equalsIgnoreCase("Cat"){     // case insensitive method: result ======> 5
                frequency++;

            }
        }
        System.out.println(frequency);

    }
}
