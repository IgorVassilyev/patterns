package kz.vassilyev.spring.bridge;

public class AdvanceRemote extends Remote{
    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
