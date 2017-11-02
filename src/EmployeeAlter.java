public class EmployeeAlter {
    String name;
    int Age;
    String Designation;
    double salary;

    public EmployeeAlter(String ename,int eAge,String eDesignation,double esalary){
        this.name = ename;
        this.Age = eAge;
        this.Designation = eDesignation;
        this.salary = esalary;
        System.out.println("Employee Name is : " +name);
        System.out.println("Employee Age is :" +Age);
        System.out.println("Employee Designation is: "+Designation);
        System.out.println("Employee Salary is : " +salary);
    }

    public static void main(String args[]){
        EmployeeAlter emp1 = new EmployeeAlter("Girish",12,"Analyst Programmer",25000);
    }
}
