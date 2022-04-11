package day34_GarbageCollection_AccessModifiers;

// only static members of a class are imported with static import
import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

      //  System.out.println(Circle.pi); it's not necessary to call the class name
        System.out.println(pi);  // if the static member was imported, we can directly use the member in print state. without calling the class name
      // but, if we don't import the member, when we call any member from another class, we must call the class name in print stat.

    }
}
