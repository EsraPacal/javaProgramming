package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person();
        // p1.name="Daniel";   // it cannot be accessed directly to the name, because instance variable is private
        // p1.age=28;

        p1.setName("Daniel");
        p1.setAge(35);

       //  System.out.println(p1.name + " : "+p1.age); =====> false

        System.out.println(p1.getName()+" : "+p1.getAge());






    }


}
