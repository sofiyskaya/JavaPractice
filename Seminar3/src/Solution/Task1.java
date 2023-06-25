package Solution;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;


public class Task1 {
    public static void listFiller(){
        List<Integer> numL = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i < 10; i ++){
            numL.add(rnd.nextInt(100));
    }
    
    System.out.println(numL);

    Collections.sort(numL);

    System.out.println(numL);
    }
    
}
