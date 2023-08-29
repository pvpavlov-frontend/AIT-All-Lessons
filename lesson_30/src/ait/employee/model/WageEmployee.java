package ait.employee.model;

public class WageEmployee extends Employee{
    private double wage;

    public WageEmployee(int id, String firstName, String lastName, double hours, double wage) {
        super(id, firstName, lastName, hours);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double calcSalary() {
        return wage * hours;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", salary=").append(calcSalary());
        return sb.toString();
    }
}