package tp1;

import java.awt.List;

public interface ArticleDAO {
	public List <Article> getAllArticles();
	public int addArticle(Article c);
	public Article findArticleByCode(int numero);

	
	public int addArticle(Article c) {
		connection = getConnected();
		int resultat = 0;
		try {
		   
			
			
			
		stmt.close();
		} catch (SQLException e) {
		System.out.println(" Attention Exception lors de l'excéution de la requête : " +
		e);
		} finally{
			
			releaseConnection();
		}
		return resultat;
		}
	
	// FindArticleByCode
	public Article findArticleByCode(int numero) {
	connection = getConnected();
	Article resultat = null;
	try {

		
	}
	rs.close();
	stmt.close();
	} catch (SQLException e)
	{
	System.out.println(" Attention Exception lors de l'excéution de la requête :
	" + e);
	} finally {
	releaseConnection();
	}
	return resultat;
	}
	



}
