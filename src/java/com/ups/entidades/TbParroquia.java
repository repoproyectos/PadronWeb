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
@Table(name = "tb_parroquia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbParroquia.findAll", query = "SELECT t FROM TbParroquia t")
    , @NamedQuery(name = "TbParroquia.findByIdParroquia", query = "SELECT t FROM TbParroquia t WHERE t.idParroquia = :idParroquia")
    , @NamedQuery(name = "TbParroquia.findByNomParroquia", query = "SELECT t FROM TbParroquia t WHERE t.nomParroquia = :nomParroquia")})
public class TbParroquia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parroquia")
    private Integer idParroquia;
    @Size(max = 2147483647)
    @Column(name = "nom_parroquia")
    private String nomParroquia;
    @OneToMany(mappedBy = "idParroquia")
    private List<TbComunidad> tbComunidadList;
    @JoinColumn(name = "id_canton", referencedColumnName = "id_canton")
    @ManyToOne
    private TbCanton idCanton;

    public TbParroquia() {
    }

    public TbParroquia(Integer idParroquia) {
        this.idParroquia = idParroquia;
    }

    public Integer getIdParroquia() {
        return idParroquia;
    }

    public void setIdParroquia(Integer idParroquia) {
        this.idParroquia = idParroquia;
    }

    public String getNomParroquia() {
        return nomParroquia;
    }

    public void setNomParroquia(String nomParroquia) {
        this.nomParroquia = nomParroquia;
    }

    @XmlTransient
    public List<TbComunidad> getTbComunidadList() {
        return tbComunidadList;
    }

    public void setTbComunidadList(List<TbComunidad> tbComunidadList) {
        this.tbComunidadList = tbComunidadList;
    }

    public TbCanton getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(TbCanton idCanton) {
        this.idCanton = idCanton;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParroquia != null ? idParroquia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbParroquia)) {
            return false;
        }
        TbParroquia other = (TbParroquia) object;
        if ((this.idParroquia == null && other.idParroquia != null) || (this.idParroquia != null && !this.idParroquia.equals(other.idParroquia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomParroquia + "";
    }
    
}
