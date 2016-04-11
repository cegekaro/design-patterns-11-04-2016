package ro.cegeka.designpatterns.factory;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;

public final class CarFactory {

    private static CarFactory factory;

    private static HashMap availableCars = new HashMap();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (null == factory) {
            factory = new CarFactory();
        }

        return factory;
    }

    public Car generateCar(String id) throws Exception {
        switch (id) {
            case "audir8":
                return new AudiR8();
            case "bmwm3":
                return new BmwM3();
            case "laferrari":
                return new LaFerrari();
            default:
                throw new Exception("Invalid ID provided");
        }
    }
}
