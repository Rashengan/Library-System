package Service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import Dao.AuthorRepository;
import Dao.BookRepository;
import Model.Author;
import Model.Book;
@Service
@Transactional
public class EstirmeceService {

	
/*	@Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;



    public Author findAuthorById(Long authorid) {
        return authorRepository.findById(authorid).get();
    }

    public List<Author> findAuthorByName(String name) {
        return authorRepository.findByAuthorName(name);
    //    return authorRepository.findByAuthorNameStartingWith(name);
    //    return authorRepository.findByAuthorNameEndingWith(name);
    //    return authorRepository.findByAuthorNameContaining(name);
    //    return authorRepository.findByIdLessThanOrAuthorName(3L, name);
    //    return authorRepository.findByQuery(name);
    }

    public Book findBookById(long bookid) {
        return bookRepository.findById(bookid).get();
    }

    public Page<Book> findBooks(Pageable pageRequest){
        return bookRepository.findAll(pageRequest);
    }

    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }
  */
}