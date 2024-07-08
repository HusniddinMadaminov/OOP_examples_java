package solid.srp;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 3000);

        EmployeePrinter printer = new EmployeePrinter();
        printer.printEmployeeDetails(employee);

        SalaryCalculator calculator = new SalaryCalculator();
        double annualSalary = calculator.calculateAnnualSalary(employee);
        System.out.println("Annual Salary: " + annualSalary);
    }
}
