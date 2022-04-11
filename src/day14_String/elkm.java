package day14_String;

public class elkm {
    public static void main(String[] args) {

        String str = "    ı  CaN't  iMagİne  A  liFe  wiThout  jaVa       ";

        str = str.trim().replace("  ", " ").toLowerCase();
        str = (str.toUpperCase().charAt(0) + str.substring(1, str.length() - 4)
                + str.toUpperCase().charAt(str.length() - 4)
                + str.substring(str.length() - 3) + "\n").repeat(str.indexOf("c") + str.lastIndexOf("w"));

        System.out.println(str);


    }
}
