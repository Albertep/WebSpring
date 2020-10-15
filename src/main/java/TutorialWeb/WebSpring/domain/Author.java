package TutorialWeb.WebSpring.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long key;


    private String name;
    private String surname;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books=new HashSet<>();




    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author() {

    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return key == author.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
