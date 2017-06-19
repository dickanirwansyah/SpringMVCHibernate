/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.service;

import com.dickanirwansyah.spring.dao.NasabahDAO;
import com.dickanirwansyah.spring.entities.Nasabah;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dickajava
 */
@Service
@Transactional
public class NasabahServiceImpl implements NasabahService{

    @Autowired
    private NasabahDAO nasabahDAO;
    
    @Override
    public Nasabah saveNasabah(Nasabah nasabah) {
     return nasabahDAO.saveNasabah(nasabah);
    }

    @Override
    public Nasabah updateNasabah(Nasabah nasabah) {
     return nasabahDAO.updateNasabah(nasabah);
    }

    @Override
    public Nasabah deleteNasabah(Nasabah nasabah) {
      return nasabahDAO.deleteNasabah(nasabah);
    }

    @Override
    public Nasabah findOneNasabah(int id) {
      return nasabahDAO.findOneNasabah(id);
    }

    @Override
    public List<Nasabah> findAllNasabah() {
      return nasabahDAO.findAllNasabah();
    }
    
}
