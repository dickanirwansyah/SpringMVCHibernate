/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author dickajava
 */

@Entity
@Table(name = "nasabah", 
        catalog = "crud_banking")
public class Nasabah implements Serializable{
    
    private int idnasabah;
    private String nama;
    private String alamat;
    private String notelp;
    
    public Nasabah(){
        
    }
    
    public Nasabah(String nama, String alamat, String notelp){
        this.nama=nama;
        this.alamat=alamat;
        this.notelp=notelp;
    }
    
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idnasabah", nullable = false, unique = true)
    public int getIdnasabah(){
        return this.idnasabah=idnasabah;
    }
    
    public void setIdnasabah(int idnasabah){
        this.idnasabah=idnasabah;
    }
    
    @Column(name = "nama", nullable = false)
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    @Column(name = "alamat", nullable = false)
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    @Column(name = "notelp", nullable = false)
    public String getNotelp(){
        return this.notelp=notelp;
    }
    
    public void setNotelp(String notelp){
        this.notelp=notelp;
    }
}
