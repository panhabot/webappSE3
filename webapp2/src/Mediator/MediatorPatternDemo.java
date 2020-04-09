package Mediator;

public class MediatorPatternDemo {
    public static void main( String[] args ) {
        user bot = new user("Bot");
        user mony = new user ("mony");

        bot.sendMessage("hello");
        mony.sendMessage("hello hello");
    }
}
