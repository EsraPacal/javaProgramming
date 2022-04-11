package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {  // class  =========> public modifier



    class class1 {  // inner class ( nested class)  ========> default access modifier

    }

    public static int num = 100;  // variable

    public static void method(){  // method

    }

    static{ // block

    }
}


class A{ // outer class

    static class B{  // inner class

        public static void method1(){

        }

    }

}

class C{
    public static void main(String[] args) {

        A.B.method1();  // in order to call method B, we have to call through its class name
    }
}
