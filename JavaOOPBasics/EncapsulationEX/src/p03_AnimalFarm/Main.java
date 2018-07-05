package p03_AnimalFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         String name = reader.readLine();
         int age = Integer.parseInt(reader.readLine());

         Chicken chicken = null;
         try {
             chicken = new Chicken(name, age);
             System.out.println(chicken);
         }catch (IllegalArgumentException iea){
             System.out.println(iea.getMessage());
         }
    }
}