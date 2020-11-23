package Model;

import java.io.Serializable;

public class DTO implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nameBook;
private String authorBook;
private String categoryBook;
private int idBook;


public DTO() {
	
}
public DTO(String namString, String authorbook, String categoString, int idBook) {
	this.authorBook= authorbook;
	this.nameBook = namString;
	this.categoryBook = categoString;
	this.idBook=idBook;
}
public String getNameBook() {
	return nameBook;
}
public void setNameBook(String nameBook) {
	this.nameBook = nameBook;
}
public String getAuthorBook() {
	return authorBook;
}
public void setAuthorBook(String authorBook) {
	this.authorBook = authorBook;
}
public String getCategoryBook() {
	return categoryBook;
}
public void setCategoryBook(String categoryBook) {
	this.categoryBook = categoryBook;
}
public int getIdBook() {
	return idBook;
}
public void setIdBook(int idBook) {
	this.idBook = idBook;
}
@Override
public String toString() {
	return "DTO [nameBook=" + nameBook + ", authorBook=" + authorBook + ", categoryBook=" + categoryBook + ", idBook="
			+ idBook + "]";
}

}
