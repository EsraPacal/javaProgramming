package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] names ={"Esra Pacal","Sevil Aydogan","Ilhan Pacal","Omer Pacal","Oyku Kusak","Melihal Onal","Emine Aytekin"};

        for (String each : names) {  // each name separated  "Esra Pacal" ....

            String reversed = "";

            for (int i = each.length()-1; i >= 0 ; i--) {
                reversed += each.charAt(i);  //  "  +=  "  = adds the chars one by one

            }

            System.out.println(reversed);

        }





    }
}
