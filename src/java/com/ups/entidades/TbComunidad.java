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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_comunidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbComunidad.findAll", query = "SELECT t FROM TbComunidad t")
    , @NamedQuery(name = "TbComunidad.findByIdComunidad", query = "SELECT t FROM TbComunidad t WHERE t.idComunidad = :idComunidad")
    , @NamedQuery(name = "TbComunidad.findByNomComunidad", query = "SELECT t FROM TbComunidad t WHERE t.nomComunidad = :nomComunidad")})
public class TbComunidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_comunidad")
    private Integer idComunidad;
    @Size(max = 2147483647)
    @Column(name = "nom_comunidad")
    private String nomComunidad;
    @OneToMany(mappedBy = "idComunidad")
    private List<TbDatosPersonales> tbDatosPersonalesList;
    @JoinColumn(name = "id_parroquia", referencedColumnName = "id_parroquia")
    @ManyToOne
    private TbParroquia idParroquia;
    @OneToMany(mappedBy = "idComunidad")
    private List<TbLote> tbLoteList;

    public TbComunidad() {
    }

    public TbComunidad(Integer idComunidad) {
        this.idComunidad = idComunidad;
    }

    public Integer getIdComunidad() {
        return idComunidad;
    }

    public void setIdComunidad(Integer idComunidad) {
        this.idComunidad = idComunidad;
    }

    public String getNomComunidad() {
        return nomComunidad;
    }

    public void setNomComunidad(String nomComunidad) {
        this.nomComunidad = nomComunidad;
    }

    @XmlTransient
    public List<TbDatosPersonales> getTbDatosPersonalesList() {
        return tbDatosPersonalesList;
    }

    public void setTbDatosPersonalesList(List<TbDatosPersonales> tbDatosPersonalesList) {
        this.tbDatosPersonalesList = tbDatosPersonalesList;
    }

    public TbParroquia getIdParroquia() {
        return idParroquia;
    }

    public void setIdParroquia(TbParroquia idParroquia) {
        this.idParroquia = idParroquia;
    }

    @XmlTransient
    public List<TbLote> getTbLoteList() {
        return tbLoteList;
    }

    public void setTbLoteList(List<TbLote> tbLoteList) {
        this.tbLoteList = tbLoteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComunidad != null ? idComunidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbComunidad)) {
            return false;
        }
        TbComunidad other = (TbComunidad) object;
        if ((this.idComunidad == null && other.idComunidad != null) || (this.idComunidad != null && !this.idComunidad.equals(other.idComunidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomComunidad + "";
    }
    
}
