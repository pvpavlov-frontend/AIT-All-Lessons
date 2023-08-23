package src;

public class Manager extends Employee {
    private double baseSalary;
    private int grade;

    public Manager(int id, String firstName, String lastName, double hours, double baseSalary, int grade) {
        super(id, firstName, lastName, hours);
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        return baseSalary + grade * hours;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", salary=").append(calcSalary());
        return sb.toString();
    }
}
