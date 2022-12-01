package transport;

public class Bus extends Transport {

    public int numberOfSeats;
    public boolean winterTires;
    public int travelCost;
    public float fuelPercentage;

    public Bus(String brand,
               String model,
               String color,
               int year,
               String country,
               float maxSpeed) {
        this(
                brand,
                model,
                color,
                year,
                country,
                maxSpeed,
                37,
                true,
                30,
                0
        );
        this.numberOfSeats = 37;
        this.winterTires = true;
        this.travelCost = 30;
        this.fuelPercentage = 0;
    }

    public Bus(String brand, String model, String color, int year, String country, float maxSpeed, int numberOfSeats, boolean winterTires, int travelCost, float fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed);

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 100;
        } else this.numberOfSeats = numberOfSeats;
        this.winterTires = winterTires;
        if (travelCost <= 0) {
            this.travelCost = 30;
        } else this.travelCost = travelCost;
        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage = 0;
        } else this.fuelPercentage = fuelPercentage;

    }

    public boolean isWinterTires() {
        return winterTires;
    }

    @Override
    public void refill() {
        System.out.println(" можно заправлять бензином или дизелем на заправке");
    }
}