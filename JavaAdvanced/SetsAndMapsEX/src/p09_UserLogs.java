import java.util.*;

import static java.lang.System.in;

public class p09_UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        String text = scanner.nextLine();

        while (!"end".equals(text)) {

            String[] input = text.split("[= \\s]+");

            String ip = input[1];
            String user = input[5];

            if (!map.containsKey(user)) {
                map.put(user, new LinkedHashMap<String, Integer>());
            }
            if (!map.get(user).containsKey(ip)) {
                map.get(user).put(ip, 0);
            }
            map.get(user).put(ip, map.get(user).get(ip) + 1);
            text = scanner.nextLine();
        }

        for (String s : map.keySet()) {
            System.out.println(s + ": ");
            List<String> list = new ArrayList<>();
            for (String s1 : map.get(s).keySet()) {

                list.add(s1 + " => " + map.get(s).get(s1));
            }
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size()- 1) {
                    System.out.print(list.get(i) + ", ");
                } else {
                    System.out.println(list.get(i) + ".");
                }
            }

        }
    }
}

