package CatLibrary;

import java.util.Date;
import java.util.Objects;

public class Cat {
    
    public int weight;
    public String name;
    public int color;
    public Date age;
    public boolean isMale;
    public long id;

    public Cat(int weight, String name, int color, Date age, boolean isMale, long id) {
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isMale = isMale;
        this.id = id;
    }

    public boolean medSup(){
        return true;
    }

    @Override
    public String toString(){
        return "Кличка: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return weight == cat.weight && color == cat.color && isMale == cat.isMale ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, name, color, age, isMale, id);
    }
}
