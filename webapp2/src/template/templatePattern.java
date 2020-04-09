package template;

public class templatePattern {
    public static void main( String[] args ) {
      house house = new WoodenHouse();
      house.templateMethod();

      house house1 = new concreteHouse();
      house1.templateMethod();
    }
}

