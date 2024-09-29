package kz.vassilyev.spring.builder;

import kz.vassilyev.spring.prototype.Prototype;

public interface Builder {
    void setEngine(Engine engine);
    void setGPS(GPS gps);
    void setColor(String color);
    void setWhellCount(Integer count);
    void setDoorCount(Integer count);
    Prototype getResult();
}
