package day11_Switch_Scanner;

public class NewCappuccino {
    public static void main(String[] args) {

        String size= "grande";


        if( (size== "tall") || (size== "grande") || (size=="venti")){

            switch (size){

                case "tall":
                    System.out.println(size+":\n       price is $3.69 \n       90 calories");
                    break;
                case "grande":
                    System.out.println(size+":\n       price is $3.99 \n       120 calories");
                    break;
                default:
                    System.out.println(size+":\n       price is $4.29\n       150 calories");
                    break;

            }


        }else{
            System.out.println("Invalid Size");
        }






    }
}
