package pl.hornunge.behavioral.command.example1.device;

public class Tv {
    public void turnOn(){
        System.out.println("Turning TV on.");
    }
    public void turnOff(){
        System.out.println("Turning TV off.");
    }
    public void setChannel(int channel){
        System.out.println("Setting channel to " + channel);
    }
    public void setVolume(int volume){
        System.out.println("Setting volume to " + volume);
    }
}
