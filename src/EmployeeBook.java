import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class EmployeeBook {
    private Map<String, String> employeeList = new TreeMap<>();

    public String add(String name, String surname) throws Employee {
            new Employee(name,surname);
            employeeList.put(new Employee(name, surname).toString(),new Employee(name,surname).toString());
            return employeeList.toString();
    }

}
