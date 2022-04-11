package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();
        //create 100 pizza objects: size -'S', cheese topping -2, pepperOni topping -3
        //create 100 pizza objects: size -'M', cheese topping -3, pepperOni topping -4
        //create 100 pizza objects: size -'L', cheese topping -4, pepperOni topping -5

        for (int i = 0; i < 100 ; i++) {

            Pizza smallPizza = new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza = new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza) );

            // if you print the print statement following in the loop, it will be printed 300 times
        }
        System.out.println("Total number of pizza: "+pizzas.size());
        
        double totalPrize = 0;

        for (Pizza pizza : pizzas) {
            totalPrize += pizza.calcCost();
            
        }
        System.out.println("totalPrize = " + totalPrize);
    }
}
