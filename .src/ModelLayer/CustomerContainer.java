import java.util.ArrayList;
import ModelLayer.Customer;

/**
 * Created by RaidenRabit on 23-Nov-16.
 */
public abstract class CustomerContainer {
    private static ArrayList<Customer> customers;

    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public static Customer getCustomer(int index) {
        return customers.get(index);
    }

    public static int getCustomersSize() {
        return customers.size();
    }

    public static void removeCustomer(int index) {
        customers.remove(index);
    }

}

