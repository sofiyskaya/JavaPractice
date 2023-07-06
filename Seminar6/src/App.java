import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import CatLibrary.Cat;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] randomArray = OriginNumFinder.Finder.GetRandomArray(1000, 25);
        // Set<Integer> randomSet = OriginNumFinder.Finder.uniques(randomArray);
        // System.out.println("Percentage of unique: " + OriginNumFinder.Finder.percenter(randomArray, randomSet));

    
        SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        Cat myCat = new Cat(2000, "Барсик", 245, formatter.parse("Sat, April 4, 2019"), true, 1);
        Cat motherCat = new Cat(3000, "Кеша", 245, formatter.parse("Sat, April 4, 2010"), false, 2);

        HashSet<Cat> catSet = new HashSet<Cat>();
        catSet.add(myCat);
        catSet.add(motherCat);

        System.out.println(myCat);
        System.out.println(motherCat);

        System.out.println(myCat.equals(motherCat));
        System.out.println(catSet.contains(motherCat));
    }
}
