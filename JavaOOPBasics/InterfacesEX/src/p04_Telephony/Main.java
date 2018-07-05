package p04_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        String[] phoneNumbers = reader.readLine().split(" ");
        String[] sites = reader.readLine().split(" ");

        Smartphone phone = new Smartphone();


        try{
            for (int i = 0; i < phoneNumbers.length; i++) {
                System.out.println(phone.calling(phoneNumbers[i]));
            }
        }catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        try{
            for (int i = 0; i < sites.length; i++) {
                System.out.println(phone.browsing(sites[i]));
            }
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }


    }
}
