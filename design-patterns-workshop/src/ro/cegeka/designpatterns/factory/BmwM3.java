package ro.cegeka.designpatterns.factory;

public class BmwM3 extends Car {
    public BmwM3() {
        this
                .setName("BMW M3")
                .setYear(1986)
                .setMaxSpeed(180.00);
    }

    @Override
    String getEngineSound() {
        return "Wooosh!";
    }
}
