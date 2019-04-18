package dao.stc.app.service;
import java.util.List;
import dao.stc.app.model.*;
public interface ArticleService {
	public List<Article> getAllArticles();

	public Article getArticleById(long id);

	public void saveOrUpdate(Article article);

	public void deleteArticle(long id);
}
