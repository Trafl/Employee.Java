import entities.Employee;
import java.util.Scanner;

public class Program{

  public static void main(String[] args) {
    Employee x = new Employee();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Name: ");
    x.name = sc.next();
    System.out.println("Gross Salary: ");
    x.grossSalary= sc.nextDouble();
    System.out.println("Tax: ");
    x.tax = sc.nextDouble();

    System.out.println(x.name + " $" + x.netSalary());
    System.out.println("Which percentage to increse salary ?");
    double i = sc.nextDouble();
    x.increaseSalary(i);

    System.out.println("Update data: " + x.name + ", $" + x.grossSalary);

    sc.close();
  }
}