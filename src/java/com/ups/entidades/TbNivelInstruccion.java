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
@Table(name = "tb_nivel_instruccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbNivelInstruccion.findAll", query = "SELECT t FROM TbNivelInstruccion t")
    , @NamedQuery(name = "TbNivelInstruccion.findByIdNivelInstruccion", query = "SELECT t FROM TbNivelInstruccion t WHERE t.idNivelInstruccion = :idNivelInstruccion")
    , @NamedQuery(name = "TbNivelInstruccion.findByTipoInstruccion", query = "SELECT t FROM TbNivelInstruccion t WHERE t.tipoInstruccion = :tipoInstruccion")})
public class TbNivelInstruccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nivel_instruccion")
    private Integer idNivelInstruccion;
    @Size(max = 2147483647)
    @Column(name = "tipo_instruccion")
    private String tipoInstruccion;
    @OneToMany(mappedBy = "idNivelInstruccion")
    private List<TbDatosConyugue> tbDatosConyugueList;
    @OneToMany(mappedBy = "idNivelInstruccion")
    private List<TbDatosPersonales> tbDatosPersonalesList;
    @OneToMany(mappedBy = "idNivelInstruccion")
    private List<TbDatosHijo> tbDatosHijoList;

    public TbNivelInstruccion() {
    }

    public TbNivelInstruccion(Integer idNivelInstruccion) {
        this.idNivelInstruccion = idNivelInstruccion;
    }

    public Integer getIdNivelInstruccion() {
        return idNivelInstruccion;
    }

    public void setIdNivelInstruccion(Integer idNivelInstruccion) {
        this.idNivelInstruccion = idNivelInstruccion;
    }

    public String getTipoInstruccion() {
        return tipoInstruccion;
    }

    public void setTipoInstruccion(String tipoInstruccion) {
        this.tipoInstruccion = tipoInstruccion;
    }

    @XmlTransient
    public List<TbDatosConyugue> getTbDatosConyugueList() {
        return tbDatosConyugueList;
    }

    public void setTbDatosConyugueList(List<TbDatosConyugue> tbDatosConyugueList) {
        this.tbDatosConyugueList = tbDatosConyugueList;
    }

    @XmlTransient
    public List<TbDatosPersonales> getTbDatosPersonalesList() {
        return tbDatosPersonalesList;
    }

    public void setTbDatosPersonalesList(List<TbDatosPersonales> tbDatosPersonalesList) {
        this.tbDatosPersonalesList = tbDatosPersonalesList;
    }

    @XmlTransient
    public List<TbDatosHijo> getTbDatosHijoList() {
        return tbDatosHijoList;
    }

    public void setTbDatosHijoList(List<TbDatosHijo> tbDatosHijoList) {
        this.tbDatosHijoList = tbDatosHijoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivelInstruccion != null ? idNivelInstruccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbNivelInstruccion)) {
            return false;
        }
        TbNivelInstruccion other = (TbNivelInstruccion) object;
        if ((this.idNivelInstruccion == null && other.idNivelInstruccion != null) || (this.idNivelInstruccion != null && !this.idNivelInstruccion.equals(other.idNivelInstruccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoInstruccion + "";
    }
    
}
