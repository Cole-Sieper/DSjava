public class PayrollDemo {

    public static void main(String[] args) {
        
        Employee Sarah = new Employee("Sarah", 105000);

        Manager Cole = new Manager("Cole", 120000, 8750);

        System.out.println("Sarah's Annual Income: "+ Sarah.getAnnualIncome());
        System.out.println("Cole's Annual Income: "+ Cole.getAnnualIncome());

    }
    
}
