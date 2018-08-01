package com.gmail.stepan1983.dao;

import com.gmail.stepan1983.model.Archive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.io.File;
import java.util.List;

@Service
public class ServiceArch {

    @Autowired
    ArchiveDAO archDAO;

    @Transactional
    public void addArch(Archive arch){
        archDAO.add(arch);
    }

    @Transactional
    public void remuveArch(Long[] ids){
        archDAO.delete(ids);
    }

    @Transactional
    public List<Archive> getArchList() {
        return archDAO.list();
    }

    @Transactional
    public File getArch(long id) {
        return archDAO.getFileArch(id);
    }


}
