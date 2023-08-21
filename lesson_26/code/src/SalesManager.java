package src;

public class SalesManager extends Employee {
    private double salesValue;
    private double percent;

    public SalesManager(int id, String firstName, String lastName, double hours, double salesValue, double percent) {
        super(id, firstName, lastName, hours);
        this.salesValue = salesValue;
        this.percent = percent;
    }

    public double getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(double salesValue) {
        this.salesValue = salesValue;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double calcSalary() {
        return salesValue * percent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(", salary=").append(calcSalary());
        return sb.toString();
    }

    public static class WageEmployee extends Employee{
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
}
