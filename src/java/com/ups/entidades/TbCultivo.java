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
@Table(name = "tb_cultivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCultivo.findAll", query = "SELECT t FROM TbCultivo t")
    , @NamedQuery(name = "TbCultivo.findByIdCultivo", query = "SELECT t FROM TbCultivo t WHERE t.idCultivo = :idCultivo")
    , @NamedQuery(name = "TbCultivo.findByTipoCultivo", query = "SELECT t FROM TbCultivo t WHERE t.tipoCultivo = :tipoCultivo")})
public class TbCultivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cultivo")
    private Integer idCultivo;
    @Size(max = 2147483647)
    @Column(name = "tipo_cultivo")
    private String tipoCultivo;
    @OneToMany(mappedBy = "idCultivo")
    private List<TbProduccionAgricola> tbProduccionAgricolaList;

    public TbCultivo() {
    }

    public TbCultivo(Integer idCultivo) {
        this.idCultivo = idCultivo;
    }

    public Integer getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(Integer idCultivo) {
        this.idCultivo = idCultivo;
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }

    @XmlTransient
    public List<TbProduccionAgricola> getTbProduccionAgricolaList() {
        return tbProduccionAgricolaList;
    }

    public void setTbProduccionAgricolaList(List<TbProduccionAgricola> tbProduccionAgricolaList) {
        this.tbProduccionAgricolaList = tbProduccionAgricolaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCultivo != null ? idCultivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCultivo)) {
            return false;
        }
        TbCultivo other = (TbCultivo) object;
        if ((this.idCultivo == null && other.idCultivo != null) || (this.idCultivo != null && !this.idCultivo.equals(other.idCultivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoCultivo + "";
    }
    
}
