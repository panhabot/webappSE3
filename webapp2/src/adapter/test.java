package adapter;

interface Airpod{
    void listen();
}
interface Earphone{
    void listen();
}

class Earphone_connector implements Earphone{
    private ios ios;
    public Earphone_connector(ios ios){
        this.ios =ios;
    }
    @Override
    public void listen() {
        this.ios.listen();
    }
}
class android implements Airpod{
    @Override
    public void listen() {
        System.out.println("listen music on android");
    }
}

class ios implements Airpod{
    @Override
    public void listen() {
        System.out.println("listen music on Iphone");
    }
}
public class test{
    public static void main( String[] args ) {
        android s10 = new android();
        s10.listen();

        ios iphone7 = new ios();
        iphone7.listen();

        Earphone iphonex = new Earphone_connector(new ios());
        iphonex.listen();
    }
}