package HW6;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Search {
    String ram = "ram";
    String memory = "memory";
    String os = "os";
    String color = "color";
    Map<String, String> searchParametrs = new HashMap<>();

    public void SetDefualtParametrs() {

        searchParametrs.put(ram, "0");
        searchParametrs.put(memory, "0");
        searchParametrs.put(os, "");
        searchParametrs.put(color, "");
    }

    public Search(LinkedList<Notebook> storeNotebooks) {
        SetDefualtParametrs();
        System.out.println(ActualSearch(storeNotebooks).toString());

    }

    public LinkedList<Notebook> ActualSearch(LinkedList<Notebook> storeNotebooks) {
        LinkedList<Notebook> results = new LinkedList<>();

        SearchParameters();

        for (Notebook notebook : storeNotebooks) {
            if ((notebook.ram > Integer.parseInt(searchParametrs.get(ram))
                    || searchParametrs.get(ram).equals("0"))
                    && (notebook.memory > Integer.parseInt(searchParametrs.get(memory))
                            || searchParametrs.get(memory).equals("0"))
                    && (notebook.os.equals(searchParametrs.get(os))
                            || searchParametrs.get(os).equals(""))
                    && (notebook.color.equals(searchParametrs.get(color))
                            || searchParametrs.get(color).equals(""))) {
                results.add(notebook);
            }
        }
        return results;
    }

    public void SearchParameters() {
        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        String line = "";

        while (stop) {
            System.out.println("1 - ram, 2 - memory, 3 - os, 4 - color, 5 - getRes");
            line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("Min ram: ");
                    searchParametrs.put(ram, sc.nextLine());
                    break;
                case "2":
                    System.out.println("Min mem: ");
                    searchParametrs.put(memory, sc.nextLine());
                    break;

                case "3":
                    System.out.println("OS: ");
                    searchParametrs.put(os, sc.nextLine());
                    break;

                case "4":
                    System.out.println("Color: ");
                    searchParametrs.put(color, sc.nextLine());
                    break;

                case "5":
                    stop = false;
                    break;
                default:
                    System.out.println("Try again.");
                    break;
            }
        }
        sc.close();
    }
}
