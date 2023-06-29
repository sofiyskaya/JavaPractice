package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {

    public static void TimeTest(int size) {

        Random rnd = new Random();
        List<Integer> simpleList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();

        // ArrayList<Integer> simpleList1 = new ArrayList<>();
        // LinkedList<Integer> linkList1 = new LinkedList<>();

        long curTime = System.currentTimeMillis();
        System.out.println(curTime);
        
        curTime = System.currentTimeMillis();
        for(int i =0;i<size;i++)
        {
            simpleList.add(1);
        }
        System.out.println("Простой список конец "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size;i++)
        {
            linkList.add(1);
        }
        System.out.println("Связный список конец "+(System.currentTimeMillis()-curTime));

        simpleList.clear();
        linkList.clear();
        
        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            simpleList.add(0,1);
        }
        System.out.println("Простой список начало "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            linkList.add(0, 1);
        }
        System.out.println("Связный список начало "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            simpleList.add(rnd.nextInt(10000),1);
        }
        System.out.println("Простой список середина "+(System.currentTimeMillis()-curTime));

        curTime = System.currentTimeMillis();
        for(int i =0;i<size/10;i++)
        {
            linkList.add(rnd.nextInt(10000), 1);
        }
        System.out.println("Связный список середина "+(System.currentTimeMillis()-curTime));

    }
}
