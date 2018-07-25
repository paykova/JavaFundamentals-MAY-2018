package p09_TrafficLights;

import java.util.ArrayDeque;

public enum TrafficLights {
    RED,
    GREEN,
    YELLOW;

    private ArrayDeque<TrafficLights> trafficLights;

    TrafficLights() {
        this.trafficLights = new ArrayDeque<>();
    }

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
