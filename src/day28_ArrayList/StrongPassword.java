package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "E1254P52*k";

        boolean r1 = password.length()  >= 8 && ! password.contains(" ");  // it has to contain space and length will have 8 chars
        boolean r2 = false;  // has upper case
        boolean r3 = false;  // has lower case
        boolean r4 = false;  // has digit
        boolean r5 = false;  // has special char

        char[] chars = password.toCharArray();

        for (char each : chars) { // forEachLoop is used for array... we can also use regular for loop without using array(foreach)
            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r4 = true;
            }else{                // special char
                r5 = true;
            }


        }
        boolean strong = r1 && r2 && r3 && r4 && r5;

        System.out.println(strong);




    }
    // we can solve this problem in custom method also
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length()  >= 8 && ! password.contains(" ");  // it has to contain space and length will have 8 chars
        boolean r2 = false;  // has upper case
        boolean r3 = false;  // has lower case
        boolean r4 = false;  // has digit
        boolean r5 = false;  // has special char

        char[] chars = password.toCharArray();

        for (char each : chars) { // foreachloop is used for array... we can also use regular for loop without using array(foreach)
            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r4 = true;
            }else{                // special char
                r5 = true;
            }


        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }

}

    /*
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:

        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lower case letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit

     */
