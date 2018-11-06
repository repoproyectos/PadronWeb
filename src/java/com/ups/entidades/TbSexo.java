/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_sexo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSexo.findAll", query = "SELECT t FROM TbSexo t")
    , @NamedQuery(name = "TbSexo.findByIdSexo", query = "SELECT t FROM TbSexo t WHERE t.idSexo = :idSexo")
    , @NamedQuery(name = "TbSexo.findByTipoSexo", query = "SELECT t FROM TbSexo t WHERE t.tipoSexo = :tipoSexo")})
public class TbSexo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Size(max = 2147483647)
    @Column(name = "tipo_sexo")
    private String tipoSexo;
    @OneToMany(mappedBy = "idSexo")
    private List<TbDatosConyugue> tbDatosConyugueList;
    @OneToMany(mappedBy = "idSexo")
    private List<TbDatosPersonales> tbDatosPersonalesList;
    @OneToMany(mappedBy = "idSexo")
    private List<TbDatosHijo> tbDatosHijoList;

    public TbSexo() {
    }

    public TbSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getTipoSexo() {
        return tipoSexo;
    }

    public void setTipoSexo(String tipoSexo) {
        this.tipoSexo = tipoSexo;
    }

    @XmlTransient
    public List<TbDatosConyugue> getTbDatosConyugueList() {
        return tbDatosConyugueList;
    }

    public void setTbDatosConyugueList(List<TbDatosConyugue> tbDatosConyugueList) {
        this.tbDatosConyugueList = tbDatosConyugueList;
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
        hash += (idSexo != null ? idSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSexo)) {
            return false;
        }
        TbSexo other = (TbSexo) object;
        if ((this.idSexo == null && other.idSexo != null) || (this.idSexo != null && !this.idSexo.equals(other.idSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoSexo + "";
    }
    
}
