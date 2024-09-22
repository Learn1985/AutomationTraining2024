package September21stSession;

public class FetchEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Kelly", "ICG", 50000);

        Employee emp2 = new Employee(101, "John", "ICG", 52000);

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        System.out.println("Employee1 current Salary is:" +emp1.getEmpSalary());
        System.out.println("Employee2 current Salary is:" +emp2.getEmpSalary());

        String user="Vijaya";

        if (user.equals("Vijaya")) {

            emp1.setEmpSalary(60000);
            System.out.println(STR. "\{emp1.getEmpName()} new Salary is:" +emp1.getEmpSalary());
            emp2.setEmpSalary(80000);
            System.out.println(STR."\{emp2.getEmpName()} new Salary is:" +emp2.getEmpSalary());
        }
        else {
            System.out.println("User is not" +user);
        }

        System.out.println(STR."This year's tax for \{emp1.getEmpName()} is :" + emp1.applyTax().getEmpSalary());
        System.out.println(STR."This year's tax for \{emp2.getEmpName()} is :" + emp2.applyTax().getEmpSalary());

        System.out.println(STR."This year's gross salary for \{emp1.getEmpName()} is :" + emp1.applyTax().calculateGrossSalary().getgrossSalary());
        System.out.println(STR."This year's gross salary for \{emp2.getEmpName()} is :" + emp2.applyTax().calculateGrossSalary().getgrossSalary());

    }



}
