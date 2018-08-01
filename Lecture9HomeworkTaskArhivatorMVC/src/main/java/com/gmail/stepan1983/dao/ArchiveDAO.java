package com.gmail.stepan1983.dao;

import com.gmail.stepan1983.model.Archive;

import java.io.File;
import java.util.List;

public interface ArchiveDAO {

    void add(Archive arch);
    void delete(Long[] ids);
    List<Archive> list();
    File getFileArch(long id);


}
