package p09_TrafficLights;

public class TrafficMachine {

    private TrafficLights trafficLights;

    public TrafficMachine(String trafficLights) {
        this.trafficLights = Enum.valueOf(TrafficLights.class, trafficLights.toUpperCase());
    }

    public void changeLight(){
        int currentIndex = this.trafficLights.ordinal();
        int nextIndex = (currentIndex + 1 ) % 3;

        this.trafficLights = TrafficLights.values()[nextIndex];
    }

    @Override
    public String toString(){
        return this.trafficLights.name();
    }
}
