package animal.bird;

import animal.Animal;

public class Bird extends Animal {

    public String habitat;


    public Bird(String name, int age, String habitat) {
        super(name, age);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty() && !habitat.isBlank()) {
            this.habitat = habitat;
        } else this.habitat = "Среда обитания птиц";
    }



    public static class Flightless extends Bird {

        public String movementType;


        public Flightless(String name, int age, String habitat, String movementType) {
            super(name, age, habitat);
            setMovementType(movementType);
        }

        public String getMovementType() {
            return movementType;
        }

        public void setMovementType(String movementType) {
            if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
                this.movementType = movementType;
            } else this.movementType = "Способ перемещения нелетающих птиц";
        }


        public void walk() {
            System.out.println("Гулять");
        }
    }



    public static class Flying extends Bird {

        public String movementType;


        public Flying(String name, int age, String habitat, String movementType) {
            super(name, age, habitat);
            setMovementType(movementType);
        }

        public String getMovementType() {
            return movementType;
        }

        public void setMovementType(String movementType) {
            if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
                this.movementType = movementType;
            } else this.movementType = "Способ перемещения летающих птиц";
        }


        public void fly() {
            System.out.println("Летать");
        }
    }


    public void hunt() {
        System.out.println("Охотиться");
    }
}
