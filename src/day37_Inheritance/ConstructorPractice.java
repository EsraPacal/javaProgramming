package day37_Inheritance;

class A{
    //public A(){ // default constructor (non-parameter), compile call the class implicitly
    public A(int a){  // if the parent class is not default, it needs to call the parameter manually.
        System.out.println("A");
    }

}

class B extends A{

    public B(){
        super(9); // it has to be first step // if the parent class is not default, it needs to call the parameter manually.
        System.out.println("B"); // default constructor (non-parameter), compile call the class implicitly ===> B= A,B
    }

}

public class ConstructorPractice {

    public static void main(String[] args) {

        B object = new B();

        System.out.println(object);  // A  B
    }
}
