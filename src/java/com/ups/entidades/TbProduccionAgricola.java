/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "tb_produccion_agricola")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProduccionAgricola.findAll", query = "SELECT t FROM TbProduccionAgricola t")
    , @NamedQuery(name = "TbProduccionAgricola.findByIdProduccionAgricola", query = "SELECT t FROM TbProduccionAgricola t WHERE t.idProduccionAgricola = :idProduccionAgricola")
    , @NamedQuery(name = "TbProduccionAgricola.findBySuperficieCultivo", query = "SELECT t FROM TbProduccionAgricola t WHERE t.superficieCultivo = :superficieCultivo")
    , @NamedQuery(name = "TbProduccionAgricola.findByFechaReg", query = "SELECT t FROM TbProduccionAgricola t WHERE t.fechaReg = :fechaReg")})
public class TbProduccionAgricola implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produccion_agricola")
    private Integer idProduccionAgricola;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "superficie_cultivo")
    private BigDecimal superficieCultivo;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_cultivo", referencedColumnName = "id_cultivo")
    @ManyToOne
    private TbCultivo idCultivo;
    @JoinColumn(name = "id_lote", referencedColumnName = "id_lote")
    @ManyToOne
    public TbLote idLote;

    public TbProduccionAgricola() {
    }

    public TbProduccionAgricola(Integer idProduccionAgricola) {
        this.idProduccionAgricola = idProduccionAgricola;
    }

    public Integer getIdProduccionAgricola() {
        return idProduccionAgricola;
    }

    public void setIdProduccionAgricola(Integer idProduccionAgricola) {
        this.idProduccionAgricola = idProduccionAgricola;
    }

    public BigDecimal getSuperficieCultivo() {
        return superficieCultivo;
    }

    public void setSuperficieCultivo(BigDecimal superficieCultivo) {
        this.superficieCultivo = superficieCultivo;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public TbCultivo getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(TbCultivo idCultivo) {
        this.idCultivo = idCultivo;
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
        hash += (idProduccionAgricola != null ? idProduccionAgricola.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduccionAgricola)) {
            return false;
        }
        TbProduccionAgricola other = (TbProduccionAgricola) object;
        if ((this.idProduccionAgricola == null && other.idProduccionAgricola != null) || (this.idProduccionAgricola != null && !this.idProduccionAgricola.equals(other.idProduccionAgricola))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbProduccionAgricola[ idProduccionAgricola=" + idProduccionAgricola + " ]";
    }
    
}
