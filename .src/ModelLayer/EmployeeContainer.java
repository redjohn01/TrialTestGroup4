package ModelLayer;

import java.util.ArrayList;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public abstract class EmployeeContainer {
    private  ArrayList<Employee> employees;

    public EmployeeContainer() {
        employees = new ArrayList<>();
    }

    public  void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public  Employee getEmployee(int index) {
        return employees.get(index);
    }

    public  int getEmployeesSize() {
        return employees.size();
    }

    public  void removeEmployee(int index) {
        employees.remove(index);
    }

}
