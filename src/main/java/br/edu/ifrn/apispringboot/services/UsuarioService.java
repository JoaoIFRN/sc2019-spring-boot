/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.services;

import br.edu.ifrn.apispringboot.model.Usuario;
import br.edu.ifrn.apispringboot.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 *
 * @author joaon
 */
@Component
public class UsuarioService implements UserDetailsService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(userName);
        if (usuario == null)
            throw new UsernameNotFoundException("Usuário não existe."); //To change body of generated methods, choose Tools | Templates.        
        //new User
        //return new User(usuario.getEmail(),usuario.getSenha(),
        return null;
    }
    
}
