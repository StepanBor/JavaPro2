package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.model.BookItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

   BookItem addBookItem(BookItem bookItem);

    BookItem getById(Long bookId);

    void updateBookItem(BookItem bookItem);

    Page<BookItem> findAll(Pageable pageable);

    List<BookItem> findAll(Integer page, Integer itemsPerPage, String sortBy, boolean sortDirection);

    List<BookItem> findAll();

    long count();
}
