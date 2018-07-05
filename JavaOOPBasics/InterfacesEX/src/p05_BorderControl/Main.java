package p05_BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] input = reader.readLine().split(" ");
        String name = input[0];
        String id;
        List<Society> society =new ArrayList<>();

        while(!input[0].equals("End")){

            try{

                if(input.length == 3){
                    int age = Integer.parseInt(input[1]);
                    id = input[2];
                    Society citizen = new Citizen(name, age, id);
                    society.add(citizen);
                }else{
                    id = input[1];
                    Society robot = new Robot(name, id);
                    society.add(robot);
                }
            }catch(IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
            input = reader.readLine().split(" ");
        }

        String endsWith = reader.readLine();

        for (Society society1 : society) {
            society1.checkId(endsWith);
        }
        System.out.println();

    }
}
