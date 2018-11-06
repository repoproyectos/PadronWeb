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
@Table(name = "tb_registro_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbRegistroUsuario.findAll", query = "SELECT t FROM TbRegistroUsuario t")
    , @NamedQuery(name = "TbRegistroUsuario.findByIdRegistroUsuario", query = "SELECT t FROM TbRegistroUsuario t WHERE t.idRegistroUsuario = :idRegistroUsuario")
    , @NamedQuery(name = "TbRegistroUsuario.findByApellidoUsuario", query = "SELECT t FROM TbRegistroUsuario t WHERE t.apellidoUsuario = :apellidoUsuario")
    , @NamedQuery(name = "TbRegistroUsuario.findByNombreUsuario", query = "SELECT t FROM TbRegistroUsuario t WHERE t.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "TbRegistroUsuario.findByEMail", query = "SELECT t FROM TbRegistroUsuario t WHERE t.eMail = :eMail")
    , @NamedQuery(name = "TbRegistroUsuario.findByCedulaUsuario", query = "SELECT t FROM TbRegistroUsuario t WHERE t.cedulaUsuario = :cedulaUsuario")})
public class TbRegistroUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_registro_usuario")
    private Integer idRegistroUsuario;
    @Size(max = 2147483647)
    @Column(name = "apellido_usuario")
    private String apellidoUsuario;
    @Size(max = 2147483647)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "e_mail")
    private String eMail;
    @Size(max = 2147483647)
    @Column(name = "cedula_usuario")
    private String cedulaUsuario;
    @OneToMany(mappedBy = "idRegistroUsuario")
    private List<TbUsuario> tbUsuarioList;

    public TbRegistroUsuario() {
    }

    public TbRegistroUsuario(Integer idRegistroUsuario) {
        this.idRegistroUsuario = idRegistroUsuario;
    }

    public Integer getIdRegistroUsuario() {
        return idRegistroUsuario;
    }

    public void setIdRegistroUsuario(Integer idRegistroUsuario) {
        this.idRegistroUsuario = idRegistroUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    @XmlTransient
    public List<TbUsuario> getTbUsuarioList() {
        return tbUsuarioList;
    }

    public void setTbUsuarioList(List<TbUsuario> tbUsuarioList) {
        this.tbUsuarioList = tbUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistroUsuario != null ? idRegistroUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbRegistroUsuario)) {
            return false;
        }
        TbRegistroUsuario other = (TbRegistroUsuario) object;
        if ((this.idRegistroUsuario == null && other.idRegistroUsuario != null) || (this.idRegistroUsuario != null && !this.idRegistroUsuario.equals(other.idRegistroUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbRegistroUsuario[ idRegistroUsuario=" + idRegistroUsuario + " ]";
    }
    
}
