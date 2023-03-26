public class EmployeeBook {
    private Employee[] employees = new Employee[10];


    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public void printingList() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public void changeSalary(String family, String name, String patronymic, double salary) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getFamily().equalsIgnoreCase(family) && employee.getName().equalsIgnoreCase(name)
                    && employee.getPatronymic().equalsIgnoreCase(patronymic)) {
                employee.setSalary(salary);
            }
        }
    }

    public void changeDepartment(String family, String name, String patronymic, int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getFamily().equalsIgnoreCase(family) && employee.getName().equalsIgnoreCase(name)
                    && employee.getPatronymic().equalsIgnoreCase(patronymic)) {
                employee.setDepartment(department);
            }
        }
    }

    public void listsByDepartment() {
                for (int i = 1; i <= 5; i++) {
                System.out.println("Отдел номер " + i);
                printNamesOfEmployees(i);
                }
    }



    public double sumOfSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee minOfSalaries() {
        double min = employees[0].getSalary();
        Employee minSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            Employee employee = employees[i];
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                minSalary = employee;
            }
        }
        return minSalary;
    }

    public Employee maxOfSalaries() {
        double max = employees[0].getSalary();
        Employee maxSalary = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            Employee employee = employees[i];
            if (max < employee.getSalary()) {
                max = employee.getSalary();
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public double medianOfSalaries() {
        double median = 0;
        //for (Employee employee : employees) {
        //    if (employee == null){
        //        continue;
        //    }
        //    median += employee.getSalary();

        median = sumOfSalaries() / employees.length;
        return median;
    }

    public void printNamesOfEmployees() {
        for (Employee employee : employees)
            System.out.println(employee.getFamily() + " " + employee.getName() + " " + employee.getPatronymic());
    }

    public void salaryIndexing(double index) {
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            employee.setSalary(employee.getSalary() * index);
        }
    }

   public Employee minOfSalaries(int department) {
        double min = Double.MAX_VALUE;
        Employee minSalary = null;
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            else if (employee.getDepartment() != department)  {
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

    public Employee maxOfSalaries(int department) {
        double max = 0;
        Employee maxSalary = null;
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
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
   public double sumOfSalaries(int department){
        double sum = 0;
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }
    public double medianOfSalaries(int department){
        double median = 0;
        int numberOfEmployees = 0;
     //   for (Employee employee : employees) {
     //       if (employee == null){
     //           continue;
     //      }
     //       if (employee.getDepartment() != department) {
     //           continue;
     //       }
     //       median += employee.getSalary();
     //       numberOfEmployees++;
     //   }
     //   if (numberOfEmployees == 0) {
     //       System.out.println("Сотрудников нет в отделе");
     //   }
        median = medianOfSalaries() / numberOfEmployees;
        return median;
    }

    public void salaryIndexing (double index, int department){
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            employee.setSalary(employee.getSalary() * index);
        }
    }

    public void printNamesOfEmployees ( int department){
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            System.out.println(String.format("ID: %s\t фамилия: %S имя: %S отчество: %S  оклад: %s", employee.getId(),
                    employee.getFamily(), employee.getName(), employee.getPatronymic(), employee.getSalary()));

        }
    }
    public void printEmployeesAmountLess(double amount){
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            if (employee.getSalary() < amount) {
                System.out.println(String.format("ID: %s\t фамилия: %S имя: %S отчество: %S  оклад: %s", employee.getId(),
                        employee.getFamily(), employee.getName(), employee.getPatronymic(), employee.getSalary()));
            }
        }
    }
    public void printEmployeesAmountMore(double amount){
        for (Employee employee : employees) {
            if (employee == null){
                continue;
            }
            if (employee.getSalary() >= amount) {
                System.out.println(String.format("ID: %s\t фамилия: %S имя: %S отчество: %S  оклад: %s", employee.getId(),
                        employee.getFamily(), employee.getName(), employee.getPatronymic(), employee.getSalary()));
            }
        }
    }

}
