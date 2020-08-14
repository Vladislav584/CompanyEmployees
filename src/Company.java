import java.util.*;

public class Company {

    private String countExcess = "Введите число, которое не превышает количество сотрудников!";
    private long income = (long) (9000000 + 2000000 * Math.random());

    long getIncome() {
        return income;
    }

    private List<Employee> staff = new ArrayList<>();

    List<Employee> hire(Employee employee) {
        int id = 0;
        staff.add(id, employee);
        return staff;
    }

    public void layOff(int id) {
        staff.remove(id);
    }

    void list() {
        for (int i = 0; i < staff.size(); i++) {
            int number = i + 1;
            System.out.println(number + "\t- " + staff.get(i).getMonthSalary());
        }
    }

    void getTopSalaryStaff(int count) {
        staff.sort((o1, o2) -> Integer.compare(o2.getMonthSalary(), o1.getMonthSalary()));
        System.out.println("Максимальные зарплаты");
        if (count > staff.size()) {
            System.out.println(countExcess);
        } else for (int i = 0; i < count; i++) {
            System.out.println(staff.get(i).getMonthSalary());
        }
    }

    void getLowestSalaryStaff(int count) {
        Collections.reverse(staff);
        System.out.println("Минимальные зарплаты");
        if (count > staff.size()) {
            System.out.println(countExcess);
        } else for (int i = 0; i < count; i++) {
            System.out.println(staff.get(i).getMonthSalary());
        }
    }
}

