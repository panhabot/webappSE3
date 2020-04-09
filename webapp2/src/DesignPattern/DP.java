package DesignPattern;
//
//public class DP {
//    public static void main( String[] args ) {
//        SingleTonClass sc = SingleTonClass.getObj();
//        sc.print();
//    }
//}


//public class DP{
//    public static void main( String[] args ) {
//        SingleTonClass sc = SingleTonClass.getObj();
//        sc.print();
//        System.out.println(sc);
//    }
//}

public class DP{
    static SingleTonClass sc = null;
    static SingleTonClass sc1 = null;
    static SingleTonClass sc2 = null;
    public static void main( String[] args ) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
               sc1 = SingleTonClass.getObj();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sc2 = SingleTonClass.getObj();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(sc1);
        System.out.println(sc2);
    }
}