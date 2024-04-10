public class Manager extends Employee {

        private String name;
        private double salary;
        private double bonus;

     /*
     * Constructor.
     */
    public Manager(String name, double salary, double bonus) {
        super(name,salary);
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getSalary() {
        return salary ;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    public double getAnnualIncome() {
        // Employees only get an annual salary.
        //double salary = getSalary();
        //double income = bonus + salary;

        return getSalary() + bonus;

    }

}

