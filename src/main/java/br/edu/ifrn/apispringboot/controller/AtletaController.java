/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.controller;

import br.edu.ifrn.apispringboot.model.Atleta;
import br.edu.ifrn.apispringboot.services.AtletaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joaon
 */
@RestController
@RequestMapping("atletas")
public class AtletaController {
    
    @Autowired
    private AtletaService atletaService;
    
    @GetMapping
    public ResponseEntity<?> listarAtletas(){
        return ResponseEntity.ok(atletaService.findAll());        
    }
    
    @PostMapping        
    public ResponseEntity<?> salvarAtleta(@RequestBody @Valid Atleta atleta, @AuthenticationPrincipal UserDetails userDetails) {
        System.out.println(userDetails.getUsername());
        atletaService.save(atleta);
        return new ResponseEntity(HttpStatus.CREATED);        
    }
    
}
