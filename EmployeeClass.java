/* Class Practice:
 * Write a program that stores information about employees and creates employee objects
 */

// Create Employee Class
class Employee {

    // TOTAL EMPLOYEES
    private static int totalEmployees = 0;

    // FIELDS
    private String name = "";
    private int idNumber = 0;
    private String department = "";
    private String position = "";

    // CONSTRUCTORS
    public Employee(String name, int idNumber, String department, String position) {
        totalEmployees += 1;
        this.setName(name);
        this.setIDNumber(idNumber);
        this.setDepartment(department);
        this.setPosition(position);
    }

    public Employee(String name, int idNumber) {
        this(name, idNumber, "", "");
    }

    public Employee() {
        this("", 0, "", "");
    }

    // GETTERS
    // Getter for name
    public String getName() {
        return this.name;
    }

    // Getter for ID Number
    public int getID() {
        return this.idNumber;
    }

    // Getter for department
    public String getDepartment() {
        return this.department;
    }

    // Getter for position
    public String getPosition() {
        return this.position;
    }

    // Get total employees
    public static int getTotalEmployees() {
        return Employee.totalEmployees;
    }

    // SETTERS
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for ID Number
    public void setIDNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Setter for position
    public void setPosition(String position) {
        this.position = position;

    }
}

public class EmployeeClass {

    public static void main(String args[]) {

        // Create array to store employees
        Employee[] employeeDB = new Employee[3];

        // Create Employee objects
        employeeDB[0] = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        employeeDB[1] = new Employee("Mark Jones", 39119, "IT", "Programmer");
        employeeDB[2] = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        // Display
        for (int i = 0; i < employeeDB.length; i++) {
            System.out.printf("Employee Name: %s%n", employeeDB[i].getName());
            System.out.printf("Employee ID: %d%n", employeeDB[i].getID());
            System.out.printf("Department: %s%n", employeeDB[i].getDepartment());
            System.out.printf("Position: %s%n", employeeDB[i].getPosition());
            System.out.print("----------------------------\n");
        }
    }
}
