package ua.univer.lesson04;

public class Plane {
    private String name;
    private Engine engine;
    static class Engine{
        private String name;
        private double capasity;
        private TypeEngine type;
        enum TypeEngine{
            AeroFuel;
        }
    }
}
