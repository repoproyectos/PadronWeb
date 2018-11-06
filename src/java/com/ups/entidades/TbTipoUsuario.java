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
@Table(name = "tb_tipo_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTipoUsuario.findAll", query = "SELECT t FROM TbTipoUsuario t")
    , @NamedQuery(name = "TbTipoUsuario.findByIdTipoUsuario", query = "SELECT t FROM TbTipoUsuario t WHERE t.idTipoUsuario = :idTipoUsuario")
    , @NamedQuery(name = "TbTipoUsuario.findByTipoUsuario", query = "SELECT t FROM TbTipoUsuario t WHERE t.tipoUsuario = :tipoUsuario")})
public class TbTipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_usuario")
    private Integer idTipoUsuario;
    @Size(max = 2147483647)
    @Column(name = "tipo_usuario")
    private String tipoUsuario;
    @OneToMany(mappedBy = "idTipoUsuario")
    private List<TbUsuario> tbUsuarioList;
    @OneToMany(mappedBy = "idTipoUsuario")
    private List<TbRolesFunciones> tbRolesFuncionesList;

    public TbTipoUsuario() {
    }

    public TbTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @XmlTransient
    public List<TbUsuario> getTbUsuarioList() {
        return tbUsuarioList;
    }

    public void setTbUsuarioList(List<TbUsuario> tbUsuarioList) {
        this.tbUsuarioList = tbUsuarioList;
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
        hash += (idTipoUsuario != null ? idTipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTipoUsuario)) {
            return false;
        }
        TbTipoUsuario other = (TbTipoUsuario) object;
        if ((this.idTipoUsuario == null && other.idTipoUsuario != null) || (this.idTipoUsuario != null && !this.idTipoUsuario.equals(other.idTipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbTipoUsuario[ idTipoUsuario=" + idTipoUsuario + " ]";
    }
    
}
