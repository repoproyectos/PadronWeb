/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FAMILIA
 */
@Entity
@Table(name = "tb_catalogo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCatalogo.findAll", query = "SELECT t FROM TbCatalogo t")
    , @NamedQuery(name = "TbCatalogo.findByIdCatalogo", query = "SELECT t FROM TbCatalogo t WHERE t.idCatalogo = :idCatalogo")
    , @NamedQuery(name = "TbCatalogo.findByImgCarrusel", query = "SELECT t FROM TbCatalogo t WHERE t.imgCarrusel = :imgCarrusel")
    , @NamedQuery(name = "TbCatalogo.findByBanner1", query = "SELECT t FROM TbCatalogo t WHERE t.banner1 = :banner1")})
public class TbCatalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_catalogo")
    private Integer idCatalogo;
    @Size(max = 2147483647)
    @Column(name = "img_carrusel")
    private String imgCarrusel;
    @Size(max = 2147483647)
    @Column(name = "banner_1")
    private String banner1;

    public TbCatalogo() {
    }

    public TbCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getImgCarrusel() {
        return imgCarrusel;
    }

    public void setImgCarrusel(String imgCarrusel) {
        this.imgCarrusel = imgCarrusel;
    }

    public String getBanner1() {
        return banner1;
    }

    public void setBanner1(String banner1) {
        this.banner1 = banner1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCatalogo != null ? idCatalogo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCatalogo)) {
            return false;
        }
        TbCatalogo other = (TbCatalogo) object;
        if ((this.idCatalogo == null && other.idCatalogo != null) || (this.idCatalogo != null && !this.idCatalogo.equals(other.idCatalogo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + idCatalogo + "";
    }
    
}
