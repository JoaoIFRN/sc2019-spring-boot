/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.controller;

import br.edu.ifrn.apispringboot.model.Equipe;
import br.edu.ifrn.apispringboot.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("equipes")
public class EquipeController {

    @Autowired
    private EquipeRepository equipeRepository;

    @GetMapping
    public ResponseEntity<?> listar() {
        return ResponseEntity.ok(equipeRepository.findAll());
    }

    @PostMapping    
    public ResponseEntity<?> salvar(@RequestBody Equipe equipe) {
        return new ResponseEntity(equipeRepository.save(equipe), HttpStatus.CREATED);            
    }
}
