package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.DAO.*;
import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.StorageBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private PublisherDAO publisherDAO;

    @Autowired
    private CategoryDAO categoryDAO;


    @Autowired
    private StorageBooksDAO storageBooksDAO;

    @Override
    @Transactional
    public BookItem addBookItem(BookItem bookItem) {
        return entityManager.merge(bookItem);

    }

    @Override
    @Transactional(readOnly = true)
    public BookItem getById(Long bookId) {
        return bookDAO.getOne(bookId);
    }

    @Override
    public List<BookItem> getByAuthor(String author) {
        return bookDAO.getByAuthor(author);
    }

    @Override
    public List<BookItem> getByCategory(String category) {
        return bookDAO.getByCategory(category);
    }

    @Override
    public List<BookItem> getByPublisher(String publisher) {
        return bookDAO.getByPublisher(publisher);
    }

    @Override
    public BookItem getByBookName(String bookName) {
        return bookDAO.getByBookName(bookName);
    }

    @Override
    @Transactional
    public BookItem updateBookItem(BookItem bookItem) {
       return entityManager.merge(bookItem);
    }

    @Override
    @Transactional
    public void deleteBookItem(BookItem bookItem) {
        BookItem temp=entityManager.merge(bookItem);
        entityManager.remove(temp);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<BookItem> findAll(Pageable pageable) {
        return bookDAO.findAll(pageable);
    }

    @Override
    @Transactional (readOnly = true)
    public List<BookItem> findAll(Integer page, Integer itemsPerPage, String sortBy, boolean sortDirection) {

        Sort sort = new Sort(sortDirection ? Sort.Direction.ASC : Sort.Direction.DESC, sortBy);

        Pageable pageable = PageRequest.of(page, itemsPerPage, sort);

        return bookDAO.findAll(pageable).getContent();
    }

    @Override
    public List<BookItem> findAll() {
        return bookDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return bookDAO.count();
    }

    @Transactional
    public Double getAvgRating(){

        TypedQuery<Double> avgRating=entityManager.createQuery("Select avg(s.rating) from BookItem s",Double.class);

        return avgRating.getSingleResult();
    }
}
