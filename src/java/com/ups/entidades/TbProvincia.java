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
import javax.persistence.Query;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_provincia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProvincia.findAll", query = "SELECT t FROM TbProvincia t")
    , @NamedQuery(name = "TbProvincia.findByIdProvincia", query = "SELECT t FROM TbProvincia t WHERE t.idProvincia = :idProvincia")
    , @NamedQuery(name = "TbProvincia.findByNomProvincia", query = "SELECT t FROM TbProvincia t WHERE t.nomProvincia = :nomProvincia")})
public class TbProvincia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_provincia")
    private Integer idProvincia;
    @Size(max = 2147483647)
    @Column(name = "nom_provincia")
    private String nomProvincia;
    @OneToMany(mappedBy = "idProvincia")
    private List<TbCanton> tbCantonList;

    public TbProvincia() {
    }
    

    public TbProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNomProvincia() {
        return nomProvincia;
    }

    public void setNomProvincia(String nomProvincia) {
        this.nomProvincia = nomProvincia;
    }

    @XmlTransient
    public List<TbCanton> getTbCantonList() {
        return tbCantonList;
    }

    public void setTbCantonList(List<TbCanton> tbCantonList) {
        this.tbCantonList = tbCantonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProvincia != null ? idProvincia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProvincia)) {
            return false;
        }
        TbProvincia other = (TbProvincia) object;
        if ((this.idProvincia == null && other.idProvincia != null) || (this.idProvincia != null && !this.idProvincia.equals(other.idProvincia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ""+nomProvincia+"";
    }
    
}
