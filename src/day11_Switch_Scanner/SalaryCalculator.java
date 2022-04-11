package day11_Switch_Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 75_000;
        boolean isMarried = true;

        double taxRate =0;     // temporary value

        if(salary>= 130000){    // false: salary < 130000;
            taxRate = 0.35;   // 35%
        }else if(salary>=100000){    // false: salary < 100000;
            taxRate =0.30;    // 30%
        }else if(salary>= 80000){     // false : salary < 80000;
            taxRate=0.25;  // 25%
        }else{
            taxRate =0.20;   // 20%
        }
        
        if (isMarried){
            taxRate -=0.05;   // subtracting 5% from the original tax rate
        }

       // System.out.println("taxRate = " + taxRate);

        double salaryAfterTax= salary -(salary* taxRate);

        System.out.println("salaryAfterTax = " + salaryAfterTax);



    }
}
