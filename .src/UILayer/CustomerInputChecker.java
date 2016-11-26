package UILayer;

import ControlLayer.CustomerControl;
import UILayer.Input;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by EU on 2016-11-26.
 */
public abstract class CustomerInputChecker {
    static String cpr, name, address, email, phone, city;
    static boolean ok;

    public static void addCustomer() {
        cpr = verifyCpr();
        name = verifyName();
        address = verifyAddress();
        email = verifyEmail();
        phone = verifyPhone();
        city = veryifyCity();

        CustomerControl.addCustomer(cpr, name, address, email, phone, city); // create customer and add to container
    }

    public static String verifyCpr() {
        cpr = null; // making sure it is empty before starting the process
        do {
            ok = true;
            cpr = Input.readString();
            if (cpr.length() != 9) {
                ok = false;
                print(ErrorCode.WRONG_CPR_INPUT);
            }
        } while (!ok);

        return cpr;
    }

    public static String verifyName() {
        name = null;    // making sure it is empty before starting the process
        do {
            ok = true;
            name = Input.readString();
            if (name.length() <= 2) {
                ok = false;
                print(ErrorCode.WRONG_NAME_INPUT);
            }
        } while (!ok);

        return name;
    }

    public static String verifyAddress() {
        address = null; // making sure it is empty before starting the process

        do {
            ok = true;
            address = Input.readString();
            if (address.matches(".*\\d+.*") || address.length() < 2) //checks if there is at least one number in the string
            {
                ok = false;
                print(ErrorCode.WRONG_ADDRESS_INPUT);
            }
        } while (!ok);

        return address;
    }

    public static String verifyEmail() {
        email = null; // making sure it is empty before starting the process

        do {
            ok = true;
            email = Input.readString();
            if (!(email.toLowerCase().contains("@") && email.toLowerCase().contains(".")) || email.length() < 4) // checks if email is at least 5 characters and contains @ and .
            {
                ok = false;
                print(ErrorCode.WRONG_EMAIL_INPUT);
            }
        } while (!ok);

        return email;
    }

    public static String verifyPhone() {
        email = null; // making sure it is empty before starting the process

        do {
            ok = true;
            phone = Input.readString();
            if (!phone.matches("[0-9]+")) //checks if string is composed only of numbers
            {
                ok = false;
                print(ErrorCode.WRONG_PHONE_INPUT);
            }

            if (phone.length() < 5 || phone.length() > 15) {
                ok = false;
                print(ErrorCode.WRONG_PHONE_LENGTH_INPUT);
            }
        } while (!ok);

        return phone;
    }

    public static String veryifyCity() {
        city = null; // making sure it is empty before starting the process

        do {
            ok = true;
            city = Input.readString();
            if (city.length() < 2) {
                ok = false;
                print(ErrorCode.WRONG_CITY_INPUT);
            }
        } while (!ok);

        return city;
    }
}
