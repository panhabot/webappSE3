package Mediator;

public class user {
    private String name;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }
    public user(String name){
        this.name = name;
    }

    public void sendMessage(String message){
        chatroom.showMessage(this, message);
    }
}

