import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class Task2 {
    public static void queue(){
        LinkedList <String> str = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                Enqueue(str);
            }
        System.out.println(str);
    
        Dequeue(str);
        System.out.println(str);

        First(str);
        System.out.println(str);
    }
        

    // Scanner reads data, that entered the user, puts the data into "strValue"
    public static LinkedList <String> Enqueue (LinkedList <String> str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string by chars: ");
        String strValue = scanner.nextLine();
        str.add(strValue); 
        return str;
    }

    // it returns the first element(index 0) and removes it 
    public static LinkedList <String> Dequeue (LinkedList <String> str) {
        String first = str.get(0);
        System.out.println(first);
        str.remove(0);
        return str;
    }

    // it just returns the first element(index 0)
    public static LinkedList <String> First (LinkedList <String> str) {
        String first = str.get(0);
        System.out.println(first);
        return str;
    }
}
