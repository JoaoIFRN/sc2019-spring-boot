/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author joaon
 */
@Controller
public class HomeController {
    
    @GetMapping("/")
    public ModelAndView home(){        
        ModelAndView modelAndView = new ModelAndView("home");
        ArrayList<String> nomes = new ArrayList();
        nomes.add("Renata");
        nomes.add("Cris");
        nomes.add("Roseane");
        nomes.add("Beatriz");
        nomes.add("Denise");        
        modelAndView.addObject("nomes",nomes);
        return modelAndView;
    }
}
