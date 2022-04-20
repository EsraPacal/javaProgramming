package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("-------------Push up started--------------------");


    for (int i = 1; i <=30 ; i++) {

                                           // "\r"  used for timer
        System.out.print("\rPush up "+i); // escape sequences ===>  "\r" ==> repeat all the push-ups in one line

             sleep(1.5);   // in Selenium, this way will be used

        /*
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */    // second way to create a timer

    }
        System.out.println("\n-------------Push ups completed-------------");


        System.out.println("---------------Pull up started----------------");

        for (int i = 1; i <=20 ; i++) {

            System.out.print("\rPull up "+i);


                sleep(2.5);  // calling the custom method we created following lines (sleep method)

        }

        System.out.println("\n----------------Pull ups completed-----------------");


        }


        //                       2.5
        public static void sleep(double seconds){   // custom method to be called =====> this method is the best solution to handle the exceptions.
            try {
                //           casting double to long
                Thread.sleep( (long) (seconds * 1000) );  // 2.5 * 1000 = 2500 seconds ====> converting the seconds into the minutes
            } catch (InterruptedException e) {
                e.printStackTrace();
            }





        }
}

/*
Warmup task:
	MorningWorkOut:
			1. Do 30 push-ups and try pausing 1.5 seconds in each


			2. Do 20 Pull-ups and try pausing 2.5 seconds in each
 */
