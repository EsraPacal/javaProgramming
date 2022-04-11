package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Jade",'F',5264,"SDET",40000,true);

        Employee employee2 = new Employee();
        employee2.setInfo("John",'M',5282,"QA",20000,false);

        Employee employee3 = new Employee();
        employee3.setInfo("David",'M',5652,"PO",60000,true);

        Employee employee4 = new Employee();
        employee4.setInfo("Mary",'F',5261,"DEV",80000,true);

        Employee employee5 = new Employee();
        employee5.setInfo("Jade",'F',5264,"SDET",25000,false);


        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        int countFullTime =0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {

            if(employee.isFullTime){
                countFullTime++;
            }else {
                countPartTime++;
            }
            if (employee.salary > max) {
                max = employee.salary;
            }
            if (employee.salary< min){
                min = employee.salary;
            }


        }

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

/*
Employee Class:

		Attributes:
			name, id, gender, jobTitle, salary, isFullTime(boolean)

		Actions:
			toString(): to be able to print each employee object
			setInfo(): to be able to set all the attributes
			work()...

CapitalOne Class:

	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary


 */