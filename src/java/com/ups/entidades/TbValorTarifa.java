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
@Table(name = "tb_valor_tarifa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbValorTarifa.findAll", query = "SELECT t FROM TbValorTarifa t")
    , @NamedQuery(name = "TbValorTarifa.findByIdValorTarifa", query = "SELECT t FROM TbValorTarifa t WHERE t.idValorTarifa = :idValorTarifa")
    , @NamedQuery(name = "TbValorTarifa.findByValorTarifa", query = "SELECT t FROM TbValorTarifa t WHERE t.valorTarifa = :valorTarifa")
    , @NamedQuery(name = "TbValorTarifa.findByFechaReg", query = "SELECT t FROM TbValorTarifa t WHERE t.fechaReg = :fechaReg")})
public class TbValorTarifa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_valor_tarifa")
    private Integer idValorTarifa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_tarifa")
    private BigDecimal valorTarifa;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_lote", referencedColumnName = "id_lote")
    @ManyToOne
    private TbLote idLote;
    @JoinColumn(name = "id_tipo_tarifa", referencedColumnName = "id_tipo_tarifa")
    @ManyToOne
    private TbTipoTarifa idTipoTarifa;

    public TbValorTarifa() {
    }

    public TbValorTarifa(Integer idValorTarifa) {
        this.idValorTarifa = idValorTarifa;
    }

    public Integer getIdValorTarifa() {
        return idValorTarifa;
    }

    public void setIdValorTarifa(Integer idValorTarifa) {
        this.idValorTarifa = idValorTarifa;
    }

    public BigDecimal getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(BigDecimal valorTarifa) {
        this.valorTarifa = valorTarifa;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public TbLote getIdLote() {
        return idLote;
    }

    public void setIdLote(TbLote idLote) {
        this.idLote = idLote;
    }

    public TbTipoTarifa getIdTipoTarifa() {
        return idTipoTarifa;
    }

    public void setIdTipoTarifa(TbTipoTarifa idTipoTarifa) {
        this.idTipoTarifa = idTipoTarifa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idValorTarifa != null ? idValorTarifa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbValorTarifa)) {
            return false;
        }
        TbValorTarifa other = (TbValorTarifa) object;
        if ((this.idValorTarifa == null && other.idValorTarifa != null) || (this.idValorTarifa != null && !this.idValorTarifa.equals(other.idValorTarifa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbValorTarifa[ idValorTarifa=" + idValorTarifa + " ]";
    }
    
}
