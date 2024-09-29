package kz.vassilyev.spring.builder;

public class LadaEngine extends Engine{
    public LadaEngine() {
        this.model = "LADA Engine";
    }
    @Override
    public void startEngine() {
        System.out.println("Start Lada Engine");

    }

    @Override
    public void closeEngine() {
        System.out.println("Close Lada Engine");
    }
}
