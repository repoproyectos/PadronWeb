/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedProperty;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_familia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFamilia.findAll", query = "SELECT t FROM TbFamilia t")
    , @NamedQuery(name = "TbFamilia.findByIdFamilia", query = "SELECT t FROM TbFamilia t WHERE t.idFamilia = :idFamilia")})
public class TbFamilia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_familia")
    private Integer idFamilia;
    @JoinColumn(name = "id_datos_conyugue", referencedColumnName = "id_datos_conyugue")
    @ManyToOne
    private TbDatosConyugue idDatosConyugue;
    @JoinColumn(name = "id_datos_personales", referencedColumnName = "id_datos_personales")
    @ManyToOne
    private TbDatosPersonales idDatosPersonales;
    @OneToMany(mappedBy = "idFamilia")
    public List<TbProduccionPecuario> tbProduccionPecuarioList;
    @OneToMany(mappedBy = "idFamilia")
    public List<TbInventarioGanado> tbInventarioGanadoList;
    @OneToMany(mappedBy = "idFamilia")
    public List<TbDatosHijo> tbDatosHijoList;
    @OneToMany(mappedBy = "idFamilia")
    private List<TbDatosFicha> tbDatosFichaList;
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "idFamilia")
    public List<TbTenenciaTierra> tbTenenciaTierraList;
    @OneToMany(mappedBy = "idFamilia")
    public List<TbProduccionLeche> tbProduccionLecheList;
    
    public TbFamilia() {
        
    }
    
    public TbFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public TbDatosConyugue getIdDatosConyugue() {
        return idDatosConyugue;
    }

    public void setIdDatosConyugue(TbDatosConyugue idDatosConyugue) {
        this.idDatosConyugue = idDatosConyugue;
    }

    public TbDatosPersonales getIdDatosPersonales() {
        return idDatosPersonales;
    }

    public void setIdDatosPersonales(TbDatosPersonales idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    @XmlTransient
    public List<TbProduccionPecuario> getTbProduccionPecuarioList() {
        return tbProduccionPecuarioList;
    }

    public void setTbProduccionPecuarioList(List<TbProduccionPecuario> tbProduccionPecuarioList) {
        this.tbProduccionPecuarioList = tbProduccionPecuarioList;
    }

    @XmlTransient
    public List<TbInventarioGanado> getTbInventarioGanadoList() {
        return tbInventarioGanadoList;
    }

    public void setTbInventarioGanadoList(List<TbInventarioGanado> tbInventarioGanadoList) {
        this.tbInventarioGanadoList = tbInventarioGanadoList;
    }

    @XmlTransient
    public List<TbDatosHijo> getTbDatosHijoList() {
        return tbDatosHijoList;
    }

    public void setTbDatosHijoList(List<TbDatosHijo> tbDatosHijoList) {
        this.tbDatosHijoList = tbDatosHijoList;
    }

    @XmlTransient
    public List<TbDatosFicha> getTbDatosFichaList() {
        return tbDatosFichaList;
    }

    public void setTbDatosFichaList(List<TbDatosFicha> tbDatosFichaList) {
        this.tbDatosFichaList = tbDatosFichaList;
    }

    @XmlTransient
    public List<TbTenenciaTierra> getTbTenenciaTierraList() {
        return tbTenenciaTierraList;
    }

    public void setTbTenenciaTierraList(List<TbTenenciaTierra> tbTenenciaTierraList) {
        this.tbTenenciaTierraList = tbTenenciaTierraList;
    }

    @XmlTransient
    public List<TbProduccionLeche> getTbProduccionLecheList() {
        return tbProduccionLecheList;
    }

    public void setTbProduccionLecheList(List<TbProduccionLeche> tbProduccionLecheList) {
        this.tbProduccionLecheList = tbProduccionLecheList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFamilia != null ? idFamilia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFamilia)) {
            return false;
        }
        TbFamilia other = (TbFamilia) object;
        if ((this.idFamilia == null && other.idFamilia != null) || (this.idFamilia != null && !this.idFamilia.equals(other.idFamilia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbFamilia[ idFamilia=" + idFamilia + " ]";
    }
    
}
