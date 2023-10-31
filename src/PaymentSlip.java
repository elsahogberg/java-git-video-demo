
public class PaymentSlip {
    private String name;
    private int hourlyRate;
    private int hours;
    private double taxRate = 0.30;

    //Default Constructor 
    public PaymentSlip() {
        
    }

    //Constructor for Paymentslip
    public PaymentSlip(String name, int hourlyRate, int hours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    //Get & Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //Calculate Salary
    public double calculateSalary() {
        return hourlyRate * hours;
    }

    public double calculateNetSalary() {
        double salaryBeforeTax = calculateSalary();
        return salaryBeforeTax - (salaryBeforeTax * taxRate);
    }
}

