package day47_Polymorphism;

public class InheritanceReview {
    int a;

    // public InheritanceReview(){     // If Constructor was default, subclasses call it implicitly, otherwise explicitly
    public InheritanceReview(int a){     // Constructor will be called explicitly by the subclasses
        System.out.println("Parent class' constructor");
    }

    void method1(){     // Method of inheritance

    }

}


class A extends  InheritanceReview{

    public A(int a) {
        super(a);  // constructor of superclass
    }

}

class B extends  InheritanceReview{

    public B(int a) {
        super(a);
    }
}

class C extends  InheritanceReview{

    public C(int a) {
        super(a);
    }
}


class Aa extends A{

    public Aa(int a) {
        super(a);
    }
}

class Bb extends B{

    public Bb(int a) {
        super(a);
    }
}

class Cc extends C{

    public Cc(int a) {
        super(a);
    }
}

class D{
    void m(){
        super.toString(); // Object class
    }


}
