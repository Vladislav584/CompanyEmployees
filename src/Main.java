import java.util.ArrayList;
import java.util.List;

/**
 * Создайте классы, в которых будет информация о зарплатах сотрудников, и интерфейс "Сотрудник" с методом
 * getMonthSalary().
 * Типы сотрудников - менеджер по продажам (зарплата складывается из фиксированной части и 5% от заработанных им для
 * компании денег), топ-менеджер (фиксированная часть + премия, если доход компании составил более 10 миллионов рублей)
 * и операционист (фиксированная зарплата). Создайте также класс, представляющий компанию, в которой работают эти
 * сотрудники. Их можно нанимать, увольнять. Также в этом классе должны быть реализованы два метода,-
 * getTopSalaryStaff(int count) и getLowestSalaryStaff(int count),- которые будут выводить заданное (в параметре count)
 * количество сотрудников с самыми высокими и самыми низкими зарплатами. Сгенерируйте и наймите 270 сотрудников с
 * разными зарплатами, а затем вызовите эти два метода и продемонстрируйте их работу.
 */

public class Main {

    public static void main(String[] args) {

        Company company = new Company();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < 200; i++)
            employees = company.hire(new Clerk());
        for(int i = 0; i < 60; i++)
            employees = company.hire(new SalesManager(company));
        for(int i = 0; i < 10; i++)
            employees = company.hire(new TopManager(company));

        //company.layOff(0);

        //company.list();

        System.out.println();
        company.getTopSalaryStaff(270);
        System.out.println();
        company.getLowestSalaryStaff(270);

        System.out.println();
        System.out.println("Выручка " + company.getIncome());

    }
}
