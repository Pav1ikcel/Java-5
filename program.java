/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Меню:");
            System.out.println("1) Добавить контакт");
            System.out.println("2) Вывести всех");
            System.out.println("3) Выход");
            System.out.print("Выберите действие: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.next();
                    System.out.print("Введите номер телефона: ");
                    String phone = scanner.next();
                    
                    // Проверяем, существует ли уже контакт с таким именем
                    if (phoneBook.containsKey(name)) {
                        ArrayList<String> phones = phoneBook.get(name);
                        phones.add(phone);
                    } else {
                        ArrayList<String> phones = new ArrayList<>();
                        phones.add(phone);
                        phoneBook.put(name, phones);
                    }
                    
                    break;
                case 2:
                    printAllContacts(phoneBook);
                    break;
                case 3:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
    }
    
    public static void printAllContacts(Map<String, ArrayList<String>> phoneBook) {
        ArrayList<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        
        // Сортируем контакты по убыванию числа телефонов
        Collections.sort(entries, (entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());
        
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String name = entry.getKey();
            ArrayList<String> phones = entry.getValue();
            
            System.out.println(name + ": " + phones);
        }
    }
}

 */