package day30_CustomClass;

public class Student {

    // instance variable
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    // for shortcut : right click ===> Generate===> Constructor====> SelectAll ===> ok
    public void setInfo(String name, char gender, int age, int ID, char grade) { // after generating method, write void setInfo
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

  /*

   //local variable
    public void setInfo(String name, char gender, int age, int ID, char grade){
        this.name = name;
        this.gender=gender;
        this.age= age;
        this.ID=ID;
        this.grade=grade;
    }

    */

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    // instance Method
    public void code() {  System.out.println(name+" is coding");  }

    public void sleep(){   System.out.println(name+ " is sleeping"); }


}
