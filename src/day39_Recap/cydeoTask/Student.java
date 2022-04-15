package day39_Recap.cydeoTask;

public class Student extends Person{

   private int studentID;
   private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);   // derive from super class
        //this.studentID = studentID;   // change "this" keyword into "set" keyword, When you generate setter and getter
        //this.fieldOfStudy = fieldOfStudy;
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);  // when we create set method here, it will check the conditions
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){   // name is private instance. in order to call it outside the class, we need public getter and setter method
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName()+ '\'' +   // inherited from Person class
                ", age=" + getAge() +          //
                ", gender=" + getGender()+     //
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
