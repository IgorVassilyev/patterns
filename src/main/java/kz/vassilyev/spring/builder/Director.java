package kz.vassilyev.spring.builder;

public class Director {
    public void constructSportCar(Builder builder){
        builder.setEngine(new BMWEngine());
        builder.setGPS(new BMWGPS());
        builder.setColor("RED");
        builder.setDoorCount(2);
        builder.setWhellCount(4);
    };

    public void constructDefaultCar(Builder builder){
        builder.setEngine(new LadaEngine());
        builder.setGPS(new LadaGPS());
        builder.setColor("Gray");
        builder.setDoorCount(4);
        builder.setWhellCount(4);
    };
}
