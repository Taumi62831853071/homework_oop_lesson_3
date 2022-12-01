package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    public String color;
    public float maxSpeed;


    public Transport(String brand, String model, int year, String country, String color, float maxSpeed) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setCountry(country);
        setColor(color);
        setMaxSpeed(maxSpeed);

    }


    public abstract void refill();

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;

    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        }
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }
    }
    public float getMaxSpeed () {
        return maxSpeed;
    }
    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
