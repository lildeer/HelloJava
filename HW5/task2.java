package HW5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class task2 {

    public static void main(String[] args) throws IOException {

        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/HW5/list.txt");
        File file = new File(pathFile);
        BufferedReader bufReader = new BufferedReader(new FileReader(file));
        String line = bufReader.readLine();
        HashMap<String, Integer> count = new HashMap<>();
        while (line != null) {

            String name = Arrays.asList(line.split(" ")).get(0);
            Count(count, name);
            line = bufReader.readLine();
        }
        count.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println);
        bufReader.close();
    }

    public static HashMap<String, Integer> Count(HashMap<String, Integer> count, String name) {
        if (count.containsKey(name)) {
            count.put(name, count.get(name) + 1);
        } else {
            count.put(name, 1);
        }
        return count;
    }
}
