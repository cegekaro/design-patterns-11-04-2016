package ro.cegeka.designpatterns.factory;


abstract public class Car {

    protected String name;

    protected double maxSpeed;

    protected int year;

    /**
     * Get the sound that is specific to this car's engine.
     *
     * @return The sound of the engine.
     */
    abstract String getEngineSound();

    @Override
    public String toString() {
        return String.format("The %s has been released in %d and it can easily reach %f.\n" +
                "When it flies by, it usually sounds like `%s`\n\n",
                this.getName(),
                this.getYear(),
                this.getMaxSpeed(),
                this.getEngineSound()
        );
    }

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Car setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }
}
