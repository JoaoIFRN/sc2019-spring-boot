/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.controller;

import br.edu.ifrn.apispringboot.model.Atleta;
import br.edu.ifrn.apispringboot.repository.AtletaRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    private AtletaRepository atletaRepository;
    
    @GetMapping
    public ResponseEntity<?> listarAtletas(){
        return ResponseEntity.ok(atletaRepository.findAllOrderByNome());        
    }
    
    @PostMapping
    public ResponseEntity<?> salvarAtleta(@RequestBody @Valid Atleta atleta) {
        atletaRepository.save(atleta);
        return new ResponseEntity(HttpStatus.CREATED);        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluirAtleta(@PathVariable("id") Long id){
        if (atletaRepository.findById(id).isPresent()){
            atletaRepository.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);  
        }else{
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> listarAtletaById(@PathVariable("id") Long id){
        return ResponseEntity.ok(atletaRepository.findById(id));
    }
}
