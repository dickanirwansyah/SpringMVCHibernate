/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.dao;

import com.dickanirwansyah.spring.entities.Nasabah;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dickajava
 */
@Repository("nasabahDAO")
public class NasabahDAOImpl implements NasabahDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Nasabah saveNasabah(Nasabah nasabah) {
      sessionFactory.getCurrentSession().save(nasabah);
      return nasabah;
    }

    @Override
    public Nasabah updateNasabah(Nasabah nasabah) {
      sessionFactory.getCurrentSession().update(nasabah);
      return nasabah;
    }

    @Override
    public Nasabah deleteNasabah(Nasabah nasabah) {
      sessionFactory.getCurrentSession().delete(nasabah);
      return nasabah;
    }

    @Override
    public Nasabah findOneNasabah(int id) {
      Query query=sessionFactory.getCurrentSession()
              .createQuery("SELECT n FROM Nasabah n WHERE n.idnasabah=:idnasabah");
      query.setParameter("idnasabah", id);
      return (Nasabah) query.uniqueResult();
    }

    @Override
    public List<Nasabah> findAllNasabah() {
      //proses menampilkan semua data nasabah
        return sessionFactory.getCurrentSession()
                .createCriteria(Nasabah.class).list();
    }
    
    
}
