package transport;

public class Train extends Transport {


    private int travelCost;
    private float travelTime;
    private String departureStationName;
    private String terminalStationName;
    private int numberOfWagons;
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

    public Train(String brand,
                 String model,
                 String color,
                 int year,
                 String country,
                 float maxSpeed,
                 int travelCost,
                 int travelTime,
                 String departureStationName,
                 String terminalStationName,
                 int numberOfWagons,
                 float fuelPercentage) {
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

    public int getTravelCost() {
        return travelCost;
    }

    public void setTravelCost(int travelCost) {
        this.travelCost = travelCost;
    }

    public float getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(float travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getTerminalStationName() {
        return terminalStationName;
    }

    public void setTerminalStationName(String terminalStationName) {
        this.terminalStationName = terminalStationName;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill() {
        System.out.println(" нужно заправлять дизелем ");
    }
}
