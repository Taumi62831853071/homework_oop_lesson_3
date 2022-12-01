package animal.mammal;

import animal.Animal;

public class Mammal extends Animal {

    public String habitat;
    public int speed;

    public Mammal(String name, int age, String habitat, int speed) {
        super(name, age);
        setHabitat(habitat);
        setSpeed(speed);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else this.habitat = "Среда обитания млекопитающих";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 1;
        } else this.speed = speed;
    }



    public static class Herbivore extends Mammal {

        public String foodType;


        public Herbivore(String name, int age, String habitat, int speed, String foodType) {
            super(name, age, habitat, speed);
            setFoodType(foodType);
        }

        public String getFoodType() {
            return foodType;
        }

        public void setFoodType(String foodType) {
            if (foodType != null && !foodType.isEmpty() && !foodType.isBlank()) {
                this.foodType = foodType;
            } else this.foodType = "Тип пищи травоядных";
        }


        public void graze() {
            System.out.println("Пастись");
        }
    }



    public static class Predator extends Mammal {

        public String foodType;


        public Predator(String name, int age, String habitat, int speed, String foodType) {
            super(name, age, habitat, speed);
            setFoodType(foodType);
        }

        public String getFoodType() {
            return foodType;
        }

        public void setFoodType(String foodType) {
            if (foodType != null && !foodType.isEmpty() && !foodType.isBlank()) {
                this.foodType = foodType;
            } else this.foodType = "Тип пищи хищников";
        }


        public void hunt() {
            System.out.println("Охотиться");
        }
    }


    public void walk() {
        System.out.println("Гулять");
    }
}
