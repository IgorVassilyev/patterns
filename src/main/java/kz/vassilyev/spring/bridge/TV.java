package kz.vassilyev.spring.bridge;

public class TV implements Device{
    private boolean isEnabled = false;

    private final int MAX_VOLUME = 100;
    private final int MAX_CHANNEL = 13;

    private int volume = 0;
    private int channel = 0;

    @Override
    public boolean isEnabled() {
        return this.isEnabled;
    }

    @Override
    public void enable() {
        if(this.isEnabled) {
            System.out.println("Устройство уже включено");
        }else {
            this.isEnabled = true;
        }
    }

    @Override
    public void disable() {
        if(this.isEnabled) {
            this.isEnabled = false;
        }else {
            System.out.println("Устройство уже выключено");
        }
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        if(volume <= 0){
            System.out.println("Громкость равна нулю");
        } else if (volume >= MAX_VOLUME) {
            System.out.println("Громкость равна 100");
        }else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        if(channel <= 0){
            System.out.println("Громкость равна нулю");
        } else if (channel >= MAX_CHANNEL) {
            System.out.println("Громкость равна 13");
        }else {
            this.channel = channel;
        }
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV.");
        System.out.println("| I'm " + (isEnabled ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
