import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleArea_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = br.readLine().split("\\s+");
        String[] line2 = br.readLine().split("\\s+");
        String[] line3 = br.readLine().split("\\s+");

        double ax = Double.parseDouble(line1[0]);
        double ay = Double.parseDouble(line1[1]);

        double bx = Double.parseDouble(line2[0]);
        double by = Double.parseDouble(line2[1]);

        double cx = Double.parseDouble(line3[0]);
        double cy = Double.parseDouble(line3[1]);

        int area = (int) Math.abs (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2;

        System.out.println(area);

    }
}
