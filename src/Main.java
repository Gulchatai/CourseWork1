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
        System.out.println();
        Arrays.stream(employees).forEach(System.out::println);
        System.out.println();
        System.out.println("Сумма зарплат всех сотрудников " + sumOfSalaries());
        System.out.println();
        System.out.println("Минимальная зарплата у сотрудника " + minOfSalaries());
        System.out.println();
        System.out.println("Максимальная зарплата у сотрудника " + maxOfSalaries());
        System.out.println();
        System.out.println("Средняя зарплата у сотрудников " + medianOfSalaries());
        System.out.println();
        printNamesOfEmployees();
        System.out.println();
        salaryIndexing(1.5);
        System.out.println();
        Arrays.stream(employees).forEach(System.out::println);
        System.out.println();
        System.out.println(minOfSalaries(5) + " - сотрудник с минимальной зарплатой в данном отделе");
        System.out.println();
        System.out.println(maxOfSalaries(5) + " - сотрудник с максимальной зарплатой в данном отделе");
        System.out.println();
        System.out.println(sumOfSalaries(2) + " - сумма зарплат в данном отделе");
        System.out.println();
        System.out.println(medianOfSalaries(3) + " - средняя зарплата в данном отделе");
        System.out.println();
        salaryIndexing(2, 2);
        Arrays.stream(employees).forEach(System.out::println);
        System.out.println();
        printNamesOfEmployees(1);
        System.out.println();
        printEmployeesAmountLess(20000);
        System.out.println();
    }

    private static void printingList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static double sumOfSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee minOfSalaries() {
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

    private static Employee maxOfSalaries() {
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
        median = median / employees.length;
        return median;
    }

    private static void printNamesOfEmployees() {
        for (Employee employee : employees)
            System.out.println(employee.getFamily() + " " + employee.getName() + " " + employee.getPatronymic());
    }

    private static void salaryIndexing(double index) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * index);
        }
    }

    private static Employee minOfSalaries(int department) {
        double min = Double.MAX_VALUE;
        Employee minSalary = null;
        for (Employee employee : employees) {
                if (employee.getDepartment() != department) {
                continue;
            }
                System.out.println(employee);
                if (min > employee.getSalary()) {
                    min = employee.getSalary();
                    minSalary = employee;
                }
            }
            return minSalary;
    }

    private static Employee maxOfSalaries(int department) {
        double max = 0;
        Employee maxSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            System.out.println(employee);
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                maxSalary = employee;
            }
        }

        return maxSalary;
    }
        private static double sumOfSalaries(int department){
            double sum = 0;
            for (Employee employee : employees) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                sum += employee.getSalary();
            }

            return sum;

        }

        private static double medianOfSalaries(int department){
            double median = 0;
            int numberOfEmployees = 0;
            for (Employee employee : employees) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                median += employee.getSalary();
                numberOfEmployees++;
            }
            if (numberOfEmployees == 0) {
                System.out.println("Сотрудников нет в отделе");
            }
            median = median / numberOfEmployees;
            return median;
        }

        private static void salaryIndexing (double index, int department){
            for (Employee employee : employees) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                employee.setSalary(employee.getSalary() * index);
            }
        }

        private static void printNamesOfEmployees ( int department){
            for (Employee employee : employees) {
                if (employee.getDepartment() != department) {
                    continue;
                }
                System.out.println(String.format("ID: %s\t фамилия: %S имя: %S отчество: %S  оклад: %s", employee.getId(),
                        employee.getFamily(), employee.getName(), employee.getPatronymic(), employee.getSalary()));

            }
        }
        private static void printEmployeesAmountLess(double amount){
            for (Employee employee : employees) {
                if (employee.getSalary() < amount) {
                    System.out.println(String.format("ID: %s\t фамилия: %S имя: %S отчество: %S  оклад: %s", employee.getId(),
                            employee.getFamily(), employee.getName(), employee.getPatronymic(), employee.getSalary()));
                }
            }
        }
        private static void printEmployeesAmountMore(double amount){
            for (Employee employee : employees) {
                if (employee.getSalary() >= amount) {
                    System.out.println(String.format("ID: %s\t фамилия: %S имя: %S отчество: %S  оклад: %s", employee.getId(),
                            employee.getFamily(), employee.getName(), employee.getPatronymic(), employee.getSalary()));
                }
            }
        }
    }

