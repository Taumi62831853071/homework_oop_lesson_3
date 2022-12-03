import java.io.PrintStream;
import transport.Bus;
import transport.Car;
import transport.Train;

public abstract class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car car1 = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтого",
                2015,
                "России",
                179.0F
        );
        System.out.println(car1.isCorrectRegNumber());
        car1.setTransmission("МКПП");
        car1.setBodyType("седан, лифтбек");
        car1.registrationNumber = "a000aa000";
        car1.winterTires = false;
        car1.fuelPercentage = 91.01F;
        Car car2 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черного",
                2020,
                "Германии",
                250.0F
        );
        System.out.println(car2.isCorrectRegNumber());
        car2.setTransmission("АКПП");
        car2.setBodyType("Седан");
        car2.registrationNumber = "b111bb111";
        car2.winterTires = true;
        car1.fuelPercentage = 11.21F;
        Car car3 = new Car(
                "BMW",
                "Z8",
                3.0,
                "черного",
                2021,
                "Германии",
                250.0F
        );
        System.out.println(car3.isCorrectRegNumber());
        car3.setTransmission("МКПП");
        car3.setBodyType("Родстер");
        car3.registrationNumber = "c222cc222";
        car3.winterTires = true;
        car1.fuelPercentage = 31.41F;
        Car car4 = new Car("Kia",
                "Sportage 4-поколения",
                2.4,
                "красного",
                2018,
                "Южной Корееи",
                185.0F
        );
        System.out.println(car4.isCorrectRegNumber());
        car4.setTransmission("МКПП, АКПП, Робот");
        car4.setBodyType("Универсал");
        car4.registrationNumber = "d333dd333";
        car4.winterTires = false;
        car1.fuelPercentage = 51.61F;
        Car car5 = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "ораньжевого",
                2016,
                "Южной Корее",
                200.0F
        );
        System.out.println(car5.isCorrectRegNumber());
        car5.setTransmission("АКПП");
        car5.setBodyType("Седан");
        car5.registrationNumber = "e444ee444";
        car5.winterTires = true;
        car1.fuelPercentage = 71.81F;
        printInfoCar(car1);
        car1.refill();
        printInfoCar(car2);
        car2.refill();
        printInfoCar(car3);
        car3.refill();
        printInfoCar(car4);
        car4.refill();
        printInfoCar(car5);
        car5.refill();
        System.out.println();
        Train train1 = new Train(
                "Ласточка",
                "901",
                "белый",
                2011,
                "Россия",
                301.0F
        );
        train1.setTravelCost(3500);
        train1.setDepartureStationName("Белорусский вокзал");
        train1.setDepartureStationName("станция Минск-Пассажирский");
        train1.setNumberOfWagons(11);
        train1.fuelPercentage = 0.0F;
        Train train2 = new Train(
                "Ленинград",
                "D-125",
                "",
                2019,
                "Россия",
                270.0F);
        train2.setTravelCost(1700);
        train2.setDepartureStationName("Ленинский вокзал");
        train2.setTerminalStationName("Ленинград-Пассажирский");
        train2.setNumberOfWagons(8);
        train1.fuelPercentage = 92.02F;
        printInfoTrain(train1);
        train1.refill();
        printInfoTrain(train2);
        train2.refill();
        System.out.println();
        Bus bus1 = new Bus(
                "Kia",
                "Granbird",
                "серебристый",
                2008,
                "Россия",
                137.0F
        );
        bus1.setNumberOfSeats(45);
        bus1.winterTires = false;
        bus1.setTravelCost(0);
        bus1.fuelPercentage = 100.0F;
        Bus bus2 = new Bus(
                "Паз",
                "Granbird",
                "белый",
                2017,
                "Россия",
                90.0F
        );
        bus2.setNumberOfSeats(38);
        bus2.winterTires = true;
        bus2.setTravelCost(30);
        bus2.fuelPercentage = 12.34F;
        Bus bus3 = new Bus(
                "Wright Eclipse Gemini",
                "3",
                "красный",
                2014,
                "Великобритания",
                250.0F
        );
        bus3.setNumberOfSeats(49);
        bus3.winterTires = false;
        bus3.setTravelCost(436);
        bus2.fuelPercentage = 56.78F;
        printInfoBus(bus1);
        bus1.refill();
        printInfoBus(bus2);
        bus2.refill();
        printInfoBus(bus3);
        bus3.refill();
    }



    private static void printInfoCar(Car car) {
        PrintStream var10000 = System.out;
        String var10001 = car.getBrand();
        var10000.print(var10001 + " " + car.getModel() + ", год выпуска: " + car.getYear() + ", страна сборки: " +
                car.getCountry() + " цвет кузова: " + car.getBodyType() + " объём двигателя: " + car.engineVolume +
                " коробка передач: " + car.transmission + " максимальная скорость " + car.maxSpeed + " тип кузова " +
                car.getBodyType() + " рег. номер " + car.registrationNumber + " коллтчество мест: " +
                car.getNumberOfSeats() + ", " + (car.isWinterTires() ? "зимняя" : "летняя") + " резина, " +
                (car.getKey().isKeylessAccess() ? "Безключевой доступ" : "Ключевой доступ") + ", " +
                (car.getKey().isRemoteEngineStart() ? "Удалённый запуск" : "Обычный запуск") + ", " +
                (car.getKey().isKeylessAccess() ? "Безключевой доступ" : "Ключевой доступ") + ", номер страховки: " +
                car.getInsurance().getNumber() + ", Стоимость страховки: " + car.getInsurance().getCost() +
                ", Срок действия страховки: " + String.valueOf(car.getInsurance().getExpireDate()) +
                ", колличество топлива в процентах " + car.fuelPercentage);
    }

    private static void printInfoTrain(Train train) {
        PrintStream var10000 = System.out;
        String var10001 = train.getBrand();
        var10000.print("Поезд " + var10001 + ", модель " + train.getModel() + ", " + train.getYear() +
                " года выпуска в " + train.getCountry() + ", скорость передвижения - " + train.getMaxSpeed() +
                " км/ч, отходит от " + train.getDepartureStationName() + " и следует до " +
                train.getTerminalStationName() + ". Цена поездки - " + train.getTravelCost() + " рублей, в поезде " +
                train.getNumberOfWagons() + " вагонов., колличество топлива в процентах " + train.fuelPercentage);
    }

    private static void printInfoBus(Bus bus) {
        PrintStream var10000 = System.out;
        String var10001 = bus.getBrand();
        var10000.print("Автобус " + var10001 + ", модель " + bus.getModel() + ", " + bus.getYear() +
                " года выпуска в " + bus.getCountry() + ", скорость передвижения - " + bus.getMaxSpeed() +
                " км/ч, колличество мест " + bus.getNumberOfSeats() + ". Цена поездки - " + bus.getTravelCost() +
                " рублей.  " + (bus.isWinterTires() ? "зимняя" : "летняя") +
                " резина, колличество топлива в процентах " + bus.fuelPercentage);
    }
}