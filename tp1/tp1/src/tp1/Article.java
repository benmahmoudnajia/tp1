package tp1;

public class Article {
String code;
String description;
int prix;
int prixttc;
int qte;
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}
public int getPrixttc() {
	return prixttc;
}
public void setPrixttc(int prixttc) {
	this.prixttc = prixttc;
}
public int getQte() {
	return qte;
}
public void setQte(int qte) {
	this.qte = qte;
}
public Article(String code, String description, int prix, int prixttc, int qte) {
	super();
	this.code = code;
	this.description = description;
	this.prix = prix;
	this.prixttc = prixttc;
	this.qte = qte;
}

}
