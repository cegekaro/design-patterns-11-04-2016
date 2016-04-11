package ro.cegeka.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        try {
            AudiR8 audi = (AudiR8) CarFactory.getInstance().generateCar("audir8");
            BmwM3 bmw = (BmwM3) CarFactory.getInstance().generateCar("bmwm3");
            LaFerrari ferrari = (LaFerrari) CarFactory.getInstance().generateCar("laferrari");

            System.out.print(audi.toString() + bmw.toString() + ferrari.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
