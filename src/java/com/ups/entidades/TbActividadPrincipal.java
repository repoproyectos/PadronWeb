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
@Table(name = "tb_actividad_principal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbActividadPrincipal.findAll", query = "SELECT t FROM TbActividadPrincipal t")
    , @NamedQuery(name = "TbActividadPrincipal.findByIdActividadPrincipal", query = "SELECT t FROM TbActividadPrincipal t WHERE t.idActividadPrincipal = :idActividadPrincipal")
    , @NamedQuery(name = "TbActividadPrincipal.findByNomActividadPrincipal", query = "SELECT t FROM TbActividadPrincipal t WHERE t.nomActividadPrincipal = :nomActividadPrincipal")})
public class TbActividadPrincipal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_actividad_principal")
    private Integer idActividadPrincipal;
    @Size(max = 2147483647)
    @Column(name = "nom_actividad_principal")
    private String nomActividadPrincipal;
    @OneToMany(mappedBy = "idActividadPrincipal")
    private List<TbDatosConyugue> tbDatosConyugueList;
    @OneToMany(mappedBy = "idActividadPrincipal")
    private List<TbDatosPersonales> tbDatosPersonalesList;
    @OneToMany(mappedBy = "idActividadPrincipal")
    private List<TbDatosHijo> tbDatosHijoList;

    public TbActividadPrincipal() {
    }

    public TbActividadPrincipal(Integer idActividadPrincipal) {
        this.idActividadPrincipal = idActividadPrincipal;
    }

    public Integer getIdActividadPrincipal() {
        return idActividadPrincipal;
    }

    public void setIdActividadPrincipal(Integer idActividadPrincipal) {
        this.idActividadPrincipal = idActividadPrincipal;
    }

    public String getNomActividadPrincipal() {
        return nomActividadPrincipal;
    }

    public void setNomActividadPrincipal(String nomActividadPrincipal) {
        this.nomActividadPrincipal = nomActividadPrincipal;
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
        hash += (idActividadPrincipal != null ? idActividadPrincipal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbActividadPrincipal)) {
            return false;
        }
        TbActividadPrincipal other = (TbActividadPrincipal) object;
        if ((this.idActividadPrincipal == null && other.idActividadPrincipal != null) || (this.idActividadPrincipal != null && !this.idActividadPrincipal.equals(other.idActividadPrincipal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomActividadPrincipal + "";
    }
    
}
