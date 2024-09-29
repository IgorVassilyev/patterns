package kz.vassilyev.spring.builder;

public class LadaGPS extends GPS{

    public LadaGPS() {
        this.model = "Lada GPS";
    }

    @Override
    boolean hasGPS() {
        return false;
    }
}
