package com.gmail.stepan1983.DAO;

import com.gmail.stepan1983.model.BookItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO extends JpaRepository<BookItem,Long> {


}
