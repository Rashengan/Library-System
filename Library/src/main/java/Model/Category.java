package Model;

import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	
	
	public Category() {
		HashSet<Book> Book = new HashSet<Book>();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer CategoryID;
	@Column
	public String CategoryName;
	
	public Integer getCategoryID() { return CategoryID; }
	public void setCategoryID(Integer CategoryID) {this.CategoryID = CategoryID;}
	
	public String getCategoryName() {return CategoryName;}
	public void setCategoryName(String CategoryName) {this.CategoryName = CategoryName;}
	
	
}
