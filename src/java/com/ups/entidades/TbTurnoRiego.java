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
@Table(name = "tb_turno_riego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbTurnoRiego.findAll", query = "SELECT t FROM TbTurnoRiego t")
    , @NamedQuery(name = "TbTurnoRiego.findByIdTurnoRiego", query = "SELECT t FROM TbTurnoRiego t WHERE t.idTurnoRiego = :idTurnoRiego")
    , @NamedQuery(name = "TbTurnoRiego.findByNumDias", query = "SELECT t FROM TbTurnoRiego t WHERE t.numDias = :numDias")
    , @NamedQuery(name = "TbTurnoRiego.findByHorasTurno", query = "SELECT t FROM TbTurnoRiego t WHERE t.horasTurno = :horasTurno")
    , @NamedQuery(name = "TbTurnoRiego.findByFechaReg", query = "SELECT t FROM TbTurnoRiego t WHERE t.fechaReg = :fechaReg")})
public class TbTurnoRiego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_turno_riego")
    private Integer idTurnoRiego;
    @Column(name = "num_dias")
    private Integer numDias;
    @Column(name = "horas_turno")
    private Integer horasTurno;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_frecuencia_riego", referencedColumnName = "id_frecuencia_riego")
    @ManyToOne
    private TbFrecuenciaRiego idFrecuenciaRiego;
    @JoinColumn(name = "id_lote", referencedColumnName = "id_lote")
    @ManyToOne
    private TbLote idLote;

    public TbTurnoRiego() {
    }

    public TbTurnoRiego(Integer idTurnoRiego) {
        this.idTurnoRiego = idTurnoRiego;
    }

    public Integer getIdTurnoRiego() {
        return idTurnoRiego;
    }

    public void setIdTurnoRiego(Integer idTurnoRiego) {
        this.idTurnoRiego = idTurnoRiego;
    }

    public Integer getNumDias() {
        return numDias;
    }

    public void setNumDias(Integer numDias) {
        this.numDias = numDias;
    }

    public Integer getHorasTurno() {
        return horasTurno;
    }

    public void setHorasTurno(Integer horasTurno) {
        this.horasTurno = horasTurno;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public TbFrecuenciaRiego getIdFrecuenciaRiego() {
        return idFrecuenciaRiego;
    }

    public void setIdFrecuenciaRiego(TbFrecuenciaRiego idFrecuenciaRiego) {
        this.idFrecuenciaRiego = idFrecuenciaRiego;
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
        hash += (idTurnoRiego != null ? idTurnoRiego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbTurnoRiego)) {
            return false;
        }
        TbTurnoRiego other = (TbTurnoRiego) object;
        if ((this.idTurnoRiego == null && other.idTurnoRiego != null) || (this.idTurnoRiego != null && !this.idTurnoRiego.equals(other.idTurnoRiego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbTurnoRiego[ idTurnoRiego=" + idTurnoRiego + " ]";
    }
    
}
