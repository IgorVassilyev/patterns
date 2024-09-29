package kz.vassilyev.spring.builder;

import kz.vassilyev.spring.prototype.Prototype;

public class CarBuilder implements Builder{
    Car car = new Car();

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setGPS(GPS gps) {
        car.setGps(gps);
    }

    @Override
    public void setColor(String color) {
        car.setColor(color);
    }

    @Override
    public void setWhellCount(Integer count) {
        car.setWheelCount(count);
    }

    @Override
    public void setDoorCount(Integer count) {
        car.setDoorCount(count);
    }

    @Override
    public Prototype getResult() {
        return car.clone();
    }
}
