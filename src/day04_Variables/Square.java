package day04_Variables;

    /*
       Task:
       1. Create a class named Square, write a program that can calculate
       the area & perimeter of any given square
                            side(3.5)

                          area = side * side
                          perimeter = 4 * side
  */


public class Square {

        public static void main(String[] args) {

                double side = 5.5;

                double area = side * side;
                double perimeter = side * 4;

                System.out.println("side = "  + side);
                System.out.println("area = " + area);
                System.out.println("perimeter = " + perimeter);



        }


}
