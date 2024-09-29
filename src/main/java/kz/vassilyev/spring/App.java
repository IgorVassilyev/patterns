package kz.vassilyev.spring;

import kz.vassilyev.spring.adapter.RoundHole;
import kz.vassilyev.spring.adapter.RoundPeg;
import kz.vassilyev.spring.adapter.SquarePeg;
import kz.vassilyev.spring.adapter.SquarePegAdapter;
import kz.vassilyev.spring.bridge.*;
import kz.vassilyev.spring.builder.Car;
import kz.vassilyev.spring.builder.CarBuilder;
import kz.vassilyev.spring.builder.Director;
import kz.vassilyev.spring.linker.*;
import kz.vassilyev.spring.linker.Dot;
import kz.vassilyev.spring.linker.Rectangle;
import kz.vassilyev.spring.singleton.Database;

import java.awt.*;
import java.awt.Color;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        **********  Factory Method  **********
//        UnixDialog dialog = new UnixDialog();
//        Button btn = dialog.createButton();
//        btn.onClick();
//        System.out.println(btn.defaultMethod());


//        **********  Abstract Factory  **********

//        StyleFurniture style = StyleFurniture.Victorian;
//        FurnitureFactory factory = null;
//        Chair chair = null;
//        Sofa sofa = null;
//        Table table = null;
//
//
//        factory = switch (style){
//            case Modern -> new ModernFactory();
//            case Victorian -> new VictorianFactory();
//            case ArtDeko -> null;
//            default -> throw new IllegalArgumentException("Unknown style: " + style);
//        };
//
//        chair = factory.createChair();
//        sofa = factory.createSofa();
//        table = factory.createTable();
//
//        chair.hasLegs();
//        chair.sitOn();
//
//        sofa.hasLegs();
//        sofa.sitOn();
//
//        table.hasLegs();
//        table.sitOn();


//        **********  Builder and Car Prototype  **********

//        Director director = new Director();
//        CarBuilder builder1 = new CarBuilder();
//
//
//        director.constructDefaultCar(builder1);
//        Car car1 = (Car) builder1.getResult();
//
//        System.out.println(car1.getColor());
//        System.out.println(car1.getDoorCount());
//        System.out.println(car1.getEngine().getModel());
//        System.out.println(car1.getGps().getModel());
//        System.out.println(car1.getWheelCount());
//
//        director.constructSportCar(builder1);
//        Car car2 = (Car) builder1.getResult();
//
//        System.out.println(car2.getColor());
//        System.out.println(car2.getDoorCount());
//        System.out.println(car2.getEngine().getModel());
//        System.out.println(car2.getGps().getModel());
//        System.out.println(car2.getWheelCount());
//
//
//        car1.getEngine().startEngine();
//        car2.getEngine().startEngine();


//        **********  Prototype  **********



//        **********  Singleton  **********

//        Database db = Database.getInstance("Test");
//        System.out.println(db.value);
//        Database db1 = Database.getInstance("Test Test");
//        System.out.println(db.value);


//        **********  Adapter  **********

//        RoundHole hole = new RoundHole(5);
//        RoundPeg rp = new RoundPeg(6);
//
//        SquarePeg sp = new SquarePeg(70);
//
//        System.out.println(hole.fits(new SquarePegAdapter(sp)));


//        **********  Bridge  **********

//        Radio device = new Radio();
//
//        AdvanceRemote advanceRemote = new AdvanceRemote(device);
//
//
//        advanceRemote.togglePower();
//
//        advanceRemote.volumeUp();
//        advanceRemote.volumeUp();
//        advanceRemote.volumeUp();
//
//        advanceRemote.volumeDown();
//
//        advanceRemote.togglePower();
//        advanceRemote.togglePower();
//
//        advanceRemote.volumeUp();
//        advanceRemote.mute();
//        device.printStatus();


//        **********  Linker  **********

        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, java.awt.Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.BLUE),
                        new Dot(360, 360, Color.RED),
                        new Dot(360, 240, Color.MAGENTA)
                )
        );




















    }
}
