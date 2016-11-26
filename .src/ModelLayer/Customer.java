/**
 * Created by RaidenRabit on 23-Nov-16.
 */
public class Customer extends Person {
    private String cpr, name, address, email, phone, city;

    public Customer(String cpr, String name, String address, String email, String phone, String city) {
        this.cpr = cpr;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.city = city;

    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }


}
