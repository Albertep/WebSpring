package TutorialWeb.WebSpring.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String nombre;
    private String direction1;
    private String city;
    private String state;
    private String cp;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<Book> books= new HashSet<>();

    public Publisher(String nombre, String direction1, String city, String state, String cp) {
        this.nombre=nombre;
        this.direction1 = direction1;
        this.city = city;
        this.state = state;
        this.cp = cp;
    }

    public Publisher() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirection1() {
        return direction1;
    }

    public void setDirection1(String direction1) {
        this.direction1 = direction1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direction1='" + direction1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;
        Publisher publisher = (Publisher) o;
        return id == publisher.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
