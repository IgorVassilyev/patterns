package kz.vassilyev.spring.builder;

import kz.vassilyev.spring.prototype.Prototype;

public class Car implements Prototype {
    private Engine engine;
    private GPS gps;
    private String color;
    private Integer wheelCount;
    private Integer doorCount;

    public Car() {

    }

    private Car(Car prototype) {
        this.engine = prototype.engine;
        this.gps = prototype.gps;
        this.color = prototype.color;
        this.wheelCount = prototype.wheelCount;
        this.doorCount = prototype.doorCount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Integer getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    @Override
    public Prototype clone() {
        return new Car(this);
    }
}
