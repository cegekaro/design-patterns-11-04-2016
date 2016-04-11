package ro.cegeka.designpatterns.factory;

public class LaFerrari extends Car {

    public LaFerrari() {
        this
                .setName("Ferrari LaFerrari")
                .setYear(2013)
                .setMaxSpeed(363.15);
    }

    @Override
    String getEngineSound() {
        return "Grooooumphf!";
    }
}
