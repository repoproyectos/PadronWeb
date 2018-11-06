/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_produccion_pecuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbProduccionPecuario.findAll", query = "SELECT t FROM TbProduccionPecuario t")
    , @NamedQuery(name = "TbProduccionPecuario.findByIdProduccionPecuario", query = "SELECT t FROM TbProduccionPecuario t WHERE t.idProduccionPecuario = :idProduccionPecuario")
    , @NamedQuery(name = "TbProduccionPecuario.findByNumAnimal", query = "SELECT t FROM TbProduccionPecuario t WHERE t.numAnimal = :numAnimal")
    , @NamedQuery(name = "TbProduccionPecuario.findByFechaReg", query = "SELECT t FROM TbProduccionPecuario t WHERE t.fechaReg = :fechaReg")})
public class TbProduccionPecuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_produccion_pecuario")
    private Integer idProduccionPecuario;
    @Column(name = "num_animal")
    private Integer numAnimal;
    @Column(name = "fecha_reg")
    @Temporal(TemporalType.DATE)
    private Date fechaReg;
    @JoinColumn(name = "id_animal_pecuario", referencedColumnName = "id_animal_pecuario")
    @ManyToOne
    private TbAnimalPecuario idAnimalPecuario;
    @JoinColumn(name = "id_familia", referencedColumnName = "id_familia")
    @ManyToOne
    private TbFamilia idFamilia;

    public TbProduccionPecuario() {
    }

    public TbProduccionPecuario(Integer idProduccionPecuario) {
        this.idProduccionPecuario = idProduccionPecuario;
    }

    public Integer getIdProduccionPecuario() {
        return idProduccionPecuario;
    }

    public void setIdProduccionPecuario(Integer idProduccionPecuario) {
        this.idProduccionPecuario = idProduccionPecuario;
    }

    public Integer getNumAnimal() {
        return numAnimal;
    }

    public void setNumAnimal(Integer numAnimal) {
        this.numAnimal = numAnimal;
    }

    public Date getFechaReg() {
        return fechaReg;
    }

    public void setFechaReg(Date fechaReg) {
        this.fechaReg = fechaReg;
    }

    public TbAnimalPecuario getIdAnimalPecuario() {
        return idAnimalPecuario;
    }

    public void setIdAnimalPecuario(TbAnimalPecuario idAnimalPecuario) {
        this.idAnimalPecuario = idAnimalPecuario;
    }

    public TbFamilia getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(TbFamilia idFamilia) {
        this.idFamilia = idFamilia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduccionPecuario != null ? idProduccionPecuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbProduccionPecuario)) {
            return false;
        }
        TbProduccionPecuario other = (TbProduccionPecuario) object;
        if ((this.idProduccionPecuario == null && other.idProduccionPecuario != null) || (this.idProduccionPecuario != null && !this.idProduccionPecuario.equals(other.idProduccionPecuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ups.entidades.TbProduccionPecuario[ idProduccionPecuario=" + idProduccionPecuario + " ]";
    }
    
}
