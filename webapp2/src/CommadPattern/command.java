package CommadPattern;

public class command {
    public static void main( String[] args ) {
        simpleRemoteControl remote = new simpleRemoteControl();
        Light light = new Light();
        remote.setCommand(new commandLightOn(light));
        remote.buttonWasPressed();
        remote.setCommand(new commandLightOff(light));
        remote.buttonWasPressed();
    }
}

interface comand{
    public void execute();
}

class Light{
    public void on(){
        System.out.println("The light on");
    }
    public void off(){
        System.out.println("The light off");

    }
}
class commandLightOn implements comand{
    @Override
    public void execute() {
        light.on();
    }

    Light light;
    public commandLightOn(Light light){
        this.light = light;
    }
}
class commandLightOff implements comand{
    @Override
    public void execute() {
        light.off();
    }
    Light light;
    public commandLightOff(Light light){
        this.light = light;
    }
}

class simpleRemoteControl{
    comand comand;
    public void setCommand(comand comand){
        this.comand = comand;
    }
    public void buttonWasPressed(){
        comand.execute();
    }
}
