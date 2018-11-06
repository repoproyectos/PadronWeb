/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_lote")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbLote.findAll", query = "SELECT t FROM TbLote t")
    , @NamedQuery(name = "TbLote.findByIdLote", query = "SELECT t FROM TbLote t WHERE t.idLote = :idLote")
    , @NamedQuery(name = "TbLote.findByCodigoLote", query = "SELECT t FROM TbLote t WHERE t.codigoLote = :codigoLote")
    , @NamedQuery(name = "TbLote.findByAreaTotalH", query = "SELECT t FROM TbLote t WHERE t.areaTotalH = :areaTotalH")
    , @NamedQuery(name = "TbLote.findByAreaTotalM", query = "SELECT t FROM TbLote t WHERE t.areaTotalM = :areaTotalM")
    , @NamedQuery(name = "TbLote.findByAreaRiegoH", query = "SELECT t FROM TbLote t WHERE t.areaRiegoH = :areaRiegoH")
    , @NamedQuery(name = "TbLote.findByAreaRiegoM", query = "SELECT t FROM TbLote t WHERE t.areaRiegoM = :areaRiegoM")
    , @NamedQuery(name = "TbLote.findByFechaReg", query = "SELECT t FROM TbLote t WHERE t.fechaReg = :fechaReg")})
public class TbLote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy=GenerationType.IDENTITY, generator="POC_ID_SEQ")
    //@SequenceGenerator(name="POC_ID_SEQ", sequenceName="POC_ID_SEQ", allocationSize=1)
    //@Basic(optional = false)
    @Column(name = "id_lote")
    private Integer idLote;
    @Size(max = 2147483647)
    @Column(name = "codigo_lote")
    private String codigoLote;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "area_total_h")
    private BigDecimal areaTotalH;
    @Column(name = "area_total_m")
    private BigDecimal areaTotalM;
    @Column(name = "area_riego_h")
    private BigDecimal areaRiegoH;
    @Column(name = "area_riego_m")
    private BigDecimal areaRiegoM;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @OneToMany(mappedBy = "idLote")
    private List<TbTurnoRiego> tbTurnoRiegoList;
    @OneToMany(mappedBy = "idLote")
    private List<TbPorcentajeRiego> tbPorcentajeRiegoList;
    @JoinColumn(name = "id_acequia", referencedColumnName = "id_acequia")
    @ManyToOne
    private TbAcequia idAcequia;
    @JoinColumn(name = "id_comunidad", referencedColumnName = "id_comunidad")
    @ManyToOne
    private TbComunidad idComunidad;
    @JoinColumn(name = "id_organizacion_riego", referencedColumnName = "id_organizacion_riego")
    @ManyToOne
    private TbOrganizacionRiego idOrganizacionRiego;
    @JoinColumn(name = "id_ovalo", referencedColumnName = "id_ovalo")
    @ManyToOne
    private TbOvalo idOvalo;
    @JoinColumn(name = "id_sector", referencedColumnName = "id_sector")
    @ManyToOne
    private TbSector idSector;
    @OneToMany(mappedBy = "idLote")
    public List<TbProduccionAgricola> tbProduccionAgricolaList;
    @OneToMany(mappedBy = "idLote")
    private List<TbTenenciaTierra> tbTenenciaTierraList;
    @OneToMany(mappedBy = "idLote")
    private List<TbValorTarifa> tbValorTarifaList;

    public TbLote() {
    }

    public TbLote(Integer idLote) {
        this.idLote = idLote;
    }

    public Integer getIdLote() {
        return idLote;
    }

    public void setIdLote(Integer idLote) {
        this.idLote = idLote;
    }

    public String getCodigoLote() {
        return codigoLote;
    }

    public void setCodigoLote(String codigoLote) {
        this.codigoLote = codigoLote;
    }

    public BigDecimal getAreaTotalH() {
        return areaTotalH;
    }

    public void setAreaTotalH(BigDecimal areaTotalH) {
        this.areaTotalH = areaTotalH;
    }

    public BigDecimal getAreaTotalM() {
        return areaTotalM;
    }

    public void setAreaTotalM(BigDecimal areaTotalM) {
        this.areaTotalM = areaTotalM;
    }

    public BigDecimal getAreaRiegoH() {
        return areaRiegoH;
    }

    public void setAreaRiegoH(BigDecimal areaRiegoH) {
        this.areaRiegoH = areaRiegoH;
    }

    public BigDecimal getAreaRiegoM() {
        return areaRiegoM;
    }

    public void setAreaRiegoM(BigDecimal areaRiegoM) {
        this.areaRiegoM = areaRiegoM;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    @XmlTransient
    public List<TbTurnoRiego> getTbTurnoRiegoList() {
        return tbTurnoRiegoList;
    }

    public void setTbTurnoRiegoList(List<TbTurnoRiego> tbTurnoRiegoList) {
        this.tbTurnoRiegoList = tbTurnoRiegoList;
    }

    @XmlTransient
    public List<TbPorcentajeRiego> getTbPorcentajeRiegoList() {
        return tbPorcentajeRiegoList;
    }

    public void setTbPorcentajeRiegoList(List<TbPorcentajeRiego> tbPorcentajeRiegoList) {
        this.tbPorcentajeRiegoList = tbPorcentajeRiegoList;
    }

    public TbAcequia getIdAcequia() {
        return idAcequia;
    }

    public void setIdAcequia(TbAcequia idAcequia) {
        this.idAcequia = idAcequia;
    }

    public TbComunidad getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(TbComunidad idComunidad) {
        this.idComunidad = idComunidad;
    }

    public TbOrganizacionRiego getIdOrganizacionRiego() {
        return idOrganizacionRiego;
    }

    public void setIdOrganizacionRiego(TbOrganizacionRiego idOrganizacionRiego) {
        this.idOrganizacionRiego = idOrganizacionRiego;
    }

    public TbOvalo getIdOvalo() {
        return idOvalo;
    }

    public void setIdOvalo(TbOvalo idOvalo) {
        this.idOvalo = idOvalo;
    }

    public TbSector getIdSector() {
        return idSector;
    }

    public void setIdSector(TbSector idSector) {
        this.idSector = idSector;
    }

    @XmlTransient
    public List<TbProduccionAgricola> getTbProduccionAgricolaList() {
        return tbProduccionAgricolaList;
    }

    public void setTbProduccionAgricolaList(List<TbProduccionAgricola> tbProduccionAgricolaList) {
        this.tbProduccionAgricolaList = tbProduccionAgricolaList;
    }

    @XmlTransient
    public List<TbTenenciaTierra> getTbTenenciaTierraList() {
        return tbTenenciaTierraList;
    }

    public void setTbTenenciaTierraList(List<TbTenenciaTierra> tbTenenciaTierraList) {
        this.tbTenenciaTierraList = tbTenenciaTierraList;
    }

    @XmlTransient
    public List<TbValorTarifa> getTbValorTarifaList() {
        return tbValorTarifaList;
    }

    public void setTbValorTarifaList(List<TbValorTarifa> tbValorTarifaList) {
        this.tbValorTarifaList = tbValorTarifaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLote != null ? idLote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbLote)) {
            return false;
        }
        TbLote other = (TbLote) object;
        if ((this.idLote == null && other.idLote != null) || (this.idLote != null && !this.idLote.equals(other.idLote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idLote + "";
    }
    
}
