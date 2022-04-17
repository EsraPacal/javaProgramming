package day40_FinalKeyword;

public class Animal {

    private String name;   // name is changeable
    private final String breed;  // the breed of the animal does not change
    private final char gender;  // the gender of the animal does not change
    private final String color;  // the color of the animal does not change
    private String size;     // size is changeable
    private int age;     // age is changeable

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    //---------------------------------Setter----------------------------//  read the data

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    // ------------------------Setter------------------------------//  ====> in order to write data
    // setter method =====> we can generate only for the non-final variables
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //-------------------------------Final Method-------------------------//

    public void eat(){    // All the animals eat different meal. The method can be changeable. So, we can not use the final keyword(method)
        System.out.println(name+" is eating");
    }

    public final void drink(){  // this implementation is same for all the animals.
        System.out.println(name+ " is drinking water");
    }



}


