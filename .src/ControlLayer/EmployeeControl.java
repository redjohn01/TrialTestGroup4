package ControlLayer;
import ModelLayer.*;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class EmployeeControl {

    public static void addEmployee(String name, String address, String email, String phone, String city, String CPR, String workID) {

        Employee employee = new Employee(name, address, email, phone, city, CPR, workID); // creating customer
        EmployeeContainer.addEmployee(employee);                                  // adding customer to system
    }

    public static String readEmployee(String cpr) { //TODO: return string of all the info that will be printed in MainMenuUI
        return "";
    }

    public static int updateEmployee(String CPR) { //asumes there is at least 1 customer in the system
        return findEmployee(CPR);

    }

    public static int deleteEmployee(String CPR) { // asumes there is at least 1 customer in the system
        if (findEmployee(CPR) >= 0) // if there is such customer
        {
            EmployeeContainer.removeEmployee(findEmployee(CPR)); // remove him from the container
            return findEmployee(CPR);
        } else
            return findEmployee(CPR);
    }

    private static int findEmployee(String CPR) {
        for (int i = 0; i < EmployeeContainer.getEmployeesSize(); i++)
            if (EmployeeContainer.getEmployee(i).getCPR().equals(CPR))
                return i;
        return -1; // there is no such customer
    }
}
