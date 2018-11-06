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
@Table(name = "tb_funcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFuncion.findAll", query = "SELECT t FROM TbFuncion t")
    , @NamedQuery(name = "TbFuncion.findByIdFuncion", query = "SELECT t FROM TbFuncion t WHERE t.idFuncion = :idFuncion")
    , @NamedQuery(name = "TbFuncion.findByFuncion", query = "SELECT t FROM TbFuncion t WHERE t.funcion = :funcion")})
public class TbFuncion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_funcion")
    private Integer idFuncion;
    @Size(max = 2147483647)
    @Column(name = "funcion")
    private String funcion;
    @OneToMany(mappedBy = "idFuncion")
    private List<TbRolesFunciones> tbRolesFuncionesList;

    public TbFuncion() {
    }

    public TbFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public Integer getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(Integer idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @XmlTransient
    public List<TbRolesFunciones> getTbRolesFuncionesList() {
        return tbRolesFuncionesList;
    }

    public void setTbRolesFuncionesList(List<TbRolesFunciones> tbRolesFuncionesList) {
        this.tbRolesFuncionesList = tbRolesFuncionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFuncion != null ? idFuncion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFuncion)) {
            return false;
        }
        TbFuncion other = (TbFuncion) object;
        if ((this.idFuncion == null && other.idFuncion != null) || (this.idFuncion != null && !this.idFuncion.equals(other.idFuncion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbFuncion[ idFuncion=" + idFuncion + " ]";
    }
    
}
