/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.controller;

import br.edu.ifrn.apispringboot.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
    private AtletaRepository atletaRepository;
    
    @GetMapping
    public ResponseEntity<?> listarAtletas(){
        return ResponseEntity.ok(atletaRepository.findAll());
        //return new ResponseEntity(atletaRepository.findAll(), HttpStatus.OK);
    }
}
