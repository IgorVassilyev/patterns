package kz.vassilyev.spring.builder;

public class BMWGPS extends GPS{

    public BMWGPS() {
        this.model = "BMW GPS";
    }

    @Override
    boolean hasGPS() {
        return false;
    }
}
