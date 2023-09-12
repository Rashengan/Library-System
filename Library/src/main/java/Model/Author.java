package Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.springframework.jdbc.core.PreparedStatementSetter;



@Entity
@Table(name = "Author")

public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer AuthorID;
	@Column
	public String AuthorName;
	
	@ManyToMany(mappedBy = "Author")
	@OrderBy(value = "BookID")
	private Set<Book> book = new HashSet<>();

	
	public Integer getAuthorID() { return AuthorID; }
	public void setAuthorID(Integer AuthorID) {this.AuthorID = AuthorID;}
	
	public String getAuthorName() {return AuthorName;}
	public void setAuthorName(String AuthorName) {this.AuthorName = AuthorName;}
}
