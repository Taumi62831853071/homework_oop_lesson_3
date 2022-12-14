package transport;

public class Bus extends Transport {

    private int numberOfSeats;
    protected boolean winterTires;
    private int travelCost;
    protected float fuelPercentage;

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

    public Bus(String brand,
               String model,
               String color,
               int year,
               String country,
               float maxSpeed,
               int numberOfSeats,
               boolean winterTires,
               int travelCost,
               float fuelPercentage) {
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

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public float getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(float fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(int travelCost) {
        this.travelCost = travelCost;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    @Override
    public void refill() {
        System.out.println(" ?????????? ???????????????????? ???????????????? ?????? ?????????????? ???? ????????????????");
    }
}