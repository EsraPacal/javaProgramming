package day44_Abstraction_Interface.animalTask;

public interface Playable {

    boolean isFriendly = true;   // static & final by default

   /*
    public static void method1{
        System.out.println(isFriendly);
    }

    */

    // public access mod. is the only access mod. in interface and given by default
    void play();  // this method is abstract by default
}
