
public class Main {
    public static void main(String[] args) {

        Device light = new LightDevice();
        Device musicPlayer = new MusicPlayerDevice();


        Command turnOnLight = new TurnOnCommand(light);
        Command turnOnMusicPlayer = new TurnOnCommand(musicPlayer);


        CommandInvoker invoker = new CommandInvoker();


        invoker.setCommand(turnOnLight);
        invoker.executeCommand();

        invoker.setCommand(turnOnMusicPlayer);
        invoker.executeCommand();
    }
}