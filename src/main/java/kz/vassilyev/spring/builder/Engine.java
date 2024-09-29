package kz.vassilyev.spring.builder;

public abstract class Engine {
    protected String model = "Default Engine";

    public String getModel() {
        return model;
    }

    public abstract void startEngine();
    public abstract void closeEngine();
}
