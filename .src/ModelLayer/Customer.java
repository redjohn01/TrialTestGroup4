package ModelLayer;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class Customer extends Person {
    private String CPR;

    public Customer(String name, String address, String email,String phone,String city, String CPR) {
        super(name,address,email,phone,city);
        this.CPR = CPR;
    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

}
