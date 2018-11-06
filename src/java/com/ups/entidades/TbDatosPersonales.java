/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import com.ups.controladores.TbDatosConyugueController;
import com.ups.controladores.TbDatosPersonalesController;
import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_datos_personales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbDatosPersonales.findAll", query = "SELECT t FROM TbDatosPersonales t")
    , @NamedQuery(name = "TbDatosPersonales.findByIdDatosPersonales", query = "SELECT t FROM TbDatosPersonales t WHERE t.idDatosPersonales = :idDatosPersonales")
    , @NamedQuery(name = "TbDatosPersonales.findByCedula", query = "SELECT t FROM TbDatosPersonales t WHERE t.cedula = :cedula")
    , @NamedQuery(name = "TbDatosPersonales.findByApellidos", query = "SELECT t FROM TbDatosPersonales t WHERE t.apellidos = :apellidos")
    , @NamedQuery(name = "TbDatosPersonales.findByNombres", query = "SELECT t FROM TbDatosPersonales t WHERE t.nombres = :nombres")
    , @NamedQuery(name = "TbDatosPersonales.findByEdad", query = "SELECT t FROM TbDatosPersonales t WHERE t.edad = :edad")
    , @NamedQuery(name = "TbDatosPersonales.findByNumTelFijo", query = "SELECT t FROM TbDatosPersonales t WHERE t.numTelFijo = :numTelFijo")
    , @NamedQuery(name = "TbDatosPersonales.findByNumTelMovil", query = "SELECT t FROM TbDatosPersonales t WHERE t.numTelMovil = :numTelMovil")
    , @NamedQuery(name = "TbDatosPersonales.findByJefeHogar", query = "SELECT t FROM TbDatosPersonales t WHERE t.jefeHogar = :jefeHogar")
    , @NamedQuery(name = "TbDatosPersonales.findByFechaReg", query = "SELECT t FROM TbDatosPersonales t WHERE t.fechaReg = :fechaReg")})
public class TbDatosPersonales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_personales")
    private Integer idDatosPersonales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 2147483647)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 2147483647)
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "edad")
    private Integer edad;
    @Size(max = 2147483647)
    @Column(name = "num_tel_fijo")
    private String numTelFijo;
    @Size(max = 2147483647)
    @Column(name = "num_tel_movil")
    private String numTelMovil;
    @Size(max = 2147483647)
    @Column(name = "jefe_hogar")
    private String jefeHogar;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "idDatosPersonales")
    public List<TbFamilia> tbFamiliaList;
    @JoinColumn(name = "id_actividad_principal", referencedColumnName = "id_actividad_principal")
    @ManyToOne
    private TbActividadPrincipal idActividadPrincipal;
    @JoinColumn(name = "id_comunidad", referencedColumnName = "id_comunidad")
    @ManyToOne
    private TbComunidad idComunidad;
    @JoinColumn(name = "id_datos_conyugue", referencedColumnName = "id_datos_conyugue")
    @ManyToOne
    private TbDatosConyugue idDatosConyugue;
    @JoinColumn(name = "id_estado_civil", referencedColumnName = "id_estado_civil")
    @ManyToOne
    private TbEstadoCivil idEstadoCivil;
    @JoinColumn(name = "id_nivel_instruccion", referencedColumnName = "id_nivel_instruccion")
    @ManyToOne
    private TbNivelInstruccion idNivelInstruccion;
    @JoinColumn(name = "id_sexo", referencedColumnName = "id_sexo")
    @ManyToOne
    private TbSexo idSexo;
    @OneToMany(cascade = CascadeType.PERSIST,mappedBy = "idDatosPersonales")
    public List<TbDatosHijo> tbDatosHijoList;


    public TbDatosPersonales() {
        this.fechaReg = getEndOfDay(new Date());
        this.jefeHogar = "S";
    }
    private Date getEndOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        calendar.set(year, month, day, 23, 59, 59);
        return calendar.getTime();
    }

    public TbDatosPersonales(Integer idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public TbDatosPersonales(Integer idDatosPersonales, String cedula) {
        this.idDatosPersonales = idDatosPersonales;
        this.cedula = cedula;
    }

    public Integer getIdDatosPersonales() {
        return idDatosPersonales;
    }

    public void setIdDatosPersonales(Integer idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNumTelFijo() {
        return numTelFijo;
    }

    public void setNumTelFijo(String numTelFijo) {
        this.numTelFijo = numTelFijo;
    }

    public String getNumTelMovil() {
        return numTelMovil;
    }

    public void setNumTelMovil(String numTelMovil) {
        this.numTelMovil = numTelMovil;
    }

    public String getJefeHogar() {
        return jefeHogar;
    }

    public void setJefeHogar(String jefeHogar) {
        this.jefeHogar = jefeHogar;
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

    public TbComunidad getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(TbComunidad idComunidad) {
        this.idComunidad = idComunidad;
    }

    public TbDatosConyugue getIdDatosConyugue() {
        return idDatosConyugue;
    }

    public void setIdDatosConyugue(TbDatosConyugue idDatosConyugue) {
        this.idDatosConyugue = idDatosConyugue;
    }

    public TbEstadoCivil getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(TbEstadoCivil idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public TbNivelInstruccion getIdNivelInstruccion() {
        return idNivelInstruccion;
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
    public List<TbDatosHijo> getTbDatosHijoList() {
        return tbDatosHijoList;
    }

    public void setTbDatosHijoList(List<TbDatosHijo> tbDatosHijoList) {
        this.tbDatosHijoList = tbDatosHijoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosPersonales != null ? idDatosPersonales.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDatosPersonales)) {
            return false;
        }
        TbDatosPersonales other = (TbDatosPersonales) object;
        if ((this.idDatosPersonales == null && other.idDatosPersonales != null) || (this.idDatosPersonales != null && !this.idDatosPersonales.equals(other.idDatosPersonales))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idDatosPersonales + "";
    }
    
}
