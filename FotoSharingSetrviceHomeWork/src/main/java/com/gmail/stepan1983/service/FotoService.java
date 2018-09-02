package com.gmail.stepan1983.service;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Foto;
import java.util.List;

public interface FotoService {

    Foto save(Foto foto);

    void delete(Foto foto);

    void updateFoto(Foto foto);

    Foto findFotoById(Long id);

    List<Foto> findFotoByClient(Client client);

    List<Client> findAll(Integer page, Integer itemsPerPage,
                         String sortBy, boolean sortDirection);

    long count();

}
