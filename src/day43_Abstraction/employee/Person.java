package day43_Abstraction.employee;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    // if we use "this" keyword instead of "set" keyword, then the preconditions that we created in the setter method will not be executed
    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
           throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }



    public abstract void sleep();// abstract in order to ignore the small details

    public void eat(){
        System.out.println(name+" is eating Baklava");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
