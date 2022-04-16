package day24_CustomMethod_Return;

public class WarmupTasks {

    public static void main(String[] args) {

        initialsOfPerson("Esra", "Pacal");

        System.out.println("----------------------------------------------------------");

        domain("esraksk.61@gmail.com");

        System.out.println("----------------------------------------------------------");

        String[] emails = {"omer@gmail.com", "ilhan@yahoo.com", "esra@cydeo.com"};
        for (String email : emails) {
            domain((email));

        }

        System.out.println("------------------------------------------------------");

        nameOfMonth(5);

    }


    // 1. Create a method that can display the initials of the person    // esra pacal =====>  E.P
    public static void initialsOfPerson(String firstname, String lastname){

       String initial = firstname.charAt(0)+"."+lastname.charAt(0);

        System.out.println("initial = " + initial);
    }


    // 2. Create a method that can display the domain of the email
    public static void domain(String email){
      String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf(".") );

        System.out.println(domain);

    }

    // 3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number){

        String name ="";

            if(number>=1 && number<=12){
                name = (number==1)? "jan" : (number==2)? "Feb" :(number==3)? "Mar" :(number==4)? "Avr" :(number==5)? "May" :
                        (number==6)? "June" :(number==7)? "July" :(number==8)? "Aug" :(number==9)? "Sep" :(number==10)? "Oct" :
                                (number==11)? "Nov" : "Dec";

            }else{
                name ="invalid";
            }
        System.out.println(name);
    }



}
 /*
    1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

   */