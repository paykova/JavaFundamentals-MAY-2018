package p02_BookShop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;

import static java.lang.System.in;

public class Main {

    private static final String CODE_DUPLICATION_EX_MESSAGE = "Code duplication in GoldenEditionBook!";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));


        try {
            String author = reader.readLine();
            String title = reader.readLine();
            double price = Double.parseDouble(reader.readLine());

            String titleToCheck = title;

            Book book = new Book(author, title, price);
            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(author, title, price);

//            Method[] goldenBookDeclaredMethods =
//                    GoldenEditionBook.class.getDeclaredMethods();
//
//            if (goldenBookDeclaredMethods.length > 1) {
//                throw new IllegalClassFormatException(CODE_DUPLICATION_EX_MESSAGE);
//            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());

        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
//        } catch (IllegalClassFormatException e) {
//            e.printStackTrace();
//        }
        }
    }
}
