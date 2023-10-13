public class Employee {
    private String name;
    private String surname;
    private int department;
    final private String patronymic;
    private int salary;
    private static int count;
    private final int id;


    public Employee( String name, String surname, String patronymic, int salary, int department) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.salary = salary;
        this.department = department;
        id = ++count;
    }
    @Override
    public String toString() {
        return "id " + this.id + " ФИО: " + this.name + " " + this.surname + " " + this.patronymic + ". Номер отдела - " + department + ". Зарплата - " + this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getSalary() {
        return this.salary;
    }

    public int setSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return  this.department;
    }
    public int setDepartment() {
        return this.department;
    }
    /*public static void String() {
        for (int i = 0; i < Employee.count; i++) {
            System.out.println(Employee[i]);
        }*/
}
