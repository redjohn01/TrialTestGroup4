import ModelLayer.Customer;
import ModelLayer.CustomerContainer;

/**
 * Created by RaidenRabit on 23-Nov-16.
 */
public abstract class CustomerControl {

    public static void addCustomer(String cpr, String name, String address, String email, String phone, String city) {

        Customer customer = new Customer(cpr, name, address, email, phone, city); // creating customer
        CustomerContainer.addCustomer(customer);                                  // adding customer to system
    }

    public static String readCustomer(String cpr) { //TODO: return string of all the info that will be printed in MainMenuUI

    }

    public static int updateCustomer(String cpr) { //asumes there is at least 1 customer in the system
        return findCustomer(cpr);

    }

    public static int deleteCustomer(String cpr) { // asumes there is at least 1 customer in the system
        if (findCustomer(cpr) >= 0) // if there is such customer
        {
            CustomerContainer.removeCustomer(findCustomer(cpr)); // remove him from the container
            return findCustomer(cpr);
        } else
            return findCustomer(cpr);
    }

    private static int findCustomer(String cpr) {
        for (int i = 0; i < CustomerContainer.getCustomersSize(); i++)
            if (CustomerContainer.getCustomer(i).getCpr() == cpr)
                return i;
        return -1; // there is no such customer
    }
}
