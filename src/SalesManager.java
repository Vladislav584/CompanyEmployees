public class SalesManager implements Employee {

    private int FIX_SALARY = (int) (50000 + 30000 * Math.random());

    private Company company;

    public SalesManager(Company company){
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        double PERCENT_OF_REVENUE = 0.0005;
        return (int) (FIX_SALARY + company.getIncome() * PERCENT_OF_REVENUE);
    }
}
