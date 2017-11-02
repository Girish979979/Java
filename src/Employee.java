import java.io.*;
public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    // This is the constructor of the class Employee
    public Employee(String name) {
        this.name = name;
    }

    // Assign the age of the Employee  to the variable age.
    public void empAge(int empAge) {
        age = empAge;
    }

    /* Assign the designation to the variable designation.*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* Assign the salary to the variable	salary.*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* Print the Employee details */
    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }

    public static void main(String args[]){
        Employee emp1 = new Employee("Girish");
        emp1.age = 12;
        emp1.designation = "Programmer";
        emp1.salary = 25000;
        emp1.printEmployee();
        emp1.empAge(12);
        emp1.empDesignation("Programmer");
        emp1.empSalary(25000);
        emp1.printEmployee();
    }
}