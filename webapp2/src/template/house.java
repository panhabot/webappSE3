package template;

public abstract class house {
    abstract void header();
    abstract void body();
     void footer(){
         System.out.println("Build with sand and steel");
     }
     public final void templateMethod(){
         footer();
         body();
         header();
     }
}


class WoodenHouse extends house{
    @Override
    void footer() {
        super.footer();
    }

    @Override
    void header() {
        System.out.println("Wooden roof");
    }

    @Override
    void body() {
        System.out.println("Wooden body");
    }
}

class concreteHouse extends house{
    @Override
    void header() {
        System.out.println("Concrete Roof");
    }

    @Override
    void body() {
        System.out.println("Cement Roof");
    }
}