/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apispringboot.exceptions;

import java.util.Date;

/**
 *
 * @author joaon
 */
public class DetalhesException {
    
    private Date timesTamp;
    private String titulo;
    private String mensagem;
    private int status;

    /**
     * @return the timesTamp
     */
    public Date getTimesTamp() {
        return timesTamp;
    }

    /**
     * @param timesTamp the timesTamp to set
     */
    public void setTimesTamp(Date timesTamp) {
        this.timesTamp = timesTamp;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}
