package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args){
        //hourly Rate, weeklyHours

        int hourlyRate = 50;
        int weeklyHours =40;
        int numberOfWeeks = 52;

       // int salary = hourlyRate * weeklyHours * numberOfWeeks;

        int salary = hourlyRate * weeklyHours * 52;

        // System.out.println(salary);    (soutv)

        System.out.println("salary = $" + hourlyRate);
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);


    }



}
