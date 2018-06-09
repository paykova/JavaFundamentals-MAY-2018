import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;

public class p08_BasicStackOperations {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String[] inputLine = reader.readLine().split(" ");

         int n = Integer.parseInt(inputLine[0]);
         int s = Integer.parseInt(inputLine[1]);
         int x = Integer.parseInt(inputLine[2]);

         int[] numbers = Arrays.stream(reader.readLine().split(" "))
                 .mapToInt(Integer::parseInt).toArray();

        Deque<Integer> stack = new ArrayDeque<>();
        int minEl =0 ;

        for (int i = 0; i <n ; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i <s ; i++) {
            stack.pop();
        }
        if (!stack.isEmpty()){
            if(stack.contains(x)){
                System.out.println("true");
            } else{
                int min = Integer.MAX_VALUE;

                for (int i = 0; i <stack.size() ; i++) {
                    if (stack.peek()< min){
                        min = stack.pop();
                    }
                }
                System.out.println(min);
            }
        }else{
            System.out.println("0");
        }
    }
}
