package Mediator;

import java.util.Date;

public class chatroom {
    public static void showMessage( user user, String message){
        System.out.println(new Date().toString() + " [ " + user.getName() + "] : "+message);
    }
}

