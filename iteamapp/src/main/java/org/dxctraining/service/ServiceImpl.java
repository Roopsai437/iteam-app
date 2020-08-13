package org.dxctraining.service;

import org.dxctraining.dao.Dao;
import org.dxctraining.entites.Iteam;
import org.dxctraining.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ServiceImpl implements Service{

    @Autowired
    private Dao dao;

    @Override
    public Iteam findIteamById(int id) {
    	Iteam iteam= dao.findIteamById(id);
        return iteam;
    }


    @Override
    public Iteam update(Iteam iteam) {
        validate(iteam);
        iteam=dao.update(iteam);
        return iteam;
    }

    @Override
    public Iteam save(Iteam iteam) {
        validate(iteam);
        iteam=dao.save(iteam);
        return iteam;
    }

    @Override
    public void remove(int id) {
       dao.remove(id);
    }

    public void validate(Object arg){
        if(arg==null){
            throw new InvalidArgumentException("argument is null");
        }
    }
}
