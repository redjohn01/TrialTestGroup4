package ControlLayer;
import ModelLayer.*;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class ContractorControl {

    public static void addContractor(String name, String address, String email, String phone, String city, String CVR) {

        Contractor contractor = new Contractor(name, address, email, phone, city, CVR);
        ContractorContainer.addContractor(contractor);
    }

    public static String readContractor(String name) { //TODO: return string of all the info that will be printed in MainMenuUI
        if( findContractor(name) >= 0 )
        {   Contractor contractor = ContractorContainer.getContractor(findContractor(name));
            return ( "NAME: "+contractor.getName()+"\nCITY: "+contractor.getCity()+"\nADDRESS: "+contractor.getAddress()+"\nCPR: "+contractor.getCVR()+"\nEMAIL: "+contractor.getEmail()+"\nPHONE: "+contractor.getPhone() );
        }
        else
            return String.valueOf(findContractor(name));
    }


    public static String updateContractor(int index, int updateType, String newInfo) {
        switch(updateType)
        {
            case 1:
                ContractorContainer.getContractor(index).setCVR(newInfo);
                break;

            case 2:
                ContractorContainer.getContractor(index).setName(newInfo);
                break;
            case 3:
                ContractorContainer.getContractor(index).setAddress(newInfo);
                break;
            case 4:
                ContractorContainer.getContractor(index).setEmail(newInfo);
                break;
            case 5:
                ContractorContainer.getContractor(index).setPhone(newInfo);
                break;
            case 6:
                ContractorContainer.getContractor(index).setCity(newInfo);
                break;

        }
        return newInfor( EmployeeContainer.getEmployee(index).getCPR() );
    }

    private static String newInfor(String name)
    {
        Contractor contractor = ContractorContainer.getContractor(findContractor(name));
        return ( "NAME: "+contractor.getName()+"\nCITY: "+contractor.getCity()+"\nADDRESS: "+contractor.getAddress()+"\nCVR: "+contractor.getCVR()+"\nEMAIL: "+contractor.getEmail()+"\nPHONE: "+contractor.getPhone() );
    }

    public static int deleteEmployee(String name) {
        if (findContractor(name) >= 0)
        {
            EmployeeContainer.removeEmployee(findContractor(name));
            return findContractor(name);
        } else
            return findContractor(name);
    }

    private static int findContractor(String name) {
        for (int i = 0; i < EmployeeContainer.getEmployeesSize(); i++)
            if (EmployeeContainer.getEmployee(i).getName().equals(name))
                return i;
        return -1;
    }
}

