package HW4;

import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class t2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        LinkedList<String> list = new LinkedList<>();
        list.add("babulya");
        list.add("tol'ko sprosit'");
        list.add("yazhemat'");
        boolean stop = false;
        String line = "";
        while (!stop) {

            System.out.println("1 - добавить человека в очередь, 2 - дождаться очереди, 3 - посмотреть, кто там следующий, stop - хватит");
            line = sc.nextLine();
            switch (line) {

                case "stop":
                    stop = true;
                    break;

                case "1":
                    System.out.println("Кто встал в очередь?");
                    enqueue(list, sc.nextLine());
                    System.out.println("Текущая очередь: " + list);
                    break;

                case "2":
                    System.out.print("Дождался своей очереди: ");
                    System.out.println(dequeue(list));
                    System.out.println("Текущая очередь: " + list);
                    break;

                case "3":
                    System.out.println("Кто будет следующим?");
                    System.out.println(first(list));
                    break;

            }
        }
        sc.close();
    }

    static void enqueue(LinkedList<String> list, String line) {
        list.add(line);
    }

    static String dequeue(LinkedList<String> list) {
        return list.removeFirst();
    }

    static String first(LinkedList<String> list) {
        if (!list.isEmpty()){
            return list.get(0);
        }
        return "никого нет";
    }
}
