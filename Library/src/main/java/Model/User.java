package Model;

import java.util.HashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "User")

public class User {
	public User()
	{
		HashSet<Movement> Movement = new HashSet<Movement>();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer UserID;
	@NotBlank
	@Column(name = "Fname")
	public String FirstName;
	@NotBlank
	@Column(name = "Lname")
	public String LastName;
	@NotBlank
	@Column(name = "Email")
	public String Email;
	@NotBlank
	@Column(name = "Uname")
	public String UserName;
	@NotBlank
	@Column(name = "Password")
	public String Password;
	@NotBlank
	@Column(name = "Phone")
	public String Phone;
	
	  public Integer getUserID() { return UserID; }
	  public void setUserID(Integer UserID) { this.UserID = UserID; }
	  
	  public String getFirstName() { return FirstName; }
	  public void setFirstName(String FirstName) {this.FirstName = FirstName; }
	  
	  public String getLastName() { return LastName; }
	  public void setLastName(String LastName) {this.LastName = LastName; }
	  
	  public String getEmail() { return Email; }
	  public void setEmail(String Email) {this.Email = Email; }
	  
	  public String getUserName() { return UserName; }
	  public void setFUserName(String UserName) {this.UserName = UserName; }
	  
	  public String getPassword() { return Password; }
	  public void setPassword(String Password) {this.Password = Password; }
	  
	  public String getPhone() { return Phone; }
	  public void setPhone(String Phone) {this.Phone = Phone; }
	  
}
