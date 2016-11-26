package UILayer;

import ControlLayer.CustomerControl;
import UILayer.Input;
import UILayer.ErrorWriter;

/**
 * Created by RaidenRabit on 23-Nov-16.
 */
public class MainMenuUI {
    public void runMainLoop() {
        int choice;
        do {
            choice = Input.readInt();

            switch (choice) {
                case 1:
                    customerMenu();
                    break;
                case 2:
                    // .. exit program
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 4.");
            }
        } while (choice != 2);
    }

    private int customerMenu() {
        int choice;
        do {
            choice = Input.readInt();

            switch (choice) {
                case 1:
                    CustomerInputChecker.addCustomer();
                    break;
                case 2:
                    if( CustomerControl.readCustomer(CustomerInputChecker.verifyCpr()).length() == 1 ) // if the string is composed of only 1 character, it means the methode returned only -1, which means there is no such customer in the system
                        ErrorWriter.print(ErrorCode.NO_SUCH_CUSTOMER);
                    else
                        System.out.println( CustomerControl.readCustomer(CustomerInputChecker.verifyCpr()) );
                    break;
                case 3:

                    break;
                case 4:
                    if ( CustomerControl.deleteCustomer(CustomerInputChecker.verifyCpr() ) < 0) // if there is no such customer display error, else customer is deleted automatically.
                        ErrorWriter.print(ErrorCode.NO_SUCH_CUSTOMER);
                    break;
                case 5:
                    //...
                    break;
                case 6:
                    //...
                    break;
                default:
                    System.out.println("Choice must be a value between 1 and 6.");
            }
        } while (choice != 5 && choice != 6);

        return (choice == 6) ? 4 : 1;
    }

}
