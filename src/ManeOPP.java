public class ManeOPP {
    public  static  void main(String[] args){
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Дмитриев", "Дмитрий", "Дмитриевич", 4, 50000));
        employeeBook.addEmployee(new Employee("Михайлов", "Михаил", "Михайлович", 2, 70000));
        employeeBook.addEmployee(new Employee("Потапов", "Потап", "Потапович", 2, 10000));
        employeeBook.addEmployee(new Employee("Иванов", "Иван", "Иванович", 2, 15000));
        employeeBook.addEmployee(new Employee("Сидоров", "Сидр", "Сидорович", 3, 10000));
        employeeBook.printingList();
        System.out.println();
        employeeBook.deleteEmployee(1);
        employeeBook.printingList();
        System.out.println();
        employeeBook.changeSalary("дмитриев", "дмитрий", "дмитриевич", 80000);
        employeeBook.printingList();
        System.out.println();
        employeeBook.changeDepartment("Потапов", "Потап", "Потапович", 1);
        employeeBook.printingList();
        System.out.println();
        employeeBook.listsByDepartment();
    }

}
