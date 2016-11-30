package ModelLayer;

import java.util.ArrayList;

/**
 * Created by RaidenRabit on 23-Nov-16.
 */
public abstract class customerContainer {
    public static ArrayList<Customer> customers = new ArrayList<>();

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

