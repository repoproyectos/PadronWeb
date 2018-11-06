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
@Table(name = "tb_produccion_leche")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProduccionLeche.findAll", query = "SELECT t FROM TbProduccionLeche t")
    , @NamedQuery(name = "TbProduccionLeche.findByIdProduccionLeche", query = "SELECT t FROM TbProduccionLeche t WHERE t.idProduccionLeche = :idProduccionLeche")
    , @NamedQuery(name = "TbProduccionLeche.findByProduccionDiariaLeche", query = "SELECT t FROM TbProduccionLeche t WHERE t.produccionDiariaLeche = :produccionDiariaLeche")
    , @NamedQuery(name = "TbProduccionLeche.findByFechaReg", query = "SELECT t FROM TbProduccionLeche t WHERE t.fechaReg = :fechaReg")})
public class TbProduccionLeche implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produccion_leche")
    private Integer idProduccionLeche;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "produccion_diaria_leche")
    private BigDecimal produccionDiariaLeche;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_familia", referencedColumnName = "id_familia")
    @ManyToOne
    private TbFamilia idFamilia;

    public TbProduccionLeche() {
    }

    public TbProduccionLeche(Integer idProduccionLeche) {
        this.idProduccionLeche = idProduccionLeche;
    }

    public Integer getIdProduccionLeche() {
        return idProduccionLeche;
    }

    public void setIdProduccionLeche(Integer idProduccionLeche) {
        this.idProduccionLeche = idProduccionLeche;
    }

    public BigDecimal getProduccionDiariaLeche() {
        return produccionDiariaLeche;
    }

    public void setProduccionDiariaLeche(BigDecimal produccionDiariaLeche) {
        this.produccionDiariaLeche = produccionDiariaLeche;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduccionLeche != null ? idProduccionLeche.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduccionLeche)) {
            return false;
        }
        TbProduccionLeche other = (TbProduccionLeche) object;
        if ((this.idProduccionLeche == null && other.idProduccionLeche != null) || (this.idProduccionLeche != null && !this.idProduccionLeche.equals(other.idProduccionLeche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbProduccionLeche[ idProduccionLeche=" + idProduccionLeche + " ]";
    }
    
}
