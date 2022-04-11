package day18_NestedLoop;

public class Carre_NestedLoop {

    public static void main(String[] args) {

        String shape= "* ";

        for (int s = 0; s < 10; s++) {


            for (int i = 0; i < 10; i++) {
                System.out.print(shape);

            }
            System.out.println();
        }
    }
}
