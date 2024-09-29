package kz.vassilyev.spring.abstract_factory;

public class ModernChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Modern Chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Chair");
    }
}
