public class Employee {
    private static long idCounter = 0;
    private final long id;
    private String family;
    private String name;
    private String patronymic;
    private int department;
    private double salary;

    public Employee() {
        this.id = idCounter++;
    }

    public Employee(String family, String name, String patronymic, int department, double salary) {
        this.id = idCounter++;
        this.family = family;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\t фамилия: %S имя: %S отчество: %S отдел: %s, оклад: %s",
                id, family, name, patronymic, department, salary);

    }
}
