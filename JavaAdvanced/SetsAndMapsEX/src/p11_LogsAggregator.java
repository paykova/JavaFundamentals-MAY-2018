import java.util.*;

import static java.lang.System.in;

public class p11_LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (in);

        //192.168.0.11 peter 33

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, TreeMap<String, Integer>> map = new TreeMap<>();

        for (int i = 0; i <n ; i++) {
            String[] text = scanner.nextLine().split(" ");

            String ip = text[0];
            String name = text[1];
            Integer duration = Integer.parseInt(text[2]);

            if (!map.containsKey(name)){
                map.put(name, new TreeMap<>());
            }
            if(!map.get(name).containsKey(ip)){
                map.get(name).put(ip, 0);
            }
            map.get(name).put(ip, map.get(name).get(ip) + duration);
        }

        for (String s : map.keySet()) {
            System.out.print(s + ": ");
            int sum = map.get(s).values().stream().mapToInt(Integer::intValue).sum();
            System.out.print(sum + " [");
            List<String> ipList = new ArrayList<>();
            for (String s1 : map.get(s).keySet()){
                ipList.add(s1);
            }
            Collections.sort(ipList);
            System.out.print(String.join(", ", ipList));
            System.out.println("]");
        }
    }
}
