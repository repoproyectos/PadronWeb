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
@Table(name = "tb_tipo_aspersor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoAspersor.findAll", query = "SELECT t FROM TbTipoAspersor t")
    , @NamedQuery(name = "TbTipoAspersor.findByIdTipoAspersor", query = "SELECT t FROM TbTipoAspersor t WHERE t.idTipoAspersor = :idTipoAspersor")
    , @NamedQuery(name = "TbTipoAspersor.findByTipoAspersor", query = "SELECT t FROM TbTipoAspersor t WHERE t.tipoAspersor = :tipoAspersor")})
public class TbTipoAspersor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_aspersor")
    private Integer idTipoAspersor;
    @Size(max = 2147483647)
    @Column(name = "tipo_aspersor")
    private String tipoAspersor;
    @OneToMany(mappedBy = "idTipoAspersor")
    private List<TbPorcentajeRiego> tbPorcentajeRiegoList;

    public TbTipoAspersor() {
    }

    public TbTipoAspersor(Integer idTipoAspersor) {
        this.idTipoAspersor = idTipoAspersor;
    }

    public Integer getIdTipoAspersor() {
        return idTipoAspersor;
    }

    public void setIdTipoAspersor(Integer idTipoAspersor) {
        this.idTipoAspersor = idTipoAspersor;
    }

    public String getTipoAspersor() {
        return tipoAspersor;
    }

    public void setTipoAspersor(String tipoAspersor) {
        this.tipoAspersor = tipoAspersor;
    }

    @XmlTransient
    public List<TbPorcentajeRiego> getTbPorcentajeRiegoList() {
        return tbPorcentajeRiegoList;
    }

    public void setTbPorcentajeRiegoList(List<TbPorcentajeRiego> tbPorcentajeRiegoList) {
        this.tbPorcentajeRiegoList = tbPorcentajeRiegoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoAspersor != null ? idTipoAspersor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTipoAspersor)) {
            return false;
        }
        TbTipoAspersor other = (TbTipoAspersor) object;
        if ((this.idTipoAspersor == null && other.idTipoAspersor != null) || (this.idTipoAspersor != null && !this.idTipoAspersor.equals(other.idTipoAspersor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoAspersor + "";
    }
    
}
