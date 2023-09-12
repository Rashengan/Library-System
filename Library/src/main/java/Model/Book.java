package Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
	@Entity
	@Table(name ="Book")
	
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer BookID;
	@Column(name = "Bname")
	public String BookName;
	@Column(name = "ReleaseDate")
	public Integer ReleaseDate;
	@Column
	public String Publisher;
	@Column
	public Integer Page;
	@Column
	public String Summary;
	
	@ManyToMany
    @JoinTable(name = "Book_Auth",
                joinColumns = @JoinColumn(name = "aid"),
                inverseJoinColumns = @JoinColumn(name = "bid"))
	@OrderBy(value = "BookID")
	private Set<Author>author=new HashSet<>();
	
	public Set<Author> getAuthor() {
		return author;
	}
	public void setAuthor(Set<Author> author) {
		this.author = author;
	}
	public Integer getBookID() { return BookID; }
	public void setBookID(Integer BookID) { this.BookID = BookID; }
	
	public String getBookName() { return BookName; }
	public void setBookName(String BookName) { this.BookName = BookName; }
	
	public Integer getReleaseDate() { return ReleaseDate; }
	public void setReleaseDate(Integer ReleaseDate) { this.ReleaseDate = ReleaseDate; }
	
	public String getPublisher() { return Publisher; }
	public void setPublisher(String Publisher) { this.Publisher = Publisher; }
	
	public Integer getPage() { return Page; }
	public void setPage(Integer Page) { this.Page = Page; }
	
	public String getSummary() { return Summary; }
	public void setSummary(String string) { this.Summary = Summary; }
}
