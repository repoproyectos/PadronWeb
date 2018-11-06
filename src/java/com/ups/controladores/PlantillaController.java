
package com.ups.controladores;

import com.ups.entidades.TbUsuario;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("plantillaController")
@ViewScoped
public class PlantillaController implements Serializable{
    
        public void verficarSesion(){
        try{
            TbUsuario usuario = (TbUsuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
            if(usuario == null){
                FacesContext.getCurrentInstance().getExternalContext().redirect("inicio.xhtml");
            }
        }catch(Exception e){
            
        }
    }
    
    
}
