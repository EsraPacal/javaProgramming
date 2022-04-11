package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
      //System.out.println(AccessModifiers.defaultData); // default access modifier is not visible outside its own class and own package
      //System.out.println(AccessModifiers.privateData); //private access is not visible outside its own class


        AccessModifiers.method1();
       //AccessModifiers.method2();
       // AccessModifiers.method3();


    }
}

class Default{  // in the same package, it can be only one public class. this class is default class

}