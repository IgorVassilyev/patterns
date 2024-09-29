package kz.vassilyev.spring.abstract_factory;

public class VictorianTable implements Table{
    @Override
    public void hasLegs() {
        System.out.println("Victorian Table has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Table");
    }
}
