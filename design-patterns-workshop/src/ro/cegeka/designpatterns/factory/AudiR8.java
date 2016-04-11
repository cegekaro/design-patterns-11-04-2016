package ro.cegeka.designpatterns.factory;

public class AudiR8 extends Car {

    public AudiR8() {
        this
                .setName("Audi R8")
                .setMaxSpeed(210.34)
                .setYear(2014);

    }

    @Override
    String getEngineSound() {
        return "Vrooooom!";
    }
}
