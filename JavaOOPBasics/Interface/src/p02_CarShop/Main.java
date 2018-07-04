package p02_CarShop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Car seat = new Seat("Spain", "Leon", "gray", 110);

        System.out.println(seat.toString());
    }
}
