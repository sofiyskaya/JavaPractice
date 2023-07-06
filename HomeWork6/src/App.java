import java.util.HashSet;

import Stock.Laptop;

public class App {
    public static void main(String[] args) throws Exception {

        // добавляем экземпляры класса
        Laptop l1 = new Laptop("Apple", "Macbook Pro", "Space Gray", 15.0, "MacOS", 16, 512, false, 1900, 1);
        Laptop l2 = new Laptop("Apple", "Macbook Pro", "Space Gray", 15.0, "MacOS", 16, 512, false, 1900, 2);
        Laptop l3 = new Laptop("HP", "Envy", "Black", 15.6, "Linux", 16, 512, true, 1000, 3);
        Laptop l4 = new Laptop("Asus", "ZenBook", "Gray", 13.3, "Windows", 8, 256, true, 950, 4);
        Laptop l5 = new Laptop("Lenovo", "Legion Pro", "Black", 16.0, "Windows", 32, 1000, true, 2500, 5);
        Laptop l6 = new Laptop("Apple", "Macbook Air", "Space Gray", 13.0, "MacOS", 8, 256, false, 1300, 6);
    

        // add laptops to set (except 6)
        HashSet<Laptop> LaptopStock = new HashSet<>();
        LaptopStock.add(l1);
        LaptopStock.add(l2);
        LaptopStock.add(l3);
        LaptopStock.add(l4);
        LaptopStock.add(l5);

        // search laptop by specification and print
        Stock.Laptop.searchLaptop(LaptopStock, "ZenBook");

        // equals
        System.out.println(l1.equals(l2)); //true
        System.out.println(l1.equals(l4)); //false

        // contains
        System.out.println(LaptopStock.contains(l1)); //true
        System.out.println(LaptopStock.contains(l6)); //false
       
        // print all elements of set
        System.out.println();
        System.out.println("\nLaptops in stock: " + LaptopStock);

}
}