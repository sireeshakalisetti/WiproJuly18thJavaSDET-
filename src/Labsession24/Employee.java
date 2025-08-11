package Labsession24;

abstract class Employee {
    String name;
    int id;

    abstract double calculateSalary();
}

class PermanentEmployee extends Employee {
    double monthlySal;

    PermanentEmployee(double monthlySal) {
        this.monthlySal = monthlySal;
    }

    double calculateSalary() {
        return monthlySal;
    }
}

class ContractEmployee extends Employee {
    int hourlyRate;
    int hoursWorked;

    ContractEmployee(int hourlyRate, int hoursWorked) {
    
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

