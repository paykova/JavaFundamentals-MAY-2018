package GenericsLAB.p01_jarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();

//        Jar<Pickle> jarOfPickles = new Jar<>();
//
//        jarOfPickles.add(new Pickle(5, 6));
//
//        Jar<People> jarOfPeople = new Jar<>();
//
//        jarOfPeople.add(new People("Ivan", 15));
//        jarOfPeople.add(new People("Metodi", 16));


        System.out.println(jar.remove());

    }
}
