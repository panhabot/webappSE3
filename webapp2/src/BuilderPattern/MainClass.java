package BuilderPattern;

public class MainClass {
    public static void main( String[] args ) {
        car c = new car.CarBuilder().setBrand("Ford").setColor("RED").setEngineType("Fuel").build();
        System.out.println(c);

        car ca = new car.CarBuilder().setColor("WHITE").build();
        System.out.println(ca);
    }
}