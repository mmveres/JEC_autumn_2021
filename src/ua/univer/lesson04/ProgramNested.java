package ua.univer.lesson04;

public class ProgramNested {
    public static void main(String[] args) {
        Car.Engine engineBMW= new Car.Engine();
        Car.Engine.TypeEngine typeEngine = Car.Engine.TypeEngine.Electric;
        System.out.println(engineBMW);

    }
}
