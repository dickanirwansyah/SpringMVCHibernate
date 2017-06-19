/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.controller;


import com.dickanirwansyah.spring.entities.Nasabah;
import com.dickanirwansyah.spring.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author dickajava
 */
@Controller
public class ControllerNasabah {
    
    @Autowired
    private NasabahService nasabahService;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String nasabah(Model model){
        model.addAttribute("title", "Data Nasabah");
        model.addAttribute("msg", "List Nasabah Mandiri");
        model.addAttribute("nasabahlist", nasabahService.findAllNasabah());
        return "nasabah";
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView forminsert(ModelAndView modelAndView, Model model){
        modelAndView.setViewName("formInsert");
        model.addAttribute("title", "Insert nasabah");
        model.addAttribute("msg", "Form Insert");
        return modelAndView;
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@ModelAttribute Nasabah nasabah){
        nasabahService.saveNasabah(nasabah);
        return "redirect:/index";
    }
   
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam(value = "idnasabah")int idnasabah){
        Nasabah nasabah=nasabahService.findOneNasabah(idnasabah);
        nasabahService.deleteNasabah(nasabah);
        return "redirect:/index";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView getupdate(@RequestParam(value = "idnasabah")int idnasabah, 
            ModelAndView modelAndView, Model model){
        Nasabah nasabah=nasabahService.findOneNasabah(idnasabah);
        model.addAttribute("update", nasabah);
        model.addAttribute("title", "Update Nasabah");
        model.addAttribute("msg", "Form Upate Nasabah");
        modelAndView.setViewName("formUpdate");
        return modelAndView;
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute Nasabah nasabah){
        nasabahService.updateNasabah(nasabah);
        return "redirect:/index";
    }
    
}
