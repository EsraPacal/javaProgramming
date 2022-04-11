package day35_Encapsulation;

public class CydeoStudents {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;

    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudents(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{
        schoolName="Cydeo";
        programmingLanguage="JAVA";
        secretCode= "WoodenSpoon";
    }

    public static void printProgrammingLanguage(){
        System.out.println("language is "+ programmingLanguage);
    }

    public static void printSecretCode(){
        System.out.println("code is "+secretCode);
    }

    public void attendClass(){
        System.out.println(name+" is attending class.");
    }

    public  void study(){
        System.out.println(name+" is studying.");
    }

    // if in the method, there is both instance and static, then we must not use static keyword
    public String toString() {  // we can not use static keyword because static does not accept the instances. ex;name, age...
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", school='" + schoolName + '\'' +
                ", programming language='" + programmingLanguage + '\'' +
                '}';
    }
}

/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()


 */