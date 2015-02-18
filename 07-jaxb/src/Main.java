import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by jnt on 18.02.15.
 */
public class Main {
    public static void main(String[] args) throws JAXBException {

        // SCJP Buch
        final Book scjpBook = new Book();
        scjpBook.setTitle("SCJP Sun Certified Programmer for Java 6 Study Guide");
        scjpBook.getAuthors().add("Katherine Sierra");
        scjpBook.getAuthors().add("Bert Bates");
        scjpBook.setPublisher("Mcgraw-Hill");
        scjpBook.setIsbn("978-0071591065");
        scjpBook.setIdentifier(123);

        // Java Insel
        final Book javaInselBook = new Book();
        javaInselBook.setTitle("Java ist auch eine Insel: Das umfassende Handbuch");
        javaInselBook.getAuthors().add("Christian Ullenboom");
        javaInselBook.setPublisher("Galileo Computing");
        javaInselBook.setIsbn("978-3836218023");
        javaInselBook.setIdentifier(777);

        BookShelf shelf = new BookShelf();
        shelf.getBooks().add(scjpBook);
        shelf.getBooks().add(javaInselBook);

        final JAXBContext context = JAXBContext.newInstance(BookShelf.class);

        final Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(shelf, new File("bookshelf.xml"));

        final Unmarshaller unmarshaller = context.createUnmarshaller();
        shelf = (BookShelf) unmarshaller.unmarshal(new File("bookshelf.xml"));

        for(Book book : shelf.getBooks()) {
            System.out.format("%s, %s, %s, %s, %s\n", book.getTitle(), book.getAuthors(), book.getPublisher(), book.getIsbn(), book.getIdentifier());
        }



    }
}
