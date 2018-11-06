/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_datos_ficha")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbDatosFicha.findAll", query = "SELECT t FROM TbDatosFicha t")
    , @NamedQuery(name = "TbDatosFicha.findByIdDatosFicha", query = "SELECT t FROM TbDatosFicha t WHERE t.idDatosFicha = :idDatosFicha")
    , @NamedQuery(name = "TbDatosFicha.findByNombreEncuestador", query = "SELECT t FROM TbDatosFicha t WHERE t.nombreEncuestador = :nombreEncuestador")
    , @NamedQuery(name = "TbDatosFicha.findByFechaEncuesta", query = "SELECT t FROM TbDatosFicha t WHERE t.fechaEncuesta = :fechaEncuesta")})
public class TbDatosFicha implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_ficha")
    private Integer idDatosFicha;
    @Size(max = 2147483647)
    @Column(name = "nombre_encuestador")
    private String nombreEncuestador;
    @Column(name = "fecha_encuesta")
    @Temporal(TemporalType.DATE)
    private Date fechaEncuesta;
    @JoinColumn(name = "id_familia", referencedColumnName = "id_familia")
    @ManyToOne
    private TbFamilia idFamilia;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne
    private TbUsuario idUsuario;

    public TbDatosFicha() {
    }

    public TbDatosFicha(Integer idDatosFicha) {
        this.idDatosFicha = idDatosFicha;
    }

    public Integer getIdDatosFicha() {
        return idDatosFicha;
    }

    public void setIdDatosFicha(Integer idDatosFicha) {
        this.idDatosFicha = idDatosFicha;
    }

    public String getNombreEncuestador() {
        return nombreEncuestador;
    }

    public void setNombreEncuestador(String nombreEncuestador) {
        this.nombreEncuestador = nombreEncuestador;
    }

    public Date getFechaEncuesta() {
        return fechaEncuesta;
    }

    public void setFechaEncuesta(Date fechaEncuesta) {
        this.fechaEncuesta = fechaEncuesta;
    }

    public TbFamilia getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(TbFamilia idFamilia) {
        this.idFamilia = idFamilia;
    }

    public TbUsuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(TbUsuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosFicha != null ? idDatosFicha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDatosFicha)) {
            return false;
        }
        TbDatosFicha other = (TbDatosFicha) object;
        if ((this.idDatosFicha == null && other.idDatosFicha != null) || (this.idDatosFicha != null && !this.idDatosFicha.equals(other.idDatosFicha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbDatosFicha[ idDatosFicha=" + idDatosFicha + " ]";
    }
    
}
