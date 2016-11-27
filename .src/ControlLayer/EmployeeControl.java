package ControlLayer;
import ModelLayer.*;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class EmployeeControl {

    public static void addEmployee(String name, String address, String email, String phone, String city, String CPR, String workID) {

        Employee employee = new Employee(name, address, email, phone, city, CPR, workID);
        EmployeeContainer.addEmployee(employee);                               
    }

    public static String readEmployee(String cpr) { //TODO: return string of all the info that will be printed in MainMenuUI
        if( findEmployee(cpr) >= 0 )
        {   Employee employee = EmployeeContainer.getEmployee(findEmployee(cpr));
            return ( "NAME: "+employee.getName()+"\nCITY: "+employee.getCity()+"\nADDRESS: "+employee.getAddress()+"\nCPR: "+employee.getCPR()+"\nEMAIL: "+employee.getEmail()+"\nPHONE: "+employee.getPhone() );
        }
        else
            return String.valueOf(findEmployee(cpr));
    }


    public static String updateEmployee(int index, int updateType, String newInfo) {
        switch(updateType)
        {
            case 1:
                EmployeeContainer.getEmployee(index).setCPR(newInfo);
                break;
            case 2:
                EmployeeContainer.getEmployee(index).setName(newInfo);
                break;
            case 3:
                EmployeeContainer.getEmployee(index).setAddress(newInfo);
                break;
            case 4:
                EmployeeContainer.getEmployee(index).setEmail(newInfo);
                break;
            case 5:
                EmployeeContainer.getEmployee(index).setPhone(newInfo);
                break;
            case 6:
                EmployeeContainer.getEmployee(index).setCity(newInfo);
                break;
            case 7:
                EmployeeContainer.getEmployee(index).setWorkID(newInfo);
                break;
        }
        return newInfor( EmployeeContainer.getEmployee(index).getCPR() );
    }

    private static String newInfor(String cpr)
    {
        Employee employee = EmployeeContainer.getEmployee(findEmployee(cpr));
        return ( "NAME: "+employee.getName()+"\nCITY: "+employee.getCity()+"\nADDRESS: "+employee.getAddress()+"\nCPR: "+employee.getCPR()+"\nEMAIL: "+employee.getEmail()+"\nPHONE: "+employee.getPhone() );
    }

    public static int deleteEmployee(String CPR) { 
        if (findEmployee(CPR) >= 0)
        {
            EmployeeContainer.removeEmployee(findEmployee(CPR));
            return findEmployee(CPR);
        } else
            return findEmployee(CPR);
    }

    private static int findEmployee(String CPR) {
        for (int i = 0; i < EmployeeContainer.getEmployeesSize(); i++)
            if (EmployeeContainer.getEmployee(i).getCPR().equals(CPR))
                return i;
        return -1; 
    }
}
