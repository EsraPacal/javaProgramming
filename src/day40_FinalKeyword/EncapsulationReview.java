package day40_FinalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {

    private Circle circle;   // return type is Circle. And private variable is "circle".

    private Square square;

    public Circle getCircle(){
        return circle;  //

    }

    public void setCircle(Circle circle){ // whenever we set the new data, we have to set the parameter

        if (circle.getRadius() < 5){
            return;  // exits the method
        }
        this.circle=circle;

    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
