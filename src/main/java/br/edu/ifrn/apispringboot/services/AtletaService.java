/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.services;

import br.edu.ifrn.apispringboot.model.Atleta;
import br.edu.ifrn.apispringboot.repository.AtletaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

/**
 *
 * @author joaon
 */
@Service
public class AtletaService {
    
    @Autowired
    private AtletaRepository atletaRepository;
    
    public List<Atleta> findAll(){
        return atletaRepository.findAll();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Atleta save(Atleta atleta){
        return atletaRepository.save(atleta);
    }
}
