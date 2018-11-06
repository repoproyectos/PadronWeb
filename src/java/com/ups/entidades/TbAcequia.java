/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_acequia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAcequia.findAll", query = "SELECT t FROM TbAcequia t")
    , @NamedQuery(name = "TbAcequia.findByIdAcequia", query = "SELECT t FROM TbAcequia t WHERE t.idAcequia = :idAcequia")
    , @NamedQuery(name = "TbAcequia.findByNomAcequia", query = "SELECT t FROM TbAcequia t WHERE t.nomAcequia = :nomAcequia")})
public class TbAcequia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_acequia")
    private Integer idAcequia;
    @Size(max = 2147483647)
    @Column(name = "nom_acequia")
    private String nomAcequia;
    @OneToMany(mappedBy = "idAcequia")
    private List<TbLote> tbLoteList;

    public TbAcequia() {
    }

    public TbAcequia(Integer idAcequia) {
        this.idAcequia = idAcequia;
    }

    public Integer getIdAcequia() {
        return idAcequia;
    }

    public void setIdAcequia(Integer idAcequia) {
        this.idAcequia = idAcequia;
    }

    public String getNomAcequia() {
        return nomAcequia;
    }

    public void setNomAcequia(String nomAcequia) {
        this.nomAcequia = nomAcequia;
    }

    @XmlTransient
    public List<TbLote> getTbLoteList() {
        return tbLoteList;
    }

    public void setTbLoteList(List<TbLote> tbLoteList) {
        this.tbLoteList = tbLoteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcequia != null ? idAcequia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAcequia)) {
            return false;
        }
        TbAcequia other = (TbAcequia) object;
        if ((this.idAcequia == null && other.idAcequia != null) || (this.idAcequia != null && !this.idAcequia.equals(other.idAcequia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomAcequia + "";
    }
    
}
