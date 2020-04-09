package StrategyPattern;
interface strategy{
    public int doOperation(int a, int b);
}
class doOperationAdd implements strategy{
    @Override
    public int doOperation( int a, int b ) {
        return a + b;
    }
}

class doOperationSub implements strategy{
    @Override
    public int doOperation( int a, int b ) {
        return a - b;
    }
}

class doOperationMul implements strategy{
    @Override
    public int doOperation( int a, int b ) {
        return a * b;
    }
}

class context{
    strategy strategy;
    public context(strategy strategy){
        this.strategy = strategy;
    }
    public int executeOperation( int a, int b){
        return strategy.doOperation(a,b);
    }
}
public class strategy_pattern {
    public static void main( String[] args ) {
        context context = new context(new doOperationAdd());
        System.out.println(String.format("10 + 20 = %s", context.executeOperation(10,20)));
        context = new context(new doOperationSub());
        System.out.println(String.format("20 - 10 = %s", context.executeOperation(20,10)));
    }
}
