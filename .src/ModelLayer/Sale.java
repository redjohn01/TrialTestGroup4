package ModelLayer;

import java.util.ArrayList;

/**
 * Created by Admin on 11/28/2016.
 */
public class Sale extends Order{
    private ArrayList<Item> saleItem;

    public Sale(String numberID, int quantity) {
        super(numberID, quantity);
        saleItem = new ArrayList<>();
    }
}
