package ModelLayer;

import java.util.ArrayList;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public abstract class EmployeeContainer {
    public static ArrayList<Employee> employees = new ArrayList<>();


    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public  static Employee getEmployee(int index) {
        return employees.get(index);
    }

    public static int getEmployeesSize() {
        return employees.size();
    }

    public static void removeEmployee(int index) {
        employees.remove(index);
    }

}
