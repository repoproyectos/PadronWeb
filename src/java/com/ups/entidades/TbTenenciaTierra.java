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
@Table(name = "tb_tenencia_tierra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTenenciaTierra.findAll", query = "SELECT t FROM TbTenenciaTierra t")
    , @NamedQuery(name = "TbTenenciaTierra.findByIdTenenciaTierra", query = "SELECT t FROM TbTenenciaTierra t WHERE t.idTenenciaTierra = :idTenenciaTierra")
    , @NamedQuery(name = "TbTenenciaTierra.findByEstadoTierra", query = "SELECT t FROM TbTenenciaTierra t WHERE t.estadoTierra = :estadoTierra")
    , @NamedQuery(name = "TbTenenciaTierra.findByPropietario", query = "SELECT t FROM TbTenenciaTierra t WHERE t.propietario = :propietario")
    , @NamedQuery(name = "TbTenenciaTierra.findByFechaReg", query = "SELECT t FROM TbTenenciaTierra t WHERE t.fechaReg = :fechaReg")})
public class TbTenenciaTierra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tenencia_tierra")
    private Integer idTenenciaTierra;
    @Size(max = 2147483647)
    @Column(name = "estado_tierra")
    private String estadoTierra;
    @Size(max = 2147483647)
    @Column(name = "propietario")
    private String propietario;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_familia", referencedColumnName = "id_familia")
    @ManyToOne
    private TbFamilia idFamilia;
    @JoinColumn(name = "id_lote", referencedColumnName = "id_lote")
    @ManyToOne
    private TbLote idLote;

    public TbTenenciaTierra() {
        this.estadoTierra = "P";
    }

    public TbTenenciaTierra(Integer idTenenciaTierra) {
        this.idTenenciaTierra = idTenenciaTierra;
    }

    public Integer getIdTenenciaTierra() {
        return idTenenciaTierra;
    }

    public void setIdTenenciaTierra(Integer idTenenciaTierra) {
        this.idTenenciaTierra = idTenenciaTierra;
    }

    public String getEstadoTierra() {
        return estadoTierra;
    }

    public void setEstadoTierra(String estadoTierra) {
        this.estadoTierra = estadoTierra;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public TbFamilia getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(TbFamilia idFamilia) {
        this.idFamilia = idFamilia;
    }

    public TbLote getIdLote() {
        return idLote;
    }

    public void setIdLote(TbLote idLote) {
        this.idLote = idLote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTenenciaTierra != null ? idTenenciaTierra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTenenciaTierra)) {
            return false;
        }
        TbTenenciaTierra other = (TbTenenciaTierra) object;
        if ((this.idTenenciaTierra == null && other.idTenenciaTierra != null) || (this.idTenenciaTierra != null && !this.idTenenciaTierra.equals(other.idTenenciaTierra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idLote.getCodigoLote() + "";
    }
    
}
