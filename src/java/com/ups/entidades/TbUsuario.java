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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuario.findAll", query = "SELECT t FROM TbUsuario t")
    , @NamedQuery(name = "TbUsuario.findByIdUsuario", query = "SELECT t FROM TbUsuario t WHERE t.idUsuario = :idUsuario")
    , @NamedQuery(name = "TbUsuario.findByNomUsuario", query = "SELECT t FROM TbUsuario t WHERE t.nomUsuario = :nomUsuario")
    , @NamedQuery(name = "TbUsuario.findByContrasena", query = "SELECT t FROM TbUsuario t WHERE t.contrasena = :contrasena")})
public class TbUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Size(max = 2147483647)
    @Column(name = "nom_usuario")
    private String nomUsuario;
    @Size(max = 2147483647)
    @Column(name = "contrasena")
    private String contrasena;
    @JoinColumn(name = "id_registro_usuario", referencedColumnName = "id_registro_usuario")
    @ManyToOne
    private TbRegistroUsuario idRegistroUsuario;
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
    @ManyToOne
    private TbTipoUsuario idTipoUsuario;
    @OneToMany(mappedBy = "idUsuario")
    private List<TbDatosFicha> tbDatosFichaList;

    public TbUsuario() {
    }

    public TbUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public TbRegistroUsuario getIdRegistroUsuario() {
        return idRegistroUsuario;
    }

    public void setIdRegistroUsuario(TbRegistroUsuario idRegistroUsuario) {
        this.idRegistroUsuario = idRegistroUsuario;
    }

    public TbTipoUsuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(TbTipoUsuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    @XmlTransient
    public List<TbDatosFicha> getTbDatosFichaList() {
        return tbDatosFichaList;
    }

    public void setTbDatosFichaList(List<TbDatosFicha> tbDatosFichaList) {
        this.tbDatosFichaList = tbDatosFichaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuario)) {
            return false;
        }
        TbUsuario other = (TbUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbUsuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
