package DesignPattern;
//
//public class SingleTonClass {
//    private int id = 3;
//    private String name = "bot";
//    private static SingleTonClass s = new SingleTonClass();
//    private SingleTonClass(){}
//    public void print(){
//        System.out.println("id: "+id+" name: "+name);
//    }
//
//    public static SingleTonClass getObj(){
//        return s;
//    }
//}


//There are two types of single ton
//Early / Wager
//Late / Lazy

//public class SingleTonClass{
//    public void print(){
//        System.out.println("Message.....");
//    }
//    private SingleTonClass(){}
//    private static SingleTonClass s = null;
//    public static SingleTonClass getObj(){
//        if (s == null){
//            s = new SingleTonClass();
//        }
//        return s;
//    }
//}


public class SingleTonClass{
    public void print(){
        System.out.println("Message.....");
    }
    private SingleTonClass(){}
    private static SingleTonClass s = null;
    public static SingleTonClass getObj(){
        Object lock = new Object();
        Object lock1 = new Object();
        synchronized (lock){
            if(s == null)
                s = new SingleTonClass();
        }
        synchronized (lock1){
            System.out.println("hello....");
            System.out.println("hi.....");
        }
        return s;
    }
}