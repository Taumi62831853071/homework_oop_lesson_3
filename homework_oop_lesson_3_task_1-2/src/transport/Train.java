package transport;

public class Train extends Transport {


    public int travelCost;
    public float travelTime;
    public String departureStationName;
    public String terminalStationName;
    public int numberOfWagons;
    public float fuelPercentage;

    public Train(String brand,
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
                1000,
                100,
                "-",
                "-",
                10,
                0
        );
        this.travelCost = 2000;
        this.travelTime = 1;
        this.departureStationName = "-";
        this.terminalStationName = "-";
        this.numberOfWagons = 10;
        this.fuelPercentage = 0;

    }

    public Train(String brand, String model, String color, int year, String country, float maxSpeed, int travelCost, int travelTime, String departureStationName, String terminalStationName, int numberOfWagons, float fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed);

        if (travelCost <= 0) {
            this.travelCost = 100;
        } else this.travelCost = travelCost;
        if (travelTime <= 0) {
            this.travelTime = 100;
        } else this.travelTime = travelTime;
        if (departureStationName != null && !model.isEmpty() && !model.isBlank()) {
            this.departureStationName = departureStationName;
        }
        if (terminalStationName != null && !model.isEmpty() && !model.isBlank()) {
            this.terminalStationName = model;
        }
        if (numberOfWagons <= 0) {
            this.numberOfWagons = 10;
        } else this.numberOfWagons = numberOfWagons;
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else this.maxSpeed = maxSpeed;
        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage = 0;
        } else this.fuelPercentage = fuelPercentage;


    }

    @Override
    public void refill() {
        System.out.println(" нужно заправлять дизелем ");
    }
}
