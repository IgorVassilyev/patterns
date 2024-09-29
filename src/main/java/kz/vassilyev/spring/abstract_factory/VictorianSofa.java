package kz.vassilyev.spring.abstract_factory;

public class VictorianSofa implements Sofa{
    @Override
    public void hasLegs() {
        System.out.println("Victorian Sofa has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Sofa");
    }
}
