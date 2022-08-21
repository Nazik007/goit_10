package task_3;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Nazarii Soviak
 */

public class WordsCounter {
    public void wordsFromFileCounter (String filename) {
        File file = new File(filename);

        if (!file.exists()) {
            System.out.println("File: " + file.getName() + " doesn't exist. PLease, select another file!");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = reader.readLine();
            ArrayList<String> list = new ArrayList<>();
            Map<String, Integer> map = new HashMap<>();

            while (line != null) {
                String[] words;
                words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    list.add(words[i]);
                }
                line = reader.readLine();
            }

            for (String words : list) {
                if (map.containsKey(words)) {
                    map.put(words, map.get(words) + 1);
                    continue;
                }
                map.put(words, 1);
            }

            map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEach(s ->
                    System.out.println(s.getKey() + " " + s.getValue()));

        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

