/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.repository;

import br.edu.ifrn.apispringboot.model.Atleta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joaon
 */
@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Long> {

    @Query("from Atleta a order by a.nome")
    List<Atleta> findAllOrderByNome();
}
