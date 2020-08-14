public class TopManager implements Employee {

    private int FIX_SALARY = (int) (70000 + 30000 * Math.random());

    private Company company;

    public TopManager(Company company){
        this.company = company;
    }

    @Override
    public int getMonthSalary() {
        int salary;
        if (company.getIncome() < 10000000) {
            salary = FIX_SALARY;
        } else {
            int bonus = 30000;
            salary = FIX_SALARY + bonus;
        }
        return salary;
    }
}
