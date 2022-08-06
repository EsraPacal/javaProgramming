package day45_Abstraction.shape;

public interface Volume {

    boolean hasVolume = true;  // static and final variable ===> boolean is not an object

    double volume();  // public abstract method

   /*
    default void drink(){
        System.out.println("Drinks water");
    }  // in default method of Interface, it's necessary to add the "default" keyword...

    */

}


/*
abstract class AA{

}  //  default class

interface B{


}  // default clas

interface C{

}   // default class

 */