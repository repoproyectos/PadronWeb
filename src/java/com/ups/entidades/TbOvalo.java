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
@Table(name = "tb_ovalo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbOvalo.findAll", query = "SELECT t FROM TbOvalo t")
    , @NamedQuery(name = "TbOvalo.findByIdOvalo", query = "SELECT t FROM TbOvalo t WHERE t.idOvalo = :idOvalo")
    , @NamedQuery(name = "TbOvalo.findByNomOvalo", query = "SELECT t FROM TbOvalo t WHERE t.nomOvalo = :nomOvalo")})
public class TbOvalo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ovalo")
    private Integer idOvalo;
    @Size(max = 2147483647)
    @Column(name = "nom_ovalo")
    private String nomOvalo;
    @OneToMany(mappedBy = "idOvalo")
    private List<TbLote> tbLoteList;

    public TbOvalo() {
    }

    public TbOvalo(Integer idOvalo) {
        this.idOvalo = idOvalo;
    }

    public Integer getIdOvalo() {
        return idOvalo;
    }

    public void setIdOvalo(Integer idOvalo) {
        this.idOvalo = idOvalo;
    }

    public String getNomOvalo() {
        return nomOvalo;
    }

    public void setNomOvalo(String nomOvalo) {
        this.nomOvalo = nomOvalo;
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
        hash += (idOvalo != null ? idOvalo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOvalo)) {
            return false;
        }
        TbOvalo other = (TbOvalo) object;
        if ((this.idOvalo == null && other.idOvalo != null) || (this.idOvalo != null && !this.idOvalo.equals(other.idOvalo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomOvalo + "";
    }
    
}
