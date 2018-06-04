import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class p01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Set<String> carNumber = new HashSet<>();

        String text = scanner.nextLine();


        while (!"END".equals(text)){

            String[] input = text.split(", ");

            String inORout = input[0];
            String dataCarInfo = input[1];

            if (inORout.equals("IN")){
                carNumber.add(dataCarInfo);
            }
            if (inORout.equals("OUT")){
                carNumber.remove(dataCarInfo);
            }

            text = scanner.nextLine();
        }

        if (!carNumber.isEmpty()){
            for (String s : carNumber) {
                System.out.println(s);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
