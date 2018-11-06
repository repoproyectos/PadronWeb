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
@Table(name = "tb_metodo_riego")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbMetodoRiego.findAll", query = "SELECT t FROM TbMetodoRiego t")
    , @NamedQuery(name = "TbMetodoRiego.findByIdMetodoRiego", query = "SELECT t FROM TbMetodoRiego t WHERE t.idMetodoRiego = :idMetodoRiego")
    , @NamedQuery(name = "TbMetodoRiego.findByTipoMetodo", query = "SELECT t FROM TbMetodoRiego t WHERE t.tipoMetodo = :tipoMetodo")})
public class TbMetodoRiego implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_metodo_riego")
    private Integer idMetodoRiego;
    @Size(max = 2147483647)
    @Column(name = "tipo_metodo")
    private String tipoMetodo;
    @OneToMany(mappedBy = "idMetodoRiego")
    private List<TbPorcentajeRiego> tbPorcentajeRiegoList;

    public TbMetodoRiego() {
    }

    public TbMetodoRiego(Integer idMetodoRiego) {
        this.idMetodoRiego = idMetodoRiego;
    }

    public Integer getIdMetodoRiego() {
        return idMetodoRiego;
    }

    public void setIdMetodoRiego(Integer idMetodoRiego) {
        this.idMetodoRiego = idMetodoRiego;
    }

    public String getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

    @XmlTransient
    public List<TbPorcentajeRiego> getTbPorcentajeRiegoList() {
        return tbPorcentajeRiegoList;
    }

    public void setTbPorcentajeRiegoList(List<TbPorcentajeRiego> tbPorcentajeRiegoList) {
        this.tbPorcentajeRiegoList = tbPorcentajeRiegoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMetodoRiego != null ? idMetodoRiego.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbMetodoRiego)) {
            return false;
        }
        TbMetodoRiego other = (TbMetodoRiego) object;
        if ((this.idMetodoRiego == null && other.idMetodoRiego != null) || (this.idMetodoRiego != null && !this.idMetodoRiego.equals(other.idMetodoRiego))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoMetodo + "";
    }
    
}
