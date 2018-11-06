/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ups.beans;

import com.ups.controladores.TbDatosPersonalesFacade;
import com.ups.controladores.TbUsuarioFacade;
import com.ups.entidades.TbDatosConyugue;
import com.ups.entidades.TbDatosHijo;
import com.ups.entidades.TbDatosPersonales;
import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbLote;
import com.ups.entidades.TbPorcentajeRiego;
import com.ups.entidades.TbProduccionAgricola;
import com.ups.entidades.TbProduccionLeche;
import com.ups.entidades.TbProduccionPecuario;
import com.ups.entidades.TbTenenciaTierra;
import com.ups.entidades.TbTurnoRiego;
import com.ups.entidades.TbUsuario;
import com.ups.entidades.TbValorTarifa;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author FAMILIA
 */
@Named(value = "fichaBean")
@SessionScoped
public class FichaBean implements Serializable {

    
    private String cedulaHijo;

    public String getCedulaHijo() {
        return cedulaHijo;
    }

    public void setCedulaHijo(String cedulaHijo) {
        this.cedulaHijo = cedulaHijo;
    }
    private com.ups.controladores.TbDatosPersonalesFacade ejbFacade;
    private List<TbDatosPersonales> items = null;
    private TbDatosPersonales selected;
    private TbDatosHijo selectedhijo = new TbDatosHijo();
    private TbDatosConyugue selectedconyuge;
    private TbFamilia selectedfamilia;
    private TbLote selectedlote;
    private TbTenenciaTierra selectedtenencia;
    private TbPorcentajeRiego selectedporcentajeriego;
    private TbTurnoRiego selectedturnoriego;
    private TbValorTarifa selectedvalortarifa;
    
    private TbProduccionAgricola selectedproduccionagricola;
    private TbProduccionLeche selectedproduccionleche;
    private TbProduccionPecuario selectedproduccionpecuario;

    public TbDatosPersonalesFacade getEjbFacade() {
        return ejbFacade;
    }

    public void setEjbFacade(TbDatosPersonalesFacade ejbFacade) {
        this.ejbFacade = ejbFacade;
    }

    public List<TbDatosPersonales> getItems() {
        return items;
    }

    public void setItems(List<TbDatosPersonales> items) {
        this.items = items;
    }

    public TbDatosPersonales getSelected() {
        return selected;
    }

    public void setSelected(TbDatosPersonales selected) {
        this.selected = selected;
    }

    public TbDatosHijo getSelectedhijo() {
        return selectedhijo;
    }

    public void setSelectedhijo(TbDatosHijo selectedhijo) {
        this.selectedhijo = selectedhijo;
    }

    public TbDatosConyugue getSelectedconyuge() {
        return selectedconyuge;
    }

    public void setSelectedconyuge(TbDatosConyugue selectedconyuge) {
        this.selectedconyuge = selectedconyuge;
    }

    public TbFamilia getSelectedfamilia() {
        return selectedfamilia;
    }

    public void setSelectedfamilia(TbFamilia selectedfamilia) {
        this.selectedfamilia = selectedfamilia;
    }

    public TbLote getSelectedlote() {
        return selectedlote;
    }

    public void setSelectedlote(TbLote selectedlote) {
        this.selectedlote = selectedlote;
    }

    public TbTenenciaTierra getSelectedtenencia() {
        return selectedtenencia;
    }

    public void setSelectedtenencia(TbTenenciaTierra selectedtenencia) {
        this.selectedtenencia = selectedtenencia;
    }

    public TbPorcentajeRiego getSelectedporcentajeriego() {
        return selectedporcentajeriego;
    }

    public void setSelectedporcentajeriego(TbPorcentajeRiego selectedporcentajeriego) {
        this.selectedporcentajeriego = selectedporcentajeriego;
    }

    public TbTurnoRiego getSelectedturnoriego() {
        return selectedturnoriego;
    }

    public void setSelectedturnoriego(TbTurnoRiego selectedturnoriego) {
        this.selectedturnoriego = selectedturnoriego;
    }

    public TbValorTarifa getSelectedvalortarifa() {
        return selectedvalortarifa;
    }

    public void setSelectedvalortarifa(TbValorTarifa selectedvalortarifa) {
        this.selectedvalortarifa = selectedvalortarifa;
    }

    public TbProduccionAgricola getSelectedproduccionagricola() {
        return selectedproduccionagricola;
    }

    public void setSelectedproduccionagricola(TbProduccionAgricola selectedproduccionagricola) {
        this.selectedproduccionagricola = selectedproduccionagricola;
    }

    public TbProduccionLeche getSelectedproduccionleche() {
        return selectedproduccionleche;
    }

    public void setSelectedproduccionleche(TbProduccionLeche selectedproduccionleche) {
        this.selectedproduccionleche = selectedproduccionleche;
    }

    public TbProduccionPecuario getSelectedproduccionpecuario() {
        return selectedproduccionpecuario;
    }

    public void setSelectedproduccionpecuario(TbProduccionPecuario selectedproduccionpecuario) {
        this.selectedproduccionpecuario = selectedproduccionpecuario;
    }
    
    public List agregarHijo(){
        TbDatosHijo selectedhijo2 = new TbDatosHijo();
        selectedhijo2.setApellidosHijo("ORTEGA");
        selectedhijo2.setCedulaHijo(cedulaHijo);
        selectedhijo2.setNombresHijo(this.selectedhijo.getNombresHijo());
        //selectedhijo2.setIdDatosPersonales(selected);
        
        this.selected.tbDatosHijoList.add(selectedhijo2);
        
        //this.selectedhijo.setIdDatosPersonales(selected);
        return this.selected.tbDatosHijoList;
    }
    
    
    public FichaBean() {
    }
   
    
}
