package p04_CreateAnnotation;

@Subject(categories = "daaddddadadad")
public class Main {
    public static void main(String[] args) {


        Subject subject = (Subject) Main.class.getAnnotation(Subject.class);

        System.out.println(subject.categories());

    }
}
