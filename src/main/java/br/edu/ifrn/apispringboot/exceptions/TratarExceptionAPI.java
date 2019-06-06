/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.exceptions;

import java.util.Date;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author joaon
 */
@ControllerAdvice
public class TratarExceptionAPI extends ResponseEntityExceptionHandler{
    
    @Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        DetalhesException detalhesException = new DetalhesException();
        detalhesException.setTimesTamp(new Date());
        detalhesException.setTitulo("Erro em campos do objeto");
        detalhesException.setMensagem(ex.getMessage());
        detalhesException.setStatus(HttpStatus.CONFLICT.value());
        return new ResponseEntity(detalhesException,HttpStatus.CONFLICT);
    }
    
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        DetalhesException detalhesException = new DetalhesException();
        detalhesException.setTimesTamp(new Date());
        detalhesException.setTitulo("Ausência de objeto");
        detalhesException.setMensagem(ex.getMessage());
        detalhesException.setStatus(HttpStatus.CONFLICT.value());
        return new ResponseEntity(detalhesException,HttpStatus.CONFLICT);
    }
}
