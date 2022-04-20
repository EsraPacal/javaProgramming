package day42_Exceptions;

import day31_Constructors.Rectangle;

import java.util.NoSuchElementException;

public class ThrowKeyword2 {

    public static void main(String[] args) {


        // the way to create an exception manually
        throw  new NoSuchElementException("No such Element");

        // throw new Rectangle(5,7);  // there no exception such as Rectangle
    }
}
