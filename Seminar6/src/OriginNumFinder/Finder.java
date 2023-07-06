package OriginNumFinder;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Finder {
    public static int[] GetRandomArray(int size, int maxValue){
        int[] myArray = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++){
            myArray[i] = r.nextInt(maxValue);
        }
        return myArray;
    }
    // преобразование массива в сет
    public static Set<Integer> uniques(int[] array){
        Set<Integer> uniques = new HashSet<>();
        for (Integer integer: array){
            uniques.add(integer);
        }
        return uniques;
    }

    // поиск процента уникальных чисел
    public static double percenter(int[] array, Set<Integer> uniques){
        double percent = (double)uniques.size() * 100 / (double)array.length;
        return percent;
    }
}
