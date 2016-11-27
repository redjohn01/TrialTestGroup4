package ModelLayer;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class Customer extends Person {
    private String cpr;

    public Customer(String cpr, String name, String address, String email,String phone,String city) {
        super(name,address,email,phone,city);
        this.cpr = cpr;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String CPR) {
        this.cpr = cpr;
    }

}
