package ModelLayer;

/**
 * Created by RedJohn on 23-Nov-16.
 */
public class Contractor extends Person {
    private String CVR;

    public Contractor(String CVR, String name, String address, String email, String phone, String city) {
        super
        this.CVR = CVR;
    }

    public String getCVR() {
        return CVR;
    }

    public void setCVR(String CVR) {
        this.CVR = CVR;
    }
}
