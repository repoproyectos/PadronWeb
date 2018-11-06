/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_roles_funciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbRolesFunciones.findAll", query = "SELECT t FROM TbRolesFunciones t")
    , @NamedQuery(name = "TbRolesFunciones.findByIdRolesFunciones", query = "SELECT t FROM TbRolesFunciones t WHERE t.idRolesFunciones = :idRolesFunciones")
    , @NamedQuery(name = "TbRolesFunciones.findByEstado", query = "SELECT t FROM TbRolesFunciones t WHERE t.estado = :estado")})
public class TbRolesFunciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_roles_funciones")
    private Integer idRolesFunciones;
    @Column(name = "estado")
    private Boolean estado;
    @JoinColumn(name = "id_funcion", referencedColumnName = "id_funcion")
    @ManyToOne
    private TbFuncion idFuncion;
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
    @ManyToOne
    private TbTipoUsuario idTipoUsuario;

    public TbRolesFunciones() {
    }

    public TbRolesFunciones(Integer idRolesFunciones) {
        this.idRolesFunciones = idRolesFunciones;
    }

    public Integer getIdRolesFunciones() {
        return idRolesFunciones;
    }

    public void setIdRolesFunciones(Integer idRolesFunciones) {
        this.idRolesFunciones = idRolesFunciones;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public TbFuncion getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(TbFuncion idFuncion) {
        this.idFuncion = idFuncion;
    }

    public TbTipoUsuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(TbTipoUsuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolesFunciones != null ? idRolesFunciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbRolesFunciones)) {
            return false;
        }
        TbRolesFunciones other = (TbRolesFunciones) object;
        if ((this.idRolesFunciones == null && other.idRolesFunciones != null) || (this.idRolesFunciones != null && !this.idRolesFunciones.equals(other.idRolesFunciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbRolesFunciones[ idRolesFunciones=" + idRolesFunciones + " ]";
    }
    
}
