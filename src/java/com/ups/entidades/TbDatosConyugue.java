/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.util.Calendar;
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
@Table(name = "tb_datos_conyugue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbDatosConyugue.findAll", query = "SELECT t FROM TbDatosConyugue t")
    , @NamedQuery(name = "TbDatosConyugue.findByIdDatosConyugue", query = "SELECT t FROM TbDatosConyugue t WHERE t.idDatosConyugue = :idDatosConyugue")
    , @NamedQuery(name = "TbDatosConyugue.findByCedulaConyugue", query = "SELECT t FROM TbDatosConyugue t WHERE t.cedulaConyugue = :cedulaConyugue")
    , @NamedQuery(name = "TbDatosConyugue.findByApellidosConyugue", query = "SELECT t FROM TbDatosConyugue t WHERE t.apellidosConyugue = :apellidosConyugue")
    , @NamedQuery(name = "TbDatosConyugue.findByNombresConyugue", query = "SELECT t FROM TbDatosConyugue t WHERE t.nombresConyugue = :nombresConyugue")
    , @NamedQuery(name = "TbDatosConyugue.findByEdadConyugue", query = "SELECT t FROM TbDatosConyugue t WHERE t.edadConyugue = :edadConyugue")
    , @NamedQuery(name = "TbDatosConyugue.findByFechaReg", query = "SELECT t FROM TbDatosConyugue t WHERE t.fechaReg = :fechaReg")})
public class TbDatosConyugue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_conyugue")
    private Integer idDatosConyugue;
    @Size(max = 2147483647)
    @Column(name = "cedula_conyugue")
    private String cedulaConyugue;
    @Size(max = 2147483647)
    @Column(name = "apellidos_conyugue")
    private String apellidosConyugue;
    @Size(max = 2147483647)
    @Column(name = "nombres_conyugue")
    private String nombresConyugue;
    @Column(name = "edad_conyugue")
    private Integer edadConyugue;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @OneToMany(mappedBy = "idDatosConyugue")
    private List<TbFamilia> tbFamiliaList;
    @JoinColumn(name = "id_actividad_principal", referencedColumnName = "id_actividad_principal")
    @ManyToOne
    private TbActividadPrincipal idActividadPrincipal;
    @JoinColumn(name = "id_nivel_instruccion", referencedColumnName = "id_nivel_instruccion")
    @ManyToOne
    private TbNivelInstruccion idNivelInstruccion;
    @JoinColumn(name = "id_sexo", referencedColumnName = "id_sexo")
    @ManyToOne
    private TbSexo idSexo;
    @OneToMany(mappedBy = "idDatosConyugue")
    private List<TbDatosPersonales> tbDatosPersonalesList;
    @OneToMany(mappedBy = "idDatosConyugue")
    private List<TbDatosHijo> tbDatosHijoList;
    @JoinColumn(name = "id_datos_personales", referencedColumnName = "id_datos_personales")
    @ManyToOne
    private TbDatosPersonales idDatosPersonales;

    public TbDatosConyugue() {
     this.fechaReg = getEndOfDay(new Date());   
    }
    private Date getEndOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        calendar.set(year, month, day, 23, 59, 59);
        return calendar.getTime();
    }
    

    public TbDatosConyugue(Integer idDatosConyugue) {
        this.idDatosConyugue = idDatosConyugue;
    }

    public Integer getIdDatosConyugue() {
        return idDatosConyugue;
    }

    public void setIdDatosConyugue(Integer idDatosConyugue) {
        this.idDatosConyugue = idDatosConyugue;
    }

    public String getCedulaConyugue() {
        return cedulaConyugue;
    }

    public void setCedulaConyugue(String cedulaConyugue) {
        this.cedulaConyugue = cedulaConyugue;
    }

    public String getApellidosConyugue() {
        return apellidosConyugue;
    }

    public void setApellidosConyugue(String apellidosConyugue) {
        this.apellidosConyugue = apellidosConyugue;
    }

    public String getNombresConyugue() {
        return nombresConyugue;
    }

    public void setNombresConyugue(String nombresConyugue) {
        this.nombresConyugue = nombresConyugue;
    }

    public Integer getEdadConyugue() {
        return edadConyugue;
    }

    public void setEdadConyugue(Integer edadConyugue) {
        this.edadConyugue = edadConyugue;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    @XmlTransient
    public List<TbFamilia> getTbFamiliaList() {
        return tbFamiliaList;
    }

    public void setTbFamiliaList(List<TbFamilia> tbFamiliaList) {
        this.tbFamiliaList = tbFamiliaList;
    }

    public TbActividadPrincipal getIdActividadPrincipal() {
        return idActividadPrincipal;
    }

    public void setIdActividadPrincipal(TbActividadPrincipal idActividadPrincipal) {
        this.idActividadPrincipal = idActividadPrincipal;
    }

    public TbNivelInstruccion getIdNivelInstruccion() {
        return idNivelInstruccion;
    }
    
    public void setIdDatosPersonales(TbDatosPersonales idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public TbDatosPersonales getIdDatosPersonales() {
        return idDatosPersonales;
    }

    public void setIdNivelInstruccion(TbNivelInstruccion idNivelInstruccion) {
        this.idNivelInstruccion = idNivelInstruccion;
    }

    public TbSexo getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(TbSexo idSexo) {
        this.idSexo = idSexo;
    }

    @XmlTransient
    public List<TbDatosPersonales> getTbDatosPersonalesList() {
        return tbDatosPersonalesList;
    }

    public void setTbDatosPersonalesList(List<TbDatosPersonales> tbDatosPersonalesList) {
        this.tbDatosPersonalesList = tbDatosPersonalesList;
    }

    @XmlTransient
    public List<TbDatosHijo> getTbDatosHijoList() {
        return tbDatosHijoList;
    }

    public void setTbDatosHijoList(List<TbDatosHijo> tbDatosHijoList) {
        this.tbDatosHijoList = tbDatosHijoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosConyugue != null ? idDatosConyugue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDatosConyugue)) {
            return false;
        }
        TbDatosConyugue other = (TbDatosConyugue) object;
        if ((this.idDatosConyugue == null && other.idDatosConyugue != null) || (this.idDatosConyugue != null && !this.idDatosConyugue.equals(other.idDatosConyugue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + cedulaConyugue + " | "+nombresConyugue;
    }
    
}
