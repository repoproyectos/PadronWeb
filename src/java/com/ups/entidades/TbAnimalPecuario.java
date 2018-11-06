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
@Table(name = "tb_animal_pecuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbAnimalPecuario.findAll", query = "SELECT t FROM TbAnimalPecuario t")
    , @NamedQuery(name = "TbAnimalPecuario.findByIdAnimalPecuario", query = "SELECT t FROM TbAnimalPecuario t WHERE t.idAnimalPecuario = :idAnimalPecuario")
    , @NamedQuery(name = "TbAnimalPecuario.findByNomAnimal", query = "SELECT t FROM TbAnimalPecuario t WHERE t.nomAnimal = :nomAnimal")})
public class TbAnimalPecuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_animal_pecuario")
    private Integer idAnimalPecuario;
    @Size(max = 2147483647)
    @Column(name = "nom_animal")
    private String nomAnimal;
    @OneToMany(mappedBy = "idAnimalPecuario")
    private List<TbProduccionPecuario> tbProduccionPecuarioList;

    public TbAnimalPecuario() {
    }

    public TbAnimalPecuario(Integer idAnimalPecuario) {
        this.idAnimalPecuario = idAnimalPecuario;
    }

    public Integer getIdAnimalPecuario() {
        return idAnimalPecuario;
    }

    public void setIdAnimalPecuario(Integer idAnimalPecuario) {
        this.idAnimalPecuario = idAnimalPecuario;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    @XmlTransient
    public List<TbProduccionPecuario> getTbProduccionPecuarioList() {
        return tbProduccionPecuarioList;
    }

    public void setTbProduccionPecuarioList(List<TbProduccionPecuario> tbProduccionPecuarioList) {
        this.tbProduccionPecuarioList = tbProduccionPecuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnimalPecuario != null ? idAnimalPecuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbAnimalPecuario)) {
            return false;
        }
        TbAnimalPecuario other = (TbAnimalPecuario) object;
        if ((this.idAnimalPecuario == null && other.idAnimalPecuario != null) || (this.idAnimalPecuario != null && !this.idAnimalPecuario.equals(other.idAnimalPecuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + nomAnimal + "";
    }
    
}
