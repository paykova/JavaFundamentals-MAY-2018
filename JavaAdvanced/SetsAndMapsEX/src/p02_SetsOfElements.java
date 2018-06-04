import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class p02_SetsOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] setsLength = Arrays.stream(bf.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        LinkedHashSet<String> nSet = new LinkedHashSet<>();
        LinkedHashSet<String> mSet = new LinkedHashSet<>();

        for (int a = 0; a < setsLength[0]; a++) {
            nSet.add(bf.readLine());
        }

        for (int a = 0; a < setsLength[1]; a++) {
            mSet.add(bf.readLine());
        }

        nSet.retainAll(mSet);

        System.out.println(String.join(" ",nSet));
    }
}