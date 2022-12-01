package animal.amphibian;

import animal.Animal;

public class Amphibian extends Animal {

    public String habitat;


    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else this.habitat = "Среда обитания земноводных";
    }


    public void hunt() {
        System.out.println("Охотиться");
    }
}
