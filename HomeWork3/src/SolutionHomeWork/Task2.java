package SolutionHomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task2 {
    public static void delEvenNum(){
        ArrayList<Integer> iList = rndNumList();
        evenNumList(iList);
    }

    public static ArrayList<Integer> rndNumList() {
        Random rand = new Random();
        ArrayList<Integer> iList = new ArrayList<>();
    
        for (int i = 0; i < 10; i++) {
            iList.add(rand.nextInt(100));
        }

        System.out.println("Original List: " + iList);
        return iList;
    }

    public static ArrayList<Integer> evenNumList(ArrayList<Integer>iList){
        List<Integer> delList = new ArrayList<>();
            for(Integer num: iList){
                if(num % 2 == 0) delList.add(num);
            }
        iList.removeAll(delList);
        System.out.println("The list of even numbers: " + iList);
        return iList;
    }
    
}
