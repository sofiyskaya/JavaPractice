package Stock;

import java.util.HashSet;
// import java.util.Objects;

public class Laptop {
    public String brand;
    public String model;
    public String color;
    public double screenSize;
    public String operSystem;
    public int ram;
    public int ssd;
    public boolean hdmi;    //не самый важный показатель, хотела использовать больше типов данных
    public double price;
    public long id;

    public Laptop(String brand, String model, String color, double screenSize, String operSystem, int ram, int ssd, boolean hdmi, double price, long id){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.operSystem = operSystem;
        this.ram = ram;
        this.ssd = ssd;
        this.hdmi = hdmi;
        this.price = price;
        this.id = id;
    }

    public static void searchLaptop(HashSet<Laptop> set, String serchObject) {
        for (Object item : set) {
            if (item.toString().contains(serchObject)) {
                System.out.println(item);
            }
        }

    }

    public static void printHash(HashSet<Laptop> set){
        for (Object item: set){
            System.out.println(item.hashCode());
        }
    }
 
    @Override
    public String toString(){
        return "Laptop: " +
        "Brand - " + brand +
        ", Model - " + model +
        ", Color - " + color +
        ", Screen diagonal - " + screenSize +
        ", Operation system - " + operSystem +
        ", RAM - " + ram +
        ", SSD - " + ssd +
        ", The HDMI connector availability - " + hdmi +
        ", Price - " + price + "$";
    }


    @Override
    public boolean equals(Object o){
        if (this == o) 
        return true;
        if (o == null)
        return false;
        if(getClass() != o.getClass())
        return false;
        Laptop other  = (Laptop) o;

        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;

        if (operSystem == null) {
            if (other.operSystem != null)
                return false;
        } else if (!operSystem.equals(other.operSystem))
            return false;

        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;

        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;

        if (ram != other.ram)
            return false;

        if (ssd != other.ssd)
            return false;

        if (hdmi != other.hdmi)
            return false;

        if (price != other.price) 
                return false;

        if (screenSize != other.screenSize) {
                return false;

    }
        return true;
}
}
