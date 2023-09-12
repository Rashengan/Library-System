package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import Model.Book;


@Repository
public class BookRepository {


	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Book> rowMapper = new RowMapper<Book>() {

		public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
			Book book = new Book();
			book.setBookID(rs.getInt("DookID"));
			book.setBookName(rs.getString("BookName"));
			book.setReleaseDate(rs.getInt("ReleaseDate"));
			book.setPublisher(rs.getString("Publisher"));
			book.setPage(rs.getInt("Page"));
			book.setSummary(rs.getString("Summary"));
			
			return book;
		}
		
	};
	
	public List<Book> findAll(){
		String sql = "select * from Book";
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	public Book findById(int BookID){
		String sql = "select * from Book where BookID = ?";
		return DataAccessUtils.singleResult(jdbcTemplate.query(sql, rowMapper, BookID));
	}

	public void create(Book Book) {
		String sql = "insert into Book(BookName, Publisher) values(?, ?)";
		jdbcTemplate.update(sql, Book.getBookName(), Book.getPublisher());
	}

	public void delete(int BookID) {
		String sql = "delete from Book where BookID = ?";
		jdbcTemplate.update(sql, BookID);
	} 
}