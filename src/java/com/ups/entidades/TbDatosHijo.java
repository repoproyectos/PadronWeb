/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_datos_hijo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbDatosHijo.findAll", query = "SELECT t FROM TbDatosHijo t")
    , @NamedQuery(name = "TbDatosHijo.findByIdDatosHijo", query = "SELECT t FROM TbDatosHijo t WHERE t.idDatosHijo = :idDatosHijo")
    , @NamedQuery(name = "TbDatosHijo.findByCedulaHijo", query = "SELECT t FROM TbDatosHijo t WHERE t.cedulaHijo = :cedulaHijo")
    , @NamedQuery(name = "TbDatosHijo.findByApellidosHijo", query = "SELECT t FROM TbDatosHijo t WHERE t.apellidosHijo = :apellidosHijo")
    , @NamedQuery(name = "TbDatosHijo.findByNombresHijo", query = "SELECT t FROM TbDatosHijo t WHERE t.nombresHijo = :nombresHijo")
    , @NamedQuery(name = "TbDatosHijo.findByEdadHijo", query = "SELECT t FROM TbDatosHijo t WHERE t.edadHijo = :edadHijo")
    , @NamedQuery(name = "TbDatosHijo.findByDependiente", query = "SELECT t FROM TbDatosHijo t WHERE t.dependiente = :dependiente")
    , @NamedQuery(name = "TbDatosHijo.findByFechaReg", query = "SELECT t FROM TbDatosHijo t WHERE t.fechaReg = :fechaReg")})
public class TbDatosHijo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_datos_hijo")
    private Integer idDatosHijo;
    @Size(max = 2147483647)
    @Column(name = "cedula_hijo")
    private String cedulaHijo;
    @Size(max = 2147483647)
    @Column(name = "apellidos_hijo")
    private String apellidosHijo;
    @Size(max = 2147483647)
    @Column(name = "nombres_hijo")
    private String nombresHijo;
    @Column(name = "edad_hijo")
    private Integer edadHijo;
    @Size(max = 2147483647)
    @Column(name = "dependiente")
    private String dependiente;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_actividad_principal", referencedColumnName = "id_actividad_principal")
    @ManyToOne
    private TbActividadPrincipal idActividadPrincipal;
    @JoinColumn(name = "id_datos_conyugue", referencedColumnName = "id_datos_conyugue")
    @ManyToOne
    private TbDatosConyugue idDatosConyugue;
    @JoinColumn(name = "id_datos_personales", referencedColumnName = "id_datos_personales")
    @ManyToOne
    private TbDatosPersonales idDatosPersonales;
    @JoinColumn(name = "id_familia", referencedColumnName = "id_familia")
    @ManyToOne
    private TbFamilia idFamilia;
    @JoinColumn(name = "id_nivel_instruccion", referencedColumnName = "id_nivel_instruccion")
    @ManyToOne
    private TbNivelInstruccion idNivelInstruccion;
    @JoinColumn(name = "id_sexo", referencedColumnName = "id_sexo")
    @ManyToOne
    private TbSexo idSexo;

    public TbDatosHijo() {
        this.fechaReg = getEndOfDay(new Date());
        this.dependiente = "S";
    }
    
    private Date getEndOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        calendar.set(year, month, day, 23, 59, 59);
        return calendar.getTime();
    }

    public TbDatosHijo(Integer idDatosHijo) {
        this.idDatosHijo = idDatosHijo;
    }

    public Integer getIdDatosHijo() {
        return idDatosHijo;
    }

    public void setIdDatosHijo(Integer idDatosHijo) {
        this.idDatosHijo = idDatosHijo;
    }

    public String getCedulaHijo() {
        return cedulaHijo;
    }

    public void setCedulaHijo(String cedulaHijo) {
        this.cedulaHijo = cedulaHijo;
    }

    public String getApellidosHijo() {
        return apellidosHijo;
    }

    public void setApellidosHijo(String apellidosHijo) {
        this.apellidosHijo = apellidosHijo;
    }

    public String getNombresHijo() {
        return nombresHijo;
    }

    public void setNombresHijo(String nombresHijo) {
        this.nombresHijo = nombresHijo;
    }

    public Integer getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(Integer edadHijo) {
        this.edadHijo = edadHijo;
    }

    public String getDependiente() {
        return dependiente;
    }

    public void setDependiente(String dependiente) {
        this.dependiente = dependiente;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public TbActividadPrincipal getIdActividadPrincipal() {
        return idActividadPrincipal;
    }

    public void setIdActividadPrincipal(TbActividadPrincipal idActividadPrincipal) {
        this.idActividadPrincipal = idActividadPrincipal;
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

    public TbFamilia getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(TbFamilia idFamilia) {
        this.idFamilia = idFamilia;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDatosHijo != null ? idDatosHijo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbDatosHijo)) {
            return false;
        }
        TbDatosHijo other = (TbDatosHijo) object;
        if ((this.idDatosHijo == null && other.idDatosHijo != null) || (this.idDatosHijo != null && !this.idDatosHijo.equals(other.idDatosHijo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + cedulaHijo + "";
    }
    
}
