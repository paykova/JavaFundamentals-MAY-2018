import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


import static java.lang.System.in;

public class p12_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> junkMap = new TreeMap<>();

        map.put("shards", 0);
        map.put("fragments", 0);
        map.put("motes", 0);

        while (true) {
            if (map.get("shards") >= 250 || map.get("motes") >= 250 || map.get("fragments") >= 250){
                break;
            }
            String[] input = scanner.nextLine().toLowerCase().split(" ");
            for (int i = 0; i < input.length - 1; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("motes") || material.equals("fragments") || material.equals("shards")){
                    if (!map.containsKey(material)) {
                        map.put(material, 0);
                    }
                    map.put(material, map.get(material) + quantity);
                    if (map.get("shards") >= 250 || map.get("fragments") >= 250 || map.get("motes") >= 250){
                        break;
                    }
                }else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, 0);
                    }
                    junkMap.put(material, junkMap.get(material) + quantity);
                }
            }
        }
        if (map.get("shards") >= 250){
            map.put("shards", map.get("shards") - 250);
            System.out.println("Shadowmourne obtained!");
        } else if (map.get("fragments") >= 250){
            map.put("fragments", map.get("fragments") - 250);
            System.out.println("Valanyr obtained!");
        } else if (map.get("motes") >= 250){
            map.put("motes", map.get("motes") - 250);
            System.out.println("Dragonwrath obtained!");
        }
        map.entrySet()
                .stream()
                .sorted((a1, a2) -> Integer.compare(a2.getValue(), a1.getValue()))
                .forEach( a-> System.out.println(a.getKey() + ": " + a.getValue()));

        junkMap.entrySet()
                .stream()
                .forEach( a-> System.out.println(a.getKey() + ": " + a.getValue()));
    }
}


