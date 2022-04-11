package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@°) (#$%WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {  // OR i <= str.length()-1  // i: index numbers of str (0 ~ last index)

            char ch = str.charAt(i);  // ch: each char that we have in str

            if (ch >= '0' && ch <= '9') {   // if the character is between '0' and '9' than  it s digit
                digits += ch;

            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {  // if the char is between 'A, a' and 'Z, z' then it s letter
                letters += ch;

            } else { // the char is neither digit nor letter, then it s special char
                if (ch != ' ') {    // if the special char is not a space
                    specialChars += ch;

                }

            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(specialChars);

    }
}
