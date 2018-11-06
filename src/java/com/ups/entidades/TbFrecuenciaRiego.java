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
@Table(name = "tb_frecuencia_riego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFrecuenciaRiego.findAll", query = "SELECT t FROM TbFrecuenciaRiego t")
    , @NamedQuery(name = "TbFrecuenciaRiego.findByIdFrecuenciaRiego", query = "SELECT t FROM TbFrecuenciaRiego t WHERE t.idFrecuenciaRiego = :idFrecuenciaRiego")
    , @NamedQuery(name = "TbFrecuenciaRiego.findByTipoFrecuencia", query = "SELECT t FROM TbFrecuenciaRiego t WHERE t.tipoFrecuencia = :tipoFrecuencia")})
public class TbFrecuenciaRiego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_frecuencia_riego")
    private Integer idFrecuenciaRiego;
    @Size(max = 2147483647)
    @Column(name = "tipo_frecuencia")
    private String tipoFrecuencia;
    @OneToMany(mappedBy = "idFrecuenciaRiego")
    private List<TbTurnoRiego> tbTurnoRiegoList;

    public TbFrecuenciaRiego() {
    }

    public TbFrecuenciaRiego(Integer idFrecuenciaRiego) {
        this.idFrecuenciaRiego = idFrecuenciaRiego;
    }

    public Integer getIdFrecuenciaRiego() {
        return idFrecuenciaRiego;
    }

    public void setIdFrecuenciaRiego(Integer idFrecuenciaRiego) {
        this.idFrecuenciaRiego = idFrecuenciaRiego;
    }

    public String getTipoFrecuencia() {
        return tipoFrecuencia;
    }

    public void setTipoFrecuencia(String tipoFrecuencia) {
        this.tipoFrecuencia = tipoFrecuencia;
    }

    @XmlTransient
    public List<TbTurnoRiego> getTbTurnoRiegoList() {
        return tbTurnoRiegoList;
    }

    public void setTbTurnoRiegoList(List<TbTurnoRiego> tbTurnoRiegoList) {
        this.tbTurnoRiegoList = tbTurnoRiegoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFrecuenciaRiego != null ? idFrecuenciaRiego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFrecuenciaRiego)) {
            return false;
        }
        TbFrecuenciaRiego other = (TbFrecuenciaRiego) object;
        if ((this.idFrecuenciaRiego == null && other.idFrecuenciaRiego != null) || (this.idFrecuenciaRiego != null && !this.idFrecuenciaRiego.equals(other.idFrecuenciaRiego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoFrecuencia + "";
    }
    
}
