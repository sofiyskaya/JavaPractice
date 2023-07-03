import java.util.HashMap;
import java.util.List;

import Solution.HeapSort;
import Solution.PhoneBook;

public class App {
    public static void main(String[] args) throws Exception {
    
        HashMap<String, List<Integer>> map = Solution.PhoneBook.PhoneFill(args);
        Solution.PhoneBook.printPhoneBook(map);
        
        // int[] arr = HeapSort.randomIntArr(10, 1, 100);
        
        // System.out.println(HeapSort.arrayIntToString(arr));
        // HeapSort.sort(arr);
        // System.out.println(HeapSort.arrayIntToString(arr));
    }
}
