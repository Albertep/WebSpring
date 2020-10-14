package TutorialWeb.WebSpring.bootstrap;

import TutorialWeb.WebSpring.Repositories.AuthorRepository;
import TutorialWeb.WebSpring.Repositories.BookRepository;
import TutorialWeb.WebSpring.domain.Author;
import TutorialWeb.WebSpring.domain.Book;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Inicialice implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public Inicialice(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Author alberte= new Author("Alberte","Pazos");
        Book pilares=new Book("Los pilares de la tierra","123456789");


        alberte.getBooks().add(pilares);
        pilares.getAuthors().add(alberte);


        authorRepository.save(alberte);
        bookRepository.save(pilares);

        Author eire= new Author("Eire","Pazos");
        Book diente= new Book("Salud en los dientes de los niños","2314513145");

        eire.getBooks().add(diente);
        diente.getAuthors().add(eire);

        System.out.println("Started with Spring, Number of books"+ bookRepository.count());
        System.out.println("Started with Spring, Numero de libros"+ eire.getBooks()+alberte.getBooks());


    }
}
