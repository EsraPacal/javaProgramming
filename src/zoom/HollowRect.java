package zoom;

public class HollowRect {

   /* public static void printHollowRect(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i>0&&i<4&&j>0&&j<4){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    */

    public static void main(String[] args) {

        String str = "*";

        for (int i = 0; i < 5; i++) {
            System.out.print(str);
        }
            System.out.println();


        for (int i = 0; i <3; i++) {

            System.out.print(str);

            for (int j = 0; j < 3; j++) {

          }
            System.out.println("   "+str);
        }

       for (int i = 0; i <5 ; i++) {
            System.out.print(str);

        }
        System.out.println();  // not necessary for this task but in order to pass the following line we need to use println after print methd

     }

}


