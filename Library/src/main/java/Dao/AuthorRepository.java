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

import Model.Author;





@Repository
public class AuthorRepository  {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Author> rowMapper = new RowMapper<Author>() {

		public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
			Author auth = new Author();
			auth.setAuthorID(rs.getInt("AuthorsID"));
			auth.setAuthorName(rs.getString("AuthorsName"));
			
			return auth;
		}
	};
	
	public List<Author> findAll(){
		String sql = "select * from Authors";
		return jdbcTemplate.query(sql, rowMapper);
	}
	
	public Author findById(int AuthorsID){
		String sql = "select * from Authors where AuthorsID = ?";
		return DataAccessUtils.singleResult(jdbcTemplate.query(sql, rowMapper, AuthorsID));
	}

	public void create(Author auth) {
		String sql = "insert into Authors(AuthorsName) values(?)";
		jdbcTemplate.update(sql, auth.getAuthorName());
	}

	public void delete(int AuthorsID) {
		String sql = "delete from Authors where AuthorsID = ?";
		jdbcTemplate.update(sql,AuthorsID);
	} 
}
