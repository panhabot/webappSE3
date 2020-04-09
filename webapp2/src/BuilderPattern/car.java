package BuilderPattern;

public class car {
    String brand, color, engineType;

    car (String brand, String color, String engineType){
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
    }

    @Override
    public String toString(){
        return color+" : "+brand+" : "+engineType;
    }

    public static class CarBuilder{
        String brand, color, engineType;

        public CarBuilder setEngineType( String engineType ) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder setColor( String color ) {
            this.color = color;
            return this;
        }

        public CarBuilder setBrand( String brand ) {
            this.brand = brand;
            return this;
        }

        public car build(){
            car c = new car(brand,color,engineType);
            return  c;
        }
    }
}
