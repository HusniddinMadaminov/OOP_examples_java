package solid.srp;

class EmployeeBad {
    private String name;
    private double salary;

    public EmployeeBad(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

/*
    Single Responsibility Principle
    It states that a class should have only one reason to change, meaning it should only have one job or responsibility.
    This principle helps to keep classes modular and easier to understand, maintain, and test.

    In this example, the EmployeeBad class has multiple responsibilities:

    1. Managing employee data (name and salary).
    2. Printing employee details.
    3. Calculating the annual salary.

 */