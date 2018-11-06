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
@Table(name = "tb_estado_civil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbEstadoCivil.findAll", query = "SELECT t FROM TbEstadoCivil t")
    , @NamedQuery(name = "TbEstadoCivil.findByIdEstadoCivil", query = "SELECT t FROM TbEstadoCivil t WHERE t.idEstadoCivil = :idEstadoCivil")
    , @NamedQuery(name = "TbEstadoCivil.findByTipoEstadoCivil", query = "SELECT t FROM TbEstadoCivil t WHERE t.tipoEstadoCivil = :tipoEstadoCivil")})
public class TbEstadoCivil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado_civil")
    private Integer idEstadoCivil;
    @Size(max = 2147483647)
    @Column(name = "tipo_estado_civil")
    private String tipoEstadoCivil;
    @OneToMany(mappedBy = "idEstadoCivil")
    private List<TbDatosPersonales> tbDatosPersonalesList;

    public TbEstadoCivil() {
    }

    public TbEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public Integer getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(Integer idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getTipoEstadoCivil() {
        return tipoEstadoCivil;
    }

    public void setTipoEstadoCivil(String tipoEstadoCivil) {
        this.tipoEstadoCivil = tipoEstadoCivil;
    }

    @XmlTransient
    public List<TbDatosPersonales> getTbDatosPersonalesList() {
        return tbDatosPersonalesList;
    }

    public void setTbDatosPersonalesList(List<TbDatosPersonales> tbDatosPersonalesList) {
        this.tbDatosPersonalesList = tbDatosPersonalesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoCivil != null ? idEstadoCivil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbEstadoCivil)) {
            return false;
        }
        TbEstadoCivil other = (TbEstadoCivil) object;
        if ((this.idEstadoCivil == null && other.idEstadoCivil != null) || (this.idEstadoCivil != null && !this.idEstadoCivil.equals(other.idEstadoCivil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoEstadoCivil + "";
    }
    
}
