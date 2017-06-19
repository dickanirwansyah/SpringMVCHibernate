/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dickanirwansyah.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dickajava
 */
@Controller
public class ControllerHallo {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeters(Model model){
        model.addAttribute("title", "Spring MVC 4");
        model.addAttribute("msg", "Hello world ini dibuat dengan spring mvc 4");
        return "greets";
    }
    
}
