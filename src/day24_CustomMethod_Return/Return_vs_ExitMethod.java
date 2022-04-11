package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

        int number= 13;


    }


    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        if(number<1 && number>12) {

            System.err.println("Invalid");

            System.exit(0);  // exists all the system

        }

        String name = (number==1)? "jan" : (number==2)? "Feb" :(number==3)? "Mar" :(number==4)? "Avr" :(number==5)? "May" :
                (number==6)? "June" :(number==7)? "July" :(number==8)? "Aug" :(number==9)? "Sep" :(number==10)? "Oct" :
                        (number==11)? "Nov" : "Dec";


        System.out.println(name);
    }
}
