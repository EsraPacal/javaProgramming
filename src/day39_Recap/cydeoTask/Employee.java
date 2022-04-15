package day39_Recap.cydeoTask;

public class Employee extends Person {

    private int employeeID;
    private String jobTitle;
    private double salary;  // if I use public modifier, I can not give any condition. for ex; salary can be also $ -10000. It's a bug...

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");  // name has private modifier. in order to access it, we should use getName...
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +   // inherited private instance
                ", age=" + getAge() +            // inherited private instance
                ", gender=" + getGender() +        // inherited private instance
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}


/*
 2. Create a subclass of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()
 */