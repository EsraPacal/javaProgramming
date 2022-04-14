package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.out.println("Name can not be null");
            System.exit(1);  // 1: something went wrong. Unexpected event
        }

        if( name.isEmpty()){
            System.out.println("invalid name");
            System.exit(1);  // 1: something went wrong. Unexpected event
        }
        this.name = name;
    }

    public Shape(String name) {
        setName(name);
    }

    public double area(){
        return 0; // if implementation is not needed, return method isn't necessary
    }

    public double perimeter(){

        return 0; // if implementation is not needed, return method isn't necessary
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}



 */