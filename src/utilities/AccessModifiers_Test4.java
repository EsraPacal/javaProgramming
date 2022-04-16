package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //System.out.println(AccessModifiers_Test4.name1);  // name1 ==> not visible outside the package
        System.out.println(AccessModifiers_Test4.name2);  // it can be visible outside the package when the class outside the package is subclass

        //AccessModifiers_Test4.method1();  // default (static) method is not visible outside the package
        AccessModifiers_Test4.method2();  // protected method is visible outside the package in subclass.
    }
}
