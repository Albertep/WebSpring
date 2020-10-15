package TutorialWeb.WebSpring.bootstrap;

import TutorialWeb.WebSpring.Repositories.AuthorRepository;
import TutorialWeb.WebSpring.Repositories.BookRepository;
import TutorialWeb.WebSpring.Repositories.PublisherRepository;
import TutorialWeb.WebSpring.domain.Author;
import TutorialWeb.WebSpring.domain.Book;
import TutorialWeb.WebSpring.domain.Publisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initialize implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public Initialize(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) {

        Author alberte= new Author("Alberte","Pazos");
        Book pilares=new Book("Los  pilares de la tierra","123456789");
        Publisher kevin= new Publisher("kevin","callefalsa123","San Francisco","California","123456");


        bookRepository.save(pilares);
        publisherRepository.save(kevin);

        pilares.setPublisher(kevin);





        alberte.getBooks().add(pilares);
        pilares.getAuthors().add(alberte);
        kevin.getBooks().add(pilares);

        authorRepository.save(alberte);
        bookRepository.save(pilares);


        Author eire= new Author("Eire","Pazos");
        Book diente= new Book("Salud en los dientes de los niños","2314513145");
        Publisher noticiero= new Publisher("El noticiero", "calle de las noticias","ciudad noticias","Super Noticias","1234");
        authorRepository.save(eire);
        bookRepository.save(diente);
        publisherRepository.save(noticiero);

        diente.setPublisher(kevin);
        eire.getBooks().add(diente);
        diente.getAuthors().add(eire);
        kevin.getBooks().add(diente);

        authorRepository.save(eire);
        bookRepository.save(diente);






        System.out.println("Started with Spring, Number of books "+ bookRepository.count());
        System.out.println("Número de publicaciones: "+ publisherRepository.count());


    }
}
