import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        System.out.println("Курсовая работа № 1");
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 10000);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 5, 20000);
        employees[2] = new Employee("Сидоров", "Сидр", "Сидорович", 3, 30000);
        employees[3] = new Employee("Федоров", "Федор", "Федорович", 2, 20000);
        employees[4] = new Employee("Иванова", "Галина", "Петровна", 4, 10000);
        employees[5] = new Employee("Петрова", "Марина", "Петровна", 5, 20000);
        employees[6] = new Employee("Фетодова", "Федора", "Федоровна", 1, 15000);
        employees[7] = new Employee("Николаев", "Николай", "Николаевич", 5, 10000);
        employees[8] = new Employee("Котова", "Елена", "Петровна", 5, 5000);
        employees[9] = new Employee("Котова", "Оксана", "Ивановна", 3, 25000);
        printingList();
        Arrays.stream(employees).forEach(System.out::println);
        System.out.println("Сумма зарплат всех сотрудников " + sumOfSalaries());
        System.out.println("Минимальная зарплата у сотрудника " + minOfSalaries());
        System.out.println("Максимальная зарплата у сотрудника " + maxOfSalaries());
        System.out.println("Средняя зарплата у сотрудников " + medianOfSalaries());
        printNamesOfEmployees();
    }

    private static void printingList() {
        for (Employee employee : employees) {
            System.out.println(employees);
        }
    }
    private static double sumOfSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    private static Employee minOfSalaries(){
        double min = employees[0].getSalary();
        Employee minSalary = employees[0];
        for (int i = 1; i < 10; i++) {
            Employee employee = employees[i];
                if (min > employee.getSalary()) {
                min = employee.getSalary();
                minSalary = employee;
            }
        }
        return minSalary;
    }
    private static Employee maxOfSalaries(){
        double max = employees[0].getSalary();
        Employee maxSalary = employees[0];
        for (int i = 1; i < 10; i++) {
            Employee employee = employees[i];
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    private static double medianOfSalaries() {
        double median = 0;
        for (Employee employee : employees) {
            median += employee.getSalary();
        }
        median = median/employees.length;
        return median;
    }
    private static void printNamesOfEmployees() {
        for (Employee employee : employees)
            System.out.println(employee.getFamily() + " " + employee.getName() + " " + employee.getPatronymic());
    }
}