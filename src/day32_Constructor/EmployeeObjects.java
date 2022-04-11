package day32_Constructor;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Esra");

        Employee employee2 = new Employee("Aaron",'M');

        Employee employee3 = new Employee("Florance",'F', "SDET");


        System.out.println(employee1);
    }
}
