package dev.patika.Library.business.abstracts;
import org.springframework.data.domain.Page;
import dev.patika.Library.entities.Author;


public interface IAuthorService {
    Author save(Author author);
    Author get(Long id);
    Page<Author> cursor(int page, int pageSize);
    Author update(Author author);
    boolean delete(Long id);
}
