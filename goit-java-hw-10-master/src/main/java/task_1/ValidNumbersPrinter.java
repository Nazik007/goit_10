package task_1;

/**
 * @author Nazarii Soviak
 */

public class ValidNumbersPrinter {

    public static final String RELATIVE_PATH = "/Users/nsovi/Desktop/itvdn_hw/src/go_it_hw/hw_10/task_1/phone_numbers.txt";

    public static void main(String[] args) {
        PhoneNumbersValidator phoneNumbersValidator = new PhoneNumbersValidator();
        phoneNumbersValidator.print(RELATIVE_PATH);
    }
}
