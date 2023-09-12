package Model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Movement
{
    private Integer MovementID;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate RentalDate;
    public LocalDate ReturnDate;
    public Integer BookID;
    public Integer UserID;
    public Book Book;
    public User User;
    
    public Integer getMovementID() {return MovementID;}
	public void setMovementID(Integer MovementID) {this.MovementID = MovementID;}
	
	public LocalDate getRentalDate(){return RentalDate;}
	public void setRentalDate(LocalDate RentalDate){this.RentalDate = RentalDate;}
	
	public LocalDate getReturnDate(){return ReturnDate;}
	public void setReturnDate(LocalDate ReturnDate){this.ReturnDate = ReturnDate;}
	
	public Integer getBookID(){return BookID;}
	public void setBookID(Integer BookID){this.BookID = BookID;}
	
	public Integer getUserID(){return UserID;}
	public void setUserID(Integer UserID){this.UserID = UserID;}
	
	public Book getBook() {return Book;}
	public void setBook(Book Book) {this.Book = Book;}
	
	public User getUser() {return User;}
	public void setUSer(User User) {this.User = User;}
}