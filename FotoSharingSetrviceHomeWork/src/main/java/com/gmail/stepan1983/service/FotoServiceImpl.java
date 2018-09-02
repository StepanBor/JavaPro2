package com.gmail.stepan1983.service;

import com.gmail.stepan1983.dao.FotoDAO;
import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.Foto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotoServiceImpl implements FotoService {

    @Autowired
    FotoDAO fotoDao;

    @Override
    public Foto save(Foto foto) {
        return fotoDao.save(foto);
    }

    @Override
    public void delete(Foto foto) {
        fotoDao.delete(foto);
    }

    @Override
    public void updateFoto(Foto foto) {
        fotoDao.save(foto);
    }

    @Override
    public Foto findFotoById(Long id) {
        return fotoDao.getOne(id);
    }

    @Override
    public List<Client> findAll(Integer page, Integer itemsPerPage, String sortBy, boolean sortDirection) {
        return null;
    }

    @Override
    public List<Foto> findFotoByClient(Client client) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
