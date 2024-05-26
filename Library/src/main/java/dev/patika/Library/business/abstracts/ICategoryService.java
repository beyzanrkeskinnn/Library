package dev.patika.Library.business.abstracts;
import dev.patika.Library.dto.response.category.CategoryResultResponse;
import dev.patika.Library.entities.Category;
import org.springframework.data.domain.Page;
public interface ICategoryService {

    Category save(Category category);

    Category get(Long id);

    Page<Category> cursor(int page, int pageSize);

    Category update(Category category);

    CategoryResultResponse delete(Long id);
}
