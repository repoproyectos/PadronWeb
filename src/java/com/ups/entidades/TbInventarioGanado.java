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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_inventario_ganado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbInventarioGanado.findAll", query = "SELECT t FROM TbInventarioGanado t")
    , @NamedQuery(name = "TbInventarioGanado.findByIdInventarioGanado", query = "SELECT t FROM TbInventarioGanado t WHERE t.idInventarioGanado = :idInventarioGanado")
    , @NamedQuery(name = "TbInventarioGanado.findByNumGanado", query = "SELECT t FROM TbInventarioGanado t WHERE t.numGanado = :numGanado")
    , @NamedQuery(name = "TbInventarioGanado.findByFechaReg", query = "SELECT t FROM TbInventarioGanado t WHERE t.fechaReg = :fechaReg")})
public class TbInventarioGanado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_inventario_ganado")
    private Integer idInventarioGanado;
    @Column(name = "num_ganado")
    private Integer numGanado;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_familia", referencedColumnName = "id_familia")
    @ManyToOne
    private TbFamilia idFamilia;
    @JoinColumn(name = "id_ganado", referencedColumnName = "id_ganado")
    @ManyToOne
    private TbGanado idGanado;

    public TbInventarioGanado() {
    }

    public TbInventarioGanado(Integer idInventarioGanado) {
        this.idInventarioGanado = idInventarioGanado;
    }

    public Integer getIdInventarioGanado() {
        return idInventarioGanado;
    }

    public void setIdInventarioGanado(Integer idInventarioGanado) {
        this.idInventarioGanado = idInventarioGanado;
    }

    public Integer getNumGanado() {
        return numGanado;
    }

    public void setNumGanado(Integer numGanado) {
        this.numGanado = numGanado;
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

    public TbGanado getIdGanado() {
        return idGanado;
    }

    public void setIdGanado(TbGanado idGanado) {
        this.idGanado = idGanado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInventarioGanado != null ? idInventarioGanado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbInventarioGanado)) {
            return false;
        }
        TbInventarioGanado other = (TbInventarioGanado) object;
        if ((this.idInventarioGanado == null && other.idInventarioGanado != null) || (this.idInventarioGanado != null && !this.idInventarioGanado.equals(other.idInventarioGanado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbInventarioGanado[ idInventarioGanado=" + idInventarioGanado + " ]";
    }
    
}
