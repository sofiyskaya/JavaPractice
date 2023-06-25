package SolutionHomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class Task3 {
    public static void findValue(){
        ArrayList<Integer> arrayList = rndNumList();

        // Finding the minimum value
        int min = Collections.min(arrayList);
        System.out.println("Minimum Value: " + min);

        // Finding the maximum value
        int max = Collections.max(arrayList);
        System.out.println("Maximum Value: " + max);

        // Finding the mean value
        int sum = 0;
        for(int i : arrayList) {
            sum += i;
        }
        double mean = sum / arrayList.size();
        System.out.println("Mean Value: " + mean);
    }

    public static ArrayList<Integer> rndNumList() {
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
    
        for (int i = 0; i < 10; i++) {
            arrayList.add(rand.nextInt(100));
        }

        System.out.println("Original List: " + arrayList);
        return arrayList;
    }

}
