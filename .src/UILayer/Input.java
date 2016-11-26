import java.util.Scanner;

/**
 * Created by EU on 2016-11-25.
 */
public abstract class Input {
    private static String inputString;
    private static int inputInt;

    public static String readString() {
        inputString = null; // clearing it before reading from keyboard
        Scanner scan = new Scanner(System.in);

        inputString = scan.nextLine();

        return inputString;
    }

    public static int readInt() {
        inputInt = 0; //clearing it before reading from keyboard
        Scanner scan = new Scanner(System.in);

        inputInt = scan.nextInt();

        return inputInt;
    }
}
