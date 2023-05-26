package HW5;

import java.util.Scanner;
import java.util.ArrayList;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean stop = true;
        String line1 = "";
        String line2 = "";
        ArrayList<Contact> phonebook = new ArrayList<>();

        while (stop) {
            System.out.println("1 - add contact, 2 - show contacts, 3 - stop");
            line1 = sc.nextLine();
            switch (line1) {
                case "1":
                    System.out.println("Name: ");
                    line1 = sc.nextLine();
                    System.out.println("Number: ");
                    line2 = sc.nextLine();
                    AddContact(phonebook, line1, line2);
                    break;

                case "2":
                    PrintAll(phonebook);
                    break;

                case "3":
                    stop = false;
                    break;

                default:
                    System.out.println("Try again.");
                    break;
            }
        }
        sc.close();
    }

    static void AddContact(ArrayList<Contact> phonebook, String name, String number) {
        Contact temp = new Contact(name, number);
        boolean flag = false;

        for (int i = 0; i < phonebook.size(); i++) {
            if (phonebook.get(i).name.equals(name)) {
                phonebook.get(i).phoneNumbers.add(number);
                flag = true;
            }
        }

        if (!flag) {
            phonebook.add(temp);
        }
    }

    static void PrintAll(ArrayList<Contact> phonebook) {
        for (Contact contact : phonebook) {
            System.out.printf("%s: ", contact.name);
            for (int i = 0; i < contact.phoneNumbers.size()-1; i++) {
                System.out.printf("%s, ", contact.phoneNumbers.get(i));
            }
            System.out.printf("%s", contact.phoneNumbers.get(contact.phoneNumbers.size() - 1));
            System.out.println();
        }
    }
}
