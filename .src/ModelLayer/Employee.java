/**
 * Created by RedJohn on 23-Nov-16.
 */
public class Employee extends Person {
    private String workID;
    private String CPR;

    public Employee(String name, String address, String email, String phone, String city) {
        super(name, address, email, phone, city);
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public String getCPR() {
        return CPR;
    }

    public void setCPR(String CPR) {
        this.CPR = CPR;
    }

}
