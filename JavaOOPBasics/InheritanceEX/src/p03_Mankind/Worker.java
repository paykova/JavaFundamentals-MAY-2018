package p03_Mankind;

public class Worker extends Human{

    private static final int DAYS_PER_WEEK = 7;
    private static final int WEEK_SALARY_MIN_VALUE = 10;

    private double weekSalary;
    private int workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary < WEEK_SALARY_MIN_VALUE){
            throw new IllegalArgumentException(String.format("Expected value mismatch!Argument: %.2f", this.weekSalary));
        }
        this.weekSalary = weekSalary;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        if(workHoursPerDay > 12 || workHoursPerDay <1){
            throw new IllegalArgumentException(String.format("Expected value!Argument: %d", this.getWorkHoursPerDay()));
        }
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public void setLastName(String lastName) {
        if(lastName.length() < 3){
            throw new IllegalArgumentException(String.format("Expected length more than 3 symbols!Argument %s", this.getLastName()));
        }
        super.setLastName(lastName);
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb
                .append("First Name: ").append(this.getFirstName()).append(System.lineSeparator())
                .append("Last Name: ").append(this.getLastName()).append(System.lineSeparator())
                .append("Week Salary: ").append(this.getWeekSalary()).append(System.lineSeparator())
                .append("Hours her day: ").append(String.format("%.2f", (double)this.getWorkHoursPerDay())).append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f", this.getWeekSalary() / (this.getWorkHoursPerDay() * DAYS_PER_WEEK)));

        return sb.toString();
    }
}
