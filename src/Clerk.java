public class Clerk implements Employee {

    private int FIX_SALARY = (int) (25000 + 15000 * Math.random());

    @Override
    public int getMonthSalary() {
        return FIX_SALARY;
    }
}
