package transport;


import java.time.LocalDate;

public class Car extends Transport {



    protected double engineVolume;
    protected String transmission;
    protected String bodyType;
    protected String registrationNumber;
    private int numberOfSeats;
    protected boolean winterTires;
    private Key key;
    private Insurance insurance;
    protected float fuelPercentage;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               float maxSpeed,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean winterTires,
               Key key,
               Insurance insurance,
               float fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed);


        this.engineVolume = engineVolume;
        if (color == null) {
            this.color = "белый";
        } else this.color = color;
        if (maxSpeed <= 0) {
            this.maxSpeed = 100;
        } else this.maxSpeed = maxSpeed;
        if (transmission == null) {
            this.transmission = "МКПП";
        } else this.transmission = transmission;
        if (transmission == null) {
            this.registrationNumber = "x000xx000";
        } else this.registrationNumber = registrationNumber;
        if (bodyType == null) {
            this.bodyType = "седан";
        } else this.bodyType = bodyType;
        if (key == null) {
            this.key = new Key();
        } else this.key = key;
        if (insurance == null) {
            this.insurance = new Insurance();
        } else this.insurance = insurance;
        this.numberOfSeats = numberOfSeats;
        this.winterTires = winterTires;
        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage = 0;
        } else this.fuelPercentage = fuelPercentage;
    }

    public Car(String brand,
               String model,
               Double engineVolume,
               String color,
               int year,
               String country,
               float maxSpeed) {
        this(
                brand,
                model,
                engineVolume,
                color,
                year,
                country,
                maxSpeed,
                "МКПП",
                "x000xx000",
                "седан",
                5,
                false,
                new Key(),
                new Insurance(),
                0
        );
        this.transmission = "МКПП";
        this.registrationNumber = "x000xx000";
        this.bodyType = "седан";
        this.numberOfSeats = 5;
        this.winterTires = false;
        this.fuelPercentage = 0;
    }

    public void setTransmission(String transmission) {
        if (transmission == null) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
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

    public boolean isWinterTires() {
        return winterTires;
    }
    public String getBodyType() {
        return bodyType;
    }
    public void setBodyType(String bodyType) {

        this.bodyType = bodyType;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void changeTyres() {
        winterTires = !winterTires;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (
                !Character.isAlphabetic(chars[0]) ||
                !Character.isDigit(chars[1]) ||
                !Character.isDigit(chars[2]) ||
                !Character.isDigit(chars[3]) ||
                !Character.isAlphabetic(chars[4]) ||
                !Character.isAlphabetic(chars[5]) ||
                !Character.isDigit(chars[6]) ||
                !Character.isDigit(chars[7]) ||
                !Character.isDigit(chars[8]))
        {
            return false;
        } else return true;
    }
    public static class Key {

        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key (boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key () {
            this(false,false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if(expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else this.expireDate = expireDate;
            this.cost = cost;
            if(number == null) {
                this.number = "123456789";
            } else this.number = number;
        }

        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }
        public double getCost() {
            return cost;
        }
        public String getNumber() {
            return number;
        }



        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }

    }

    @Override
    public void refill() {
        System.out.println(" можно заправлять бензином, дизелем на заправке или заряжать на специальных " +
                "элетропарковках, если это электрокар ");
    }
}