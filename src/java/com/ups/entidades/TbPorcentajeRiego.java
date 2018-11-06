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
@Table(name = "tb_porcentaje_riego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPorcentajeRiego.findAll", query = "SELECT t FROM TbPorcentajeRiego t")
    , @NamedQuery(name = "TbPorcentajeRiego.findByIdPorcentajeRiego", query = "SELECT t FROM TbPorcentajeRiego t WHERE t.idPorcentajeRiego = :idPorcentajeRiego")
    , @NamedQuery(name = "TbPorcentajeRiego.findByPorcentaje", query = "SELECT t FROM TbPorcentajeRiego t WHERE t.porcentaje = :porcentaje")
    , @NamedQuery(name = "TbPorcentajeRiego.findByNumAspersoresSitio", query = "SELECT t FROM TbPorcentajeRiego t WHERE t.numAspersoresSitio = :numAspersoresSitio")
    , @NamedQuery(name = "TbPorcentajeRiego.findByFechaReg", query = "SELECT t FROM TbPorcentajeRiego t WHERE t.fechaReg = :fechaReg")})
public class TbPorcentajeRiego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_porcentaje_riego")
    private Integer idPorcentajeRiego;
    @Column(name = "porcentaje")
    private Integer porcentaje;
    @Column(name = "num_aspersores_sitio")
    private Integer numAspersoresSitio;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_lote", referencedColumnName = "id_lote")
    @ManyToOne
    private TbLote idLote;
    @JoinColumn(name = "id_metodo_riego", referencedColumnName = "id_metodo_riego")
    @ManyToOne
    private TbMetodoRiego idMetodoRiego;
    @JoinColumn(name = "id_tipo_aspersor", referencedColumnName = "id_tipo_aspersor")
    @ManyToOne
    private TbTipoAspersor idTipoAspersor;

    public TbPorcentajeRiego() {
    }

    public TbPorcentajeRiego(Integer idPorcentajeRiego) {
        this.idPorcentajeRiego = idPorcentajeRiego;
    }

    public Integer getIdPorcentajeRiego() {
        return idPorcentajeRiego;
    }

    public void setIdPorcentajeRiego(Integer idPorcentajeRiego) {
        this.idPorcentajeRiego = idPorcentajeRiego;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Integer getNumAspersoresSitio() {
        return numAspersoresSitio;
    }

    public void setNumAspersoresSitio(Integer numAspersoresSitio) {
        this.numAspersoresSitio = numAspersoresSitio;
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

    public TbMetodoRiego getIdMetodoRiego() {
        return idMetodoRiego;
    }

    public void setIdMetodoRiego(TbMetodoRiego idMetodoRiego) {
        this.idMetodoRiego = idMetodoRiego;
    }

    public TbTipoAspersor getIdTipoAspersor() {
        return idTipoAspersor;
    }

    public void setIdTipoAspersor(TbTipoAspersor idTipoAspersor) {
        this.idTipoAspersor = idTipoAspersor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPorcentajeRiego != null ? idPorcentajeRiego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPorcentajeRiego)) {
            return false;
        }
        TbPorcentajeRiego other = (TbPorcentajeRiego) object;
        if ((this.idPorcentajeRiego == null && other.idPorcentajeRiego != null) || (this.idPorcentajeRiego != null && !this.idPorcentajeRiego.equals(other.idPorcentajeRiego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbPorcentajeRiego[ idPorcentajeRiego=" + idPorcentajeRiego + " ]";
    }
    
}
