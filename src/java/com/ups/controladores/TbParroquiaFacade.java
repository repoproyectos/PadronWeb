/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.controladores;

import com.ups.entidades.TbParroquia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FAMILIA
 */
@Stateless
public class TbParroquiaFacade extends AbstractFacade<TbParroquia> {

    @PersistenceContext(unitName = "PadronWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbParroquiaFacade() {
        super(TbParroquia.class);
    }
    
}
