package kz.vassilyev.spring.abstract_factory;

public class ModernSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Modern Sofa has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Sofa");
    }
}
