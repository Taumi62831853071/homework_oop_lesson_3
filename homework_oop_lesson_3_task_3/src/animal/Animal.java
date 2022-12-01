package animal;

import com.sun.tools.javac.Main;

import java.util.Objects;

public class Animal extends Main {
    public String name;
    public int age;


    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else this.name = "Животное";
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        if (age <= 0) {
            this.age = 1;
        } else this.age = age;
    }


    public void eat() {
        System.out.println("Кушать");
    }


    public void sleep() {
        System.out.println("Спать");
    }


    public void move() {
        System.out.println("Перемещаться");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
