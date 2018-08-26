package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.DAO.*;
import com.gmail.stepan1983.model.BookItem;
import com.gmail.stepan1983.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;

    @Autowired
    private PublisherDAO publisherDAO;

    @Autowired
    private CategoryDAO categoryDAO;

    @Autowired
    private StockDAO stockDAO;

    @Autowired
    private StorageBooksDAO storageBooksDAO;

    @Override
    @Transactional
    public void addBookItem(BookItem bookItem) {
        Stock stock=bookItem.getStorageBooks().getStock();
        publisherDAO.save(bookItem.getPublisher());
        categoryDAO.save(bookItem.getCategory());
        stockDAO.save(stock);
        storageBooksDAO.save(bookItem.getStorageBooks());
        bookDAO.save(bookItem);
    }

    @Override
    @Transactional(readOnly = true)
    public BookItem getById(Long bookId) {
        return bookDAO.getOne(bookId);
    }

    @Override
    @Transactional
    public void updateBookItem(BookItem bookItem) {
        bookDAO.save(bookItem);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<BookItem> findAll(Pageable pageable) {
        return bookDAO.findAll(pageable);
    }

    @Override
    @Transactional (readOnly = true)
    public List<BookItem> findAll() {
        return bookDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return bookDAO.count();
    }
}
