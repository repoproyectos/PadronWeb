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
@Table(name = "tb_sector")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbSector.findAll", query = "SELECT t FROM TbSector t")
    , @NamedQuery(name = "TbSector.findByIdSector", query = "SELECT t FROM TbSector t WHERE t.idSector = :idSector")
    , @NamedQuery(name = "TbSector.findByNomSector", query = "SELECT t FROM TbSector t WHERE t.nomSector = :nomSector")})
public class TbSector implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sector")
    private Integer idSector;
    @Size(max = 2147483647)
    @Column(name = "nom_sector")
    private String nomSector;
    @OneToMany(mappedBy = "idSector")
    private List<TbLote> tbLoteList;

    public TbSector() {
    }

    public TbSector(Integer idSector) {
        this.idSector = idSector;
    }

    public Integer getIdSector() {
        return idSector;
    }

    public void setIdSector(Integer idSector) {
        this.idSector = idSector;
    }

    public String getNomSector() {
        return nomSector;
    }

    public void setNomSector(String nomSector) {
        this.nomSector = nomSector;
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
        hash += (idSector != null ? idSector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbSector)) {
            return false;
        }
        TbSector other = (TbSector) object;
        if ((this.idSector == null && other.idSector != null) || (this.idSector != null && !this.idSector.equals(other.idSector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomSector + "";
    }
    
}
