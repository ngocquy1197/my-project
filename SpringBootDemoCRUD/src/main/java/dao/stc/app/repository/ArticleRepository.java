package dao.stc.app.repository;
import org.springframework.data.repository.CrudRepository;
import dao.stc.app.model.*;
public interface ArticleRepository extends CrudRepository<Article, Long> {

}