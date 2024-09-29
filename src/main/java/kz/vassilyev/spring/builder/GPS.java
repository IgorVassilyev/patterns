package kz.vassilyev.spring.builder;

public abstract class GPS {
    protected String model = "Default GPS";


    public String getModel() {
        return model;
    }

    abstract boolean hasGPS();
}
