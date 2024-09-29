package kz.vassilyev.spring.abstract_factory;

public class VictorianChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Victorian Chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair");
    }
}
