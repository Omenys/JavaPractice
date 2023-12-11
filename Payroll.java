/* Payroll class for PayrollDemo */

public class Payroll {

    // constant number of employees
    public final int NUM_EMPLOYEES = 7;

    // array of employees
    private int[] employeeID = { 5658845, 4520125, 7895122, 8777341, 8451277, 1302850, 7580489 };

    // array of hours
    private int[] hours = new int[NUM_EMPLOYEES];

    // array of pay rate
    private double[] payRate = new double[NUM_EMPLOYEES];

    // array of wages
    private double[] wages = new double[NUM_EMPLOYEES];

    // GETTERS
    // get employee ID at given index i
    public int getEmployeeID(int i) {
        return employeeID[i];
    }

    // get hours at given index i
    public int getHours(int i) {
        return hours[i];
    }

    // get pay rate at given index i
    public double getPayRate(int i) {
        return payRate[i];
    }

    // get wages at given index
    public double getWages(int i) {
        return wages[i];
    }

    // SETTERS
    // set employee ID at given index i
    public void setEmployeeID(int i, int id) {
        employeeID[i] = id;
    }

    // set hours at given index i
    public void setHours(int i, int h) {
        hours[i] = h;
    }

    // set pay rate at given index i
    public void setPayRate(int i, double p) {
        payRate[i] = p;
    }

    // set wages at given index
    public void setWages(int i, double w) {
        wages[i] = w;
    }

    // get gross pay
    public double calcGrossPay(int i) {
        return hours[i] * payRate[i];
    }

}
