package com.gmail.stepan1983.dao;

import com.gmail.stepan1983.model.Archive;

import java.util.List;

public interface ArchiveDAO {

    void add(Archive arch);
    void delete(long[] ids);
    List<Archive> list();


}
