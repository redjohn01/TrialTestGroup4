/**
 * Created by RedJohn on 23-Nov-16.
 */
public class Order {

    private String numberID;
    private int quantity;
    //private Item item TODO

    public Order(String numberID, int quantity) {
        this.numberID = numberID;
        this.quantity = quantity;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
