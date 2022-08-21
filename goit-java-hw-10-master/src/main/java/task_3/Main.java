package task_3;

public class Main {
    private static final String RELATIVE_PATH = "/Users/nsovi/Downloads/goit-java-hw-10-master/src/main/java/task_3/words.txt";

    public static void main(String[] args) {
        new WordsCounter().wordsFromFileCounter(RELATIVE_PATH);
    }
}
