
public class MusicPlayerDevice implements Device {
    @Override
    public void turnOn() {
        System.out.println("Music player is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Music player is turned off.");
    }
}