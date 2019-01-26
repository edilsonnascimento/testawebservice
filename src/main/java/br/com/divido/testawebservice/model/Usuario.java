/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.divido.testawebservice.model;

/**
 *
 * @author edilson
 */
public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String documentoNacional;

    public Usuario() {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumentoNacional() {
        return documentoNacional;
    }

    public void setDocumentoNacional(String documentoNacional) {
        this.documentoNacional = documentoNacional;
    }

}
