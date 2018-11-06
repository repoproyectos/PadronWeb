/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.controladores;

import com.ups.entidades.TbUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author FAMILIA
 */
@Stateless
public class TbUsuarioFacade extends AbstractFacade<TbUsuario> {

    @PersistenceContext(unitName = "PadronWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbUsuarioFacade() {
        super(TbUsuario.class);
    }
    
    public TbUsuario valida(String nombre){
        
        
        Query q = em.createNamedQuery("TbUsuario.findByNomUsuario", TbUsuario.class).setParameter("nomUsuario", nombre);
        List<TbUsuario> listado = q.getResultList();
        if(!listado.isEmpty()){
            return listado.get(0);
        }
        return null;
    }
}
