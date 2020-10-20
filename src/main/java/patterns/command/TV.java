package patterns.command;

public class TV {

    private int volume;
    private final int INITIAL_VOLUME = 3;

    public void turnOn() {
        System.out.println("TV turned on");
        setVolume(INITIAL_VOLUME);
    }

    public void turnOff() {
        System.out.println("TV turned off");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume is : " + volume);
    }

    public void volumeUp() {
        setVolume(volume + 1);
    }

    public void volumeDown() {
        setVolume(volume == 0 ? volume : volume - 1);
    }
}
