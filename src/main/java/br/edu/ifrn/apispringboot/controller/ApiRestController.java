/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.controller;

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
@RequestMapping("api")
public class ApiRestController {

    @GetMapping("/")
    public ResponseEntity<?> api(){
        return new ResponseEntity("Teste", HttpStatus.OK);
    }
    
}
