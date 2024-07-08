package solid.srp;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

/*

    To adhere to the Single Responsibility Principle, we need to separate these responsibilities into different classes.

    1. Employee Class: Responsible for managing employee data.
    2. EmployeePrinter Class: Responsible for printing employee details.
    3. SalaryCalculator Class: Responsible for calculating the salary.

 */