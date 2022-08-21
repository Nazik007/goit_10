package task_2;

/**
 * @author Nazarii Soviak
 */

public class UsersConverterDemo {
    public static final String USERS_FILE_FROM = "/Users/nsovi/Downloads/goit-java-hw-9-master/src/main/java/goit/hw_10_2/phone_numbers.txt";
    public static final String USERS_FILE_TO = "/Users/nsovi/Downloads/goit-java-hw-9-master/src/main/java/goit/hw_10_2/file.json";

    public static void main(String[] args) {
        new UsersConverter().convert(USERS_FILE_FROM, USERS_FILE_TO);
    }
}
