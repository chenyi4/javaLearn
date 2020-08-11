class Salary extends Employee
{
    private String name;
    public Salary(String name){
        super(name);
        System.out.println(name);
    }

    public double getName(){
        System.out.println("SalaryName is second");
        return 11.11;
    }

    public double computePay(){
        System.out.println("SalaryName is computePay");
        return 1/12;
    }
}

abstract class Employee
{
    public Employee(String name){
        System.out.println("Constructing an Employee");
    }
    public double getName(){
        System.out.println("Within mailCheck of Salary class ");
        return 11.11;
    }
    public double printJS(){
        System.out.println("Within printJS double");
        return 0.11;
    }
    public abstract double computePay();
}

public class AbstractDemo
{
    public static void main(String [] args){
       Salary s = new Salary("test"); 
       s.getName();
       s.printJS();
    }
}
