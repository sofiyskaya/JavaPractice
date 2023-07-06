package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    // заполнение телефонной книги
    public static HashMap<String, List<Integer>> PhoneFill(String[]phoneNum){
        HashMap<String,List<Integer>> outMap = new HashMap<>();

        // проходим по полученным данным
        for(String name: phoneNum){
            // разделяем данные пробелом
            String[] contact = name.split(" ");

            // проверка на наличие данных
            if(!outMap.containsKey(contact[0])){
                List<Integer> phoneList = new ArrayList<Integer>();
                // добавляем новый контакт
                phoneList.add(Integer.parseInt(contact[1]));
                outMap.put(contact[0], phoneList);
            }
            else{
                // добавляем к ключу (имени) номер телефона новый
                outMap.get(contact[0]).add(Integer.parseInt(contact[1]));
            }
        }
        return outMap;
    }

    public static void printPhoneBook(HashMap<String,List<Integer>> outMap) {
        // Создаем список записей телефонной книги
        List<Map.Entry<String, List<Integer>>> list = new ArrayList<>(outMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, List<Integer>>>() {
    
            @Override
            public int compare(Map.Entry<String, List<Integer>> o1, Map.Entry<String, List<Integer>> o2) {
                // Сортируем записи по убыванию количества телефонов
                return o2.getValue().size() - o1.getValue().size();
            }
        });
        // Выводим записи телефонной книги
        for (Map.Entry<String, List<Integer>> entry: list){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
         
    }
    // метод ввода данных через Scanner
    public static String[] inputPhone(int size) {
        Scanner iScanner = new Scanner(System.in);
        String[] result = new String[size];
        for (int i = 0; i < result.length; i++) {
            System.out.println("Enter the contact №" + (i + 1));
            result[i] = iScanner.nextLine();
        }
        iScanner.close();
        return result;
    }
}