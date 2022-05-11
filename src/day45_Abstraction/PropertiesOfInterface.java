package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100;  // static & final by default
    static int b = 200;  // final by default

    /*
    public PropertiesOfInterface(int a){
        this.a=a;
    }

     */  // constructor can not be created in interface, because it doesn't support the objects because, interface is not a class

    /*
    static{
        b=100;
    }

     */   // static block works when the class is run, but interface is not a class,so we cannot use it in interface

    /*
    public void method1(){
        System.out.println("Instance Method");
    }

     */  // for instance method, it s necessary to declare it. but, interface is not a class. We cannot declare

    public static void method2(){  // variables are static by default. in order to use static variables, we need to create static method
        System.out.println("Static Method");
    }

    void method3();  // abstract method ===> public and abstract by default

    public default void method4(){
        System.out.println("Default method");  // if we create a method that all the subclasses will implement same body, we use default method
    }


class Test implements PropertiesOfInterface{


    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();
    }
}

}
