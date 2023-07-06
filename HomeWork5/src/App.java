import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Solution.HeapSort;
import Solution.PhoneBook;

public class App {
    public static void main(String[] args) throws Exception {
    
        // HashMap<String, List<Integer>> map = Solution.PhoneBook.PhoneFill(args);
        // Solution.PhoneBook.printPhoneBook(map);
        
        // int[] arr = HeapSort.randomIntArr(10, 1, 100);
        
        // System.out.println(HeapSort.arrayIntToString(arr));
        // HeapSort.sort(arr);
        // System.out.println(HeapSort.arrayIntToString(arr));

        

            System.out.println("How much contacts you want to be in Phonebook? ");
            Scanner iScanner = new Scanner(System.in);
            int sizePhoneBook = Integer.parseInt(iScanner.nextLine());
            String[] phones = PhoneBook.inputPhone(sizePhoneBook); // {"Иванов 772733","Сидоров 123312","Сидоров 12333","Петров
                                                                // 123"}; //
            HashMap<String, List<Integer>> book = PhoneBook.PhoneFill(phones);
            System.out.println("The list of contacts:");
            PhoneBook.printPhoneBook(book);
            iScanner.close();
        
    }
}
