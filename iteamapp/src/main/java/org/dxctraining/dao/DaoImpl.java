package org.dxctraining.dao;

import org.dxctraining.entities.Iteam;


import org.dxctraining.exceptions.IteamNotFoundException;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DaoImpl implements Dao{

    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Iteam findIteamById(int id) {
        Iteam iteam=entityManager.find(Iteam.class,id);
        if(iteam==null){
            throw new IteamNotFoundException("Iteam not found for id="+id);
        }
        return iteam;
    }

    @Override
    public Iteam update(Iteam iteam) {
    	iteam=entityManager.merge(iteam);
        return iteam;
    }

    @Override
    public Iteam save(Iteam iteam) {
        entityManager.persist(iteam);
        return iteam;
    }

    @Override
    public void remove(int id) {
    	Iteam iteam= entityManager.find(Iteam.class,id) ;
     entityManager.remove(iteam);
    }
}
