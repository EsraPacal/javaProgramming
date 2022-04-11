package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static{   // always, first, static block will be executed
        System.out.println("Static Block");
    }

    public Constructor_vs_StaticBlock(){  // it won't be executed because. the execution of the Constructor depends on the object.
        System.out.println("Constructor");  // the object was not created, so this block will never run in this case
    }
    public static void main(String[] args) { // then main method
        System.out.println("Main Method");

        // but now the object of the Constructor is created, so Constructor block will be executed now
        new Constructor_vs_StaticBlock(); // 1
        new Constructor_vs_StaticBlock(); // 2
        new Constructor_vs_StaticBlock(); // 3
        new Constructor_vs_StaticBlock(); // 4
        // it is enough to create the object in order to run the Constructor. it's not printed in print statement
    }

}
