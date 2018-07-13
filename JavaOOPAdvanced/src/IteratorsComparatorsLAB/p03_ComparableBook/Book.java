package IteratorsComparatorsLAB.p03_ComparableBook;

import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private Integer year;
    private List<String> authors;


    public Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return this.authors;
    }

    private void setAuthors(String... authors) {
        this.authors = Arrays.asList(authors);
    }

    @Override
    public int compareTo(Book o) {
        if(this.title.compareTo(o.title) == 0){
            return this.year.compareTo(o.year);
        }
        return o.title.compareTo(this.title);
    }
}
