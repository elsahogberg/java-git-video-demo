//Import the Scanner class
import java.util.Scanner;


public class App {
    public static void main(String[] args) {


        //Create a Scaner object 
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        System.out.println("Please enter your hourly rate");
        System.out.println("Please enter your hours worked"); 

        //Input 
        String name = myScanner.nextLine(); 
        int hourlyRate = myScanner.nextInt();
        int hours = myScanner.nextInt(); 

        PaymentSlip myPaymentSlip = new PaymentSlip(name, hourlyRate, hours);

       // double salary = myPaymentSlip.calculateSalary();
       // System.out.println(salary);

        double mynetsalary = myPaymentSlip.calculateNetSalary(); 
        System.out.println(mynetsalary); 


        //Output
        System.out.println("Name: \t\t\t " + myPaymentSlip.getName()); 
        System.out.println("Hourly rate: \t\t " + myPaymentSlip.getHourlyRate());  
        System.out.println("Hours: \t\t\t " + myPaymentSlip.getHours()); 
        System.out.println("Salary before tax: \t " + myPaymentSlip.calculateSalary());
        System.out.println("Salary after tax: \t " + myPaymentSlip.calculateNetSalary());  

        //system.out.println()
myScanner.close();
    }
}

