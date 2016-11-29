package ModelLayer;

import java.util.ArrayList;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public abstract class ContractorContainer {
    private  ArrayList<Contractor> contractors;

    public ContractorContainer() {
        contractors = new ArrayList<>();
     }

    public  void addContractor(Contractor contractor) {
        contractors.add(contractor);
    }

    public  Contractor getContractor(int index) {
        return contractors.get(index);
    }

    public  int getContractorsSize() {
        return contractors.size();
    }

    public  void removeContractor(int index) {
        contractors.remove(index);
    }

}

