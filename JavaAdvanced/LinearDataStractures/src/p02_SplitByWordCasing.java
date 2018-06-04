
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class p02_SplitByWordCasing {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(in));
        String[] text = bf.readLine().trim().split("[.!,/()'\\\\\";:\\[\\]\\s]+");


        List<String> lowerCase = new ArrayList<String>();
        List<String> upperCase = new ArrayList<String>();
        List<String> mixedCase = new ArrayList<String>();

        // Learn programming at SoftUni:Java,PHP,JS,HTML 5,CSS,Web,C#,SQL,databases,AJAX,etc.
        for (int i = 0; i <text.length ; i++) {
            int loCount = 0;
            int upCount = 0;
            int count = 0;

            if (text[i].length() == 0){
                continue;
            }
            for (char letter : text[i].toCharArray()) {
                if (letter >96 && letter < 123){
                    loCount ++;
                } else if (letter > 64 && letter < 91){
                    upCount ++;
                } else {
                    count ++;
                }
            }

            if (loCount == text[i].length()){
                lowerCase.add(text[i]);
            } else if (upCount == text[i].length()){
                upperCase.add(text[i]);
            } else {
                mixedCase.add(text[i]);
            }
        }
        System.out.println("Lower-case: " + String.join(", ", lowerCase));
        System.out.println("Mixed-case: " + String.join(", ", mixedCase));
        System.out.println("Upper-case: " + String.join(", ", upperCase));
    }
}
