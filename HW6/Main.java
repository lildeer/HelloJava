package HW6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/HW6/list.txt");
        File file = new File(pathFile);
        BufferedReader bufReader = new BufferedReader(new FileReader(file));
        String line = bufReader.readLine();

        LinkedList<Notebook> storeNotebooks = new LinkedList<>();
        while (line != null) {

            storeNotebooks.add(getDetails(line));
            line = bufReader.readLine();
        }

        System.out.println(storeNotebooks.toString());
        bufReader.close();

        Search firstTry = new Search(storeNotebooks);

    }

    public static Notebook getDetails(String line) {
        List<String> onlyarg = Arrays.asList(line.split("/"));
        String name = onlyarg.get(0);
        int ram = Integer.parseInt(onlyarg.get(1));
        int memory = Integer.parseInt(onlyarg.get(2));
        String os = onlyarg.get(3);
        String color = onlyarg.get(4);
        return new Notebook(name, ram, memory, os, color);
    }

    
}
