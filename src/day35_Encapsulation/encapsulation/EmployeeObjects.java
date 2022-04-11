package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Esra",'F',32,70000);
        employee1.setAge(25);

        Employee employee2 = new Employee("Samet",'F',30,90000);
        employee2.setName("Elvira");
        employee2.setSalary(employee2.getSalary()+15000); // adding to salary 15000


        System.out.println(employee1);  // before printing the object, we have to make sure that if toString method is created or not
        System.out.println(employee2);







    }
}
