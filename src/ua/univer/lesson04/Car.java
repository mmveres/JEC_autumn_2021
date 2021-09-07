package ua.univer.lesson04;

public class Car {
    private String name;
    private String number;
    private Engine engine;
    private Salon salon;
    private Transmision transmision;
    public static class FactoryEngine {
        public static Engine getEngine(Compect compect){
            switch(compect) {
                case Trend: return new Car.Engine("TDI", Engine.TypeEngine.Diesel, 100);
                case Lux: return new Car.Engine("Electro100", Engine.TypeEngine.Electric, 100);
                default: throw new IllegalArgumentException(" No such complect");
            }
        }
    }
    static class Engine{
        private String name;
        private TypeEngine type;
        private double capacity;
        enum TypeEngine{
            Gasoline, Diesel, Gas, Electric;
        }

        public Engine() {
            this("Base", TypeEngine.Gasoline,90);
        }

        public Engine(String name, TypeEngine type, double capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public TypeEngine getType() {
            return type;
        }

        public double getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    ", capacity=" + capacity +
                    '}';
        }
    }
    class Salon{
        private String type;
    }
    enum Transmision{
        Mechanic, Automatic;
    }
    enum Compect{
        Trend, Lux;
    }
    public Car(String name, String number,Compect compect) {
        this.name = name;
        this.number = number;
        this.engine = FactoryEngine.getEngine(compect);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", engine=" + engine +
                ", salon=" + salon +
                ", transmision=" + transmision +
                '}';
    }
}
