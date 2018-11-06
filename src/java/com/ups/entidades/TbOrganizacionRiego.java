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
@Table(name = "tb_organizacion_riego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbOrganizacionRiego.findAll", query = "SELECT t FROM TbOrganizacionRiego t")
    , @NamedQuery(name = "TbOrganizacionRiego.findByIdOrganizacionRiego", query = "SELECT t FROM TbOrganizacionRiego t WHERE t.idOrganizacionRiego = :idOrganizacionRiego")
    , @NamedQuery(name = "TbOrganizacionRiego.findByNomOrganizacionRiego", query = "SELECT t FROM TbOrganizacionRiego t WHERE t.nomOrganizacionRiego = :nomOrganizacionRiego")})
public class TbOrganizacionRiego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_organizacion_riego")
    private Integer idOrganizacionRiego;
    @Size(max = 2147483647)
    @Column(name = "nom_organizacion_riego")
    private String nomOrganizacionRiego;
    @OneToMany(mappedBy = "idOrganizacionRiego")
    private List<TbLote> tbLoteList;

    public TbOrganizacionRiego() {
    }

    public TbOrganizacionRiego(Integer idOrganizacionRiego) {
        this.idOrganizacionRiego = idOrganizacionRiego;
    }

    public Integer getIdOrganizacionRiego() {
        return idOrganizacionRiego;
    }

    public void setIdOrganizacionRiego(Integer idOrganizacionRiego) {
        this.idOrganizacionRiego = idOrganizacionRiego;
    }

    public String getNomOrganizacionRiego() {
        return nomOrganizacionRiego;
    }

    public void setNomOrganizacionRiego(String nomOrganizacionRiego) {
        this.nomOrganizacionRiego = nomOrganizacionRiego;
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
        hash += (idOrganizacionRiego != null ? idOrganizacionRiego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbOrganizacionRiego)) {
            return false;
        }
        TbOrganizacionRiego other = (TbOrganizacionRiego) object;
        if ((this.idOrganizacionRiego == null && other.idOrganizacionRiego != null) || (this.idOrganizacionRiego != null && !this.idOrganizacionRiego.equals(other.idOrganizacionRiego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomOrganizacionRiego + "";
    }
    
}
