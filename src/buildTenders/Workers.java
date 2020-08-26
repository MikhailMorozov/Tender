package buildTenders;

public class Workers {
    private int salary;
    private Skills[] skills;

    public Workers(int salary, Skills[] skills) {
        this.salary = salary;
        this.skills = skills;
    }

    public int getSalary() {
        return salary;
    }

    public Skills[] getSkills() {
        return skills;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
