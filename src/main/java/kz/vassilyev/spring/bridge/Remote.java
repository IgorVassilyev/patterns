package kz.vassilyev.spring.bridge;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if(device.isEnabled()) {
            device.disable();
            System.out.println("Устройство выключено");
        } else {
            device.enable();
            System.out.println("Устройство включено");
        }
    }

    public void volumeDown() {
        if(device.isEnabled()) {
            int volume = device.getVolume();
            device.setVolume(volume - 1);
            System.out.println("Громкость равна " + device.getVolume());
        }else {
            System.out.println("Предупреждение: устройство выключено");
        }
    }

    public void volumeUp() {
        if(device.isEnabled()) {
            int volume = device.getVolume();
            device.setVolume(volume + 1);
            System.out.println("Громкость равна " + device.getVolume());
        }else {
            System.out.println("Предупреждение: устройство выключено");
        }
    }

    public void channelDown() {
        if (device.isEnabled()){
            int channel = device.getChannel();
            device.setChannel(channel - 1);
            System.out.println("Включен канал " + device.getChannel());
        }else {
            System.out.println("Предупреждение: устройство выключено");
        }
    }

    public void channelUp() {
        if(device.isEnabled()) {
            int channel = device.getChannel();
            device.setChannel(channel + 1);
            System.out.println("Включен канал " + device.getChannel());
        }else {
            System.out.println("Предупреждение: устройство выключено");
        }
    }

}
