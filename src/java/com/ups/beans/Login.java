/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.beans;

import com.ups.controladores.TbUsuarioFacade;
import com.ups.entidades.TbUsuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author FAMILIA
 */
@Named(value = "loginbean")
@SessionScoped
public class Login implements Serializable {

    private String nombre;
    private String contrasena;
    
    @EJB
    private TbUsuarioFacade UsuFacade;
    private TbUsuario UsuAutenticado;

    public TbUsuario getUsuAutenticado() {
        return UsuAutenticado;
    }

    public void setUsuAutenticado(TbUsuario UsuAutenticado) {
        this.UsuAutenticado = UsuAutenticado;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    /**
     * Creates a new instance of Login
     */
    public Login() {
    }
    
    public String autenticar(){
        
        UsuAutenticado = UsuFacade.valida(nombre);
        if(UsuAutenticado!=null){
            if(UsuAutenticado.getContrasena().equals(contrasena))
            {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario",UsuAutenticado);
                return "ok";
            }
            else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Contraseña incorrecta", "Contraseña incorrecta"));
            return null;
            }
            
            
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "No existe el usuario", "No existe el usuario"));
            return null;
        }
    }
    public void cerrarsesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
    
}
