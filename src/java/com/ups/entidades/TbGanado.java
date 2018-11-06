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
@Table(name = "tb_ganado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbGanado.findAll", query = "SELECT t FROM TbGanado t")
    , @NamedQuery(name = "TbGanado.findByIdGanado", query = "SELECT t FROM TbGanado t WHERE t.idGanado = :idGanado")
    , @NamedQuery(name = "TbGanado.findByTipoGanado", query = "SELECT t FROM TbGanado t WHERE t.tipoGanado = :tipoGanado")})
public class TbGanado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ganado")
    private Integer idGanado;
    @Size(max = 2147483647)
    @Column(name = "tipo_ganado")
    private String tipoGanado;
    @OneToMany(mappedBy = "idGanado")
    private List<TbInventarioGanado> tbInventarioGanadoList;

    public TbGanado() {
    }

    public TbGanado(Integer idGanado) {
        this.idGanado = idGanado;
    }

    public Integer getIdGanado() {
        return idGanado;
    }

    public void setIdGanado(Integer idGanado) {
        this.idGanado = idGanado;
    }

    public String getTipoGanado() {
        return tipoGanado;
    }

    public void setTipoGanado(String tipoGanado) {
        this.tipoGanado = tipoGanado;
    }

    @XmlTransient
    public List<TbInventarioGanado> getTbInventarioGanadoList() {
        return tbInventarioGanadoList;
    }

    public void setTbInventarioGanadoList(List<TbInventarioGanado> tbInventarioGanadoList) {
        this.tbInventarioGanadoList = tbInventarioGanadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGanado != null ? idGanado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbGanado)) {
            return false;
        }
        TbGanado other = (TbGanado) object;
        if ((this.idGanado == null && other.idGanado != null) || (this.idGanado != null && !this.idGanado.equals(other.idGanado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + tipoGanado + "";
    }
    
}
