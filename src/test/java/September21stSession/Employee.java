package September21stSession;

public class Employee {

    private int empID;
    private String empName;
    private String empDept;
    private int empSalary;
    private double grossSalary;
    private double taxAmount;

    public Employee(int empID, String empName, String empDept, int empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empDept = empDept;
        this.empSalary = empSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details are: " + empID + "-" + empName + "-" + empDept + "-" + empSalary);
    }

    public int getEmpID() {
        return empID;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public double getgrossSalary() {
        return grossSalary;

    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Employee applyTax() {
        setTaxAmount(switch (getEmpSalary()) {
            case 60000 -> 60000 * 0.1;
            case 10000 -> 10000 * 0.1;
            case 80000 -> 80000 * 0.1;
            case 30000 -> 30000 * 0.1;
            case 40000 -> 40000 * 0.1;
            default -> 0;
        });
        return this;
    }

    public Employee calculateGrossSalary() {
        setGrossSalary(getEmpSalary() - getTaxAmount());
        return this;
    }

}
