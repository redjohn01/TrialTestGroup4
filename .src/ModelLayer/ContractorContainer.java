package ModelLayer;

import java.util.ArrayList;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public abstract class ContractorContainer {
    public static ArrayList<Contractor> contractors = new ArrayList<>();

    public static void addContractor(Contractor contractor) {
        contractors.add(contractor);
    }

    public static Contractor getContractor(int index) {
        return contractors.get(index);
    }

    public static int getCustomersSize() {
        return contractors.size();
    }

    public static void removeCustomer(int index) {
        contractors.remove(index);
    }

}

