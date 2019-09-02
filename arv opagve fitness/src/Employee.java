public class Employee extends Person{

    private int hours;
    private double salary;
    private int vacation;

    @Override
    public String toString() {
        return getName() + "\t\t" + getCpr() + "\t\t" + hours + "\t\t\t" + salary + "\t\t\t" + vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
