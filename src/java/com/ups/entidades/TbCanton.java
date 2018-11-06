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
@Table(name = "tb_canton")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCanton.findAll", query = "SELECT t FROM TbCanton t")
    , @NamedQuery(name = "TbCanton.findByIdCanton", query = "SELECT t FROM TbCanton t WHERE t.idCanton = :idCanton")
    , @NamedQuery(name = "TbCanton.findByNomCanton", query = "SELECT t FROM TbCanton t WHERE t.nomCanton = :nomCanton")
    , @NamedQuery(name = "TbCanton.findByProvincia", query = "SELECT t FROM TbCanton t WHERE t.idProvincia = :idProvincia")})
public class TbCanton implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_canton")
    private Integer idCanton;
    @Size(max = 2147483647)
    @Column(name = "nom_canton")
    private String nomCanton;
    @OneToMany(mappedBy = "idCanton")
    private List<TbParroquia> tbParroquiaList;
    @JoinColumn(name = "id_provincia", referencedColumnName = "id_provincia")
    @ManyToOne
    private TbProvincia idProvincia;

    public TbCanton() {
    }

    public TbCanton(Integer idCanton) {
        this.idCanton = idCanton;
    }

    public Integer getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(Integer idCanton) {
        this.idCanton = idCanton;
    }

    public String getNomCanton() {
        return nomCanton;
    }

    public void setNomCanton(String nomCanton) {
        this.nomCanton = nomCanton;
    }

    @XmlTransient
    public List<TbParroquia> getTbParroquiaList() {
        return tbParroquiaList;
    }

    public void setTbParroquiaList(List<TbParroquia> tbParroquiaList) {
        this.tbParroquiaList = tbParroquiaList;
    }

    public TbProvincia getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(TbProvincia idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCanton != null ? idCanton.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCanton)) {
            return false;
        }
        TbCanton other = (TbCanton) object;
        if ((this.idCanton == null && other.idCanton != null) || (this.idCanton != null && !this.idCanton.equals(other.idCanton))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomCanton + "";
    }
    
}
