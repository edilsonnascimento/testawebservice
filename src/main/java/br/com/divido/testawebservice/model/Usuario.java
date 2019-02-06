package br.com.divido.testawebservice.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author edilson
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nome;
    private String documentoNacional;
    private String endereco;
    private String telefone;
    private String email;
    private String contatoPrincipal;
    private String cargoContato;
    private String usuarioAuvo;
    private String grupos;
    private String segmento;
    private String observacao;
    private String latitude;
    private String longitutde;
    private String status;
    private String anotacao;
    private String equipesResponsaveis;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContatoPrincipal() {
        return contatoPrincipal;
    }

    public void setContatoPrincipal(String contatoPrincipal) {
        this.contatoPrincipal = contatoPrincipal;
    }

    public String getCargoContato() {
        return cargoContato;
    }

    public void setCargoContato(String cargoContato) {
        this.cargoContato = cargoContato;
    }

    public String getUsuarioAuvo() {
        return usuarioAuvo;
    }

    public void setUsuarioAuvo(String usuarioAuvo) {
        this.usuarioAuvo = usuarioAuvo;
    }

    public String getGrupos() {
        return grupos;
    }

    public void setGrupos(String grupos) {
        this.grupos = grupos;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitutde() {
        return longitutde;
    }

    public void setLongitutde(String longitutde) {
        this.longitutde = longitutde;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    public String getEquipesResponsaveis() {
        return equipesResponsaveis;
    }

    public void setEquipesResponsaveis(String equipesResponsaveis) {
        this.equipesResponsaveis = equipesResponsaveis;
    }

}
