public abstract class AbstractEngineVehicle implements Vehicle{

    private final int numberOfGears;

    private int currentGear;

    private boolean gearShouldIncrease;

    private boolean isOn;

    public AbstractEngineVehicle(int numberOfGears) {
        //TODO write here...
    }

    @Override
    public String start() {
        //TODO write here...
    }

    @Override
    public String stop() {
        //TODO write here...
    }

    @Override
    public String changeGear() {
        //TODO write here...
    }

    protected abstract String doStart();

    protected abstract String doStop();

    public int getCurrentGear() {
        return currentGear;
    }
}
