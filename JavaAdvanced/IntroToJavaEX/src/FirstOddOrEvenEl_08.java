import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FirstOddOrEvenEl_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("\\s+");
        String[] commandArg = br.readLine().split("\\s+");
        ArrayList<Integer> list = new ArrayList<Integer>();

        int num = Integer.parseInt(commandArg[1]);
        String numberType = commandArg[2];

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        if (numberType.equals("odd")){
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 != 0){
                    list.add(numbers[i]);
                }
            }
        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0){
                    list.add(numbers[i]);
                }
            }
        }

        if (num > list.size()){
            num = list.size();
            for (int i = 0; i < num; i++) {
                System.out.print(list.get(i) + " ");
            }
        }
        else {
            for (int i = 0; i < num; i++) {
                System.out.print(list.get(i) + " ");
            }

            }
        }

    }

