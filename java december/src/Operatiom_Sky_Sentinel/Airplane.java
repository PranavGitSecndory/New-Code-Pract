package Operatiom_Sky_Sentinel;

public abstract class Airplane {
    protected String callSign;
    protected String type;
    protected int fuelLevel;

    public Airplane(String callSign, String type) {
        this.callSign = callSign;
        this.type = type;
        this.fuelLevel = 100;
    }

    public abstract void performMission(String target);

    public void refuel() {
        this.fuelLevel = 100;
    }

    @Override
    public String toString() {
        return "CallSign: " + callSign + ", Type: " + type + ", Fuel Level: " + fuelLevel + "%";
    }
}

