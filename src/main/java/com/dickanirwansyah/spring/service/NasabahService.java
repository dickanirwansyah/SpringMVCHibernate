/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.service;

import com.dickanirwansyah.spring.entities.Nasabah;
import java.util.List;

/**
 *
 * @author dickajava
 */
public interface NasabahService {
    
    public Nasabah saveNasabah(Nasabah nasabah);
    
    public Nasabah updateNasabah(Nasabah nasabah);
    
    public Nasabah deleteNasabah(Nasabah nasabah);
    
    public Nasabah findOneNasabah(int id);
    
    public List<Nasabah> findAllNasabah();
}
