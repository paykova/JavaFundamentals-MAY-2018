package p03_WildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Animal> animals = new LinkedList<>();

        String[] line = reader.readLine().split(" ");

        while (!"End".equals(line[0])) {
            String type = line[0];
            String name = line[1];
            double weight = Double.parseDouble(line[2]);
            String livingRegion = line[3];

            Food food = null;

            String[] input = reader.readLine().split(" ");
            String foodType = input[0];
            int quantity = Integer.parseInt(input[1]);

            if (foodType.equals("p03_WildFarm.Vegetable")) {
                food = new Vegetable(quantity);
            } else if (foodType.equals("p03_WildFarm.Meat")) {
                food = new Meat(quantity);
            }

            switch (type) {

                case "p03_WildFarm.Cat":
                    try {
                        String breed = line[4];
                        Cat cat = new Cat(name, weight, livingRegion, breed);
                        cat.makeSound();
                        cat.eat(food);
                        animals.add(cat);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;

                case "p03_WildFarm.Mouse":
                    try {
                        Mouse mouse = new Mouse(name, weight, livingRegion);
                        animals.add(mouse);
                        mouse.makeSound();
                        mouse.eat(food);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;

                case "p03_WildFarm.Tiger":
                    try {
                        Tiger tiger = new Tiger(name, weight, livingRegion);
                        animals.add(tiger);
                        tiger.makeSound();
                        tiger.eat(food);

                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "p03_WildFarm.Zebra":
                    try {
                        Zebra zebra = new Zebra(name, weight, livingRegion);
                        animals.add(zebra);
                        zebra.makeSound();
                        zebra.eat(food);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
            }
            line = reader.readLine().split(" ");
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
