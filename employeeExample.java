// Create a class called Employee that includes:
// I. Three instance variables— id (type String), name (type String) and 
// monthly_salary (double). 
// II. A default constructor that initializes the three instance variables. 
// III. A setter and a getter method for each instance variable (for example 
// for id variable void setId(String id), String getId( )). 
// IV. displayEmployee() method for displaying employee details.
// Write a driver class named EmployeeTest that demonstrates class Employee’s 
// capabilities. Create two Employee objects and display each object’s yearly 
// salary. Then give each Employee a 10% raise and display each Employee’s 
// yearly salary again


class Employee {
    private String id;
    private String name;
    private double monthlySalary;

    public Employee() {
        this.id = "";
        this.name = "";
        this.monthlySalary = 0.0;
    }

    public Employee(String id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary >= 0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise() {
        this.monthlySalary = this.monthlySalary * 1.10;
    }
}
public class employeeExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "John Doe", 3000);
        Employee emp2 = new Employee("E002", "Jane Smith", 2000);

        System.out.println("Employee 1 Details:");
        emp1.displayEmployee();
        System.out.println("Yearly Salary: " + emp1.getYearlySalary());

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployee();
        System.out.println("Yearly Salary: " + emp2.getYearlySalary());

        emp1.giveRaise();
        emp2.giveRaise();

        System.out.println("\nAfter 10% Raise:");

        System.out.println("Employee 1 Details:");
        emp1.displayEmployee();
        System.out.println("Yearly Salary: " + emp1.getYearlySalary());

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployee();
        System.out.println("Yearly Salary: " + emp2.getYearlySalary());
    }
}
