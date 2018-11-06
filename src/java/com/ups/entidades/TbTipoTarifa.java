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
@Table(name = "tb_tipo_tarifa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoTarifa.findAll", query = "SELECT t FROM TbTipoTarifa t")
    , @NamedQuery(name = "TbTipoTarifa.findByIdTipoTarifa", query = "SELECT t FROM TbTipoTarifa t WHERE t.idTipoTarifa = :idTipoTarifa")
    , @NamedQuery(name = "TbTipoTarifa.findByTipoTarifa", query = "SELECT t FROM TbTipoTarifa t WHERE t.tipoTarifa = :tipoTarifa")})
public class TbTipoTarifa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_tarifa")
    private Integer idTipoTarifa;
    @Size(max = 2147483647)
    @Column(name = "tipo_tarifa")
    private String tipoTarifa;
    @OneToMany(mappedBy = "idTipoTarifa")
    private List<TbValorTarifa> tbValorTarifaList;

    public TbTipoTarifa() {
    }

    public TbTipoTarifa(Integer idTipoTarifa) {
        this.idTipoTarifa = idTipoTarifa;
    }

    public Integer getIdTipoTarifa() {
        return idTipoTarifa;
    }

    public void setIdTipoTarifa(Integer idTipoTarifa) {
        this.idTipoTarifa = idTipoTarifa;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    @XmlTransient
    public List<TbValorTarifa> getTbValorTarifaList() {
        return tbValorTarifaList;
    }

    public void setTbValorTarifaList(List<TbValorTarifa> tbValorTarifaList) {
        this.tbValorTarifaList = tbValorTarifaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoTarifa != null ? idTipoTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTipoTarifa)) {
            return false;
        }
        TbTipoTarifa other = (TbTipoTarifa) object;
        if ((this.idTipoTarifa == null && other.idTipoTarifa != null) || (this.idTipoTarifa != null && !this.idTipoTarifa.equals(other.idTipoTarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoTarifa + "";
    }
    
}
