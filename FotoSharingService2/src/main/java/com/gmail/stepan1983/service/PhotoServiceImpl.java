package com.gmail.stepan1983.service;

import com.gmail.stepan1983.DAO.PhotoDAO;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    PhotoDAO photoDao;

    @Override
    @Transactional
    public Photo save(Photo photo) {
        return photoDao.save(photo);
    }

    @Override
    @Transactional
    public void delete(Photo photo) {
        photoDao.delete(photo);
    }

    @Override
    @Transactional
    public void updateFoto(Photo photo) {
        photoDao.save(photo);
    }

    @Override
    @Transactional(readOnly = true)
    public Photo findFotoById(Long id) {

        Photo photo=photoDao.getOne(id);

        Client client=photo.getClient();

        return photo;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Photo> findAll(Integer page, Integer itemsPerPage, String sortBy, boolean sortDirection) {

        Sort sort=new Sort(sortDirection?Sort.Direction.ASC:Sort.Direction.DESC,sortBy);

        Pageable pageable=PageRequest.of(page,itemsPerPage,sort);

        return photoDao.findAll(pageable).getContent();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Photo> findFotoByClient(Client client) {
        return photoDao.findFotoByClient(client);
    }

    @Override
    @Transactional(readOnly = true)
    public long count() {
        return photoDao.count();
    }
}
