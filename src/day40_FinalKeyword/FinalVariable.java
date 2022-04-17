package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;  // before using these variable, it needs to be initialized by constructor. Otherwise, it gives compile error

    final static String name;  // we have to use static block "setter" in order to prevent the error

    static{
        name="Batch 25";
    }



    public FinalVariable(String birthDay) {

        this.birthDay = birthDay;
    }





    public static void main(String[] args) {

        // if we declare the variable within the main method, the variable is always local variable

        final double pi= 3.14;

        // pi= 4.14;    // we can not reassign the final variable
        // pi= 5.4;

        final String name;

        name= "Java";

       //  name = "Wooden Spoon";   // final variable, it can be assigned only one time

        System.out.println(name);

        System.out.println("------------------------------------------------");

        FinalVariable obj = new FinalVariable("September/13");

        // obj.birthDay= "June/01";   // final variable can not be reassigned

        System.out.println(obj.birthDay);  // birthday element of the obj

        System.out.println("---------------------------------------------------");

       // FinalVariable.name= "Python"; // final (static) variable can not be reassigned while the static variable can be reassigned

        System.out.println(FinalVariable.name);
    }
}
