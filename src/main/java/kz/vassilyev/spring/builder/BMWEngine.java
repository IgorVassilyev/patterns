package kz.vassilyev.spring.builder;

public class BMWEngine extends Engine{
    public BMWEngine() {
        this.model = "BMW Engine";
    }

    @Override
    public void startEngine() {
        System.out.println("Start BMV Engine");
    }

    @Override
    public void closeEngine() {
        System.out.println("Close BMV Engine");
    }
}
