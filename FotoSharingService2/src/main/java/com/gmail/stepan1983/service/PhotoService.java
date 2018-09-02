package com.gmail.stepan1983.service;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Photo;

import java.util.List;

public interface PhotoService {

    Photo save(Photo photo);

    void delete(Photo photo);

    void updateFoto(Photo photo);

    Photo findFotoById(Long id);

    List<Photo> findFotoByClient(Client client);

    List<Photo> findAll(Integer page, Integer itemsPerPage,
                         String sortBy, boolean sortDirection);

    long count();

}
