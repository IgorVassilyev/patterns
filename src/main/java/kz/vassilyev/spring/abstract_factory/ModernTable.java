package kz.vassilyev.spring.abstract_factory;

public class ModernTable implements Table{
    @Override
    public void hasLegs() {
        System.out.println("Modern Table has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Modern Table");
    }
}
