import jdk.nashorn.api.tree.ForInLoopTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p01_EncryptSortPrintArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];
        Character [] vowels = new Character[] {'o', 'O', 'A', 'E', 'U', 'I', 'a', 'e', 'u', 'i'};
        List<Character> listOfVowels = Arrays.asList(vowels);

        int[] numbers = new int[n];

        for (int i = 0; i < n ; i++) {
            int sum = 0;
            String name = br.readLine();
            names[i] = name;
            for (char letter : name.toCharArray()) {
                if (listOfVowels.contains(letter)){
                    sum += letter * name.length();
                } else {
                    sum += letter / name.length();
                }
            }
            numbers[i] = sum;
        }

        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
