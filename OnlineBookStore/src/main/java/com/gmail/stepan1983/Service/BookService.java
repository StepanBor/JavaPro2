package com.gmail.stepan1983.Service;

import com.gmail.stepan1983.DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;



}
