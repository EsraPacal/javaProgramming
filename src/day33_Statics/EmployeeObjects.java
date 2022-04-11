package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.name = "Esra";
        employee1.salary = 100000;

        Employee employee2 = new Employee();
        employee2.name= "Ahmet";
        employee2.salary= 120000;

        Employee employee3 = new Employee();
        employee3.name = "Sevil";
        employee3.salary = 115000;

        System.out.println(employee1.name+" : "+employee1.salary);
        System.out.println(employee2.name+" : "+employee2.salary);
        System.out.println(employee3.name+" : "+employee3.salary);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);
        System.out.println(employee3.isHuman);


    }
}
