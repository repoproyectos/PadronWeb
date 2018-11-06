package com.ups.controladores;

import com.ups.entidades.TbDatosPersonales;
import com.ups.controladores.util.JsfUtil;
import com.ups.controladores.util.JsfUtil.PersistAction;
import com.ups.entidades.TbDatosConyugue;
import com.ups.entidades.TbDatosHijo;
import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbGanado;
import com.ups.entidades.TbInventarioGanado;
import com.ups.entidades.TbLote;
import com.ups.entidades.TbPorcentajeRiego;
import com.ups.entidades.TbProduccionAgricola;
import com.ups.entidades.TbProduccionLeche;
import com.ups.entidades.TbProduccionPecuario;
import com.ups.entidades.TbTenenciaTierra;
import com.ups.entidades.TbTurnoRiego;
import com.ups.entidades.TbUsuario;
import com.ups.entidades.TbValorTarifa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.primefaces.context.RequestContext;

@Named("tbDatosPersonalesController")
@SessionScoped
public class TbDatosPersonalesController implements Serializable {

    @EJB
    private com.ups.controladores.TbDatosPersonalesFacade ejbFacade;
    private List<TbDatosPersonales> items = null;
    private TbDatosPersonales selected;
    private TbDatosHijo selectedhijo;
    private TbDatosConyugue selectedconyuge;
    private TbFamilia selectedfamilia;
    private TbLote selectedlote;
    private TbTenenciaTierra selectedtenencia;
    private TbTenenciaTierra tenencia_seleccionada;

    public TbTenenciaTierra getTenencia_seleccionada() {
        return tenencia_seleccionada;
    }

    public void setTenencia_seleccionada(TbTenenciaTierra tenencia_seleccionada) {
        this.tenencia_seleccionada = tenencia_seleccionada;
    }
    private TbPorcentajeRiego selectedporcentajeriego;
    private TbTurnoRiego selectedturnoriego;
    private TbValorTarifa selectedvalortarifa;
    
    private TbProduccionAgricola selectedproduccionagricola;
    private TbProduccionLeche selectedproduccionleche;
    private TbProduccionPecuario selectedproduccionpecuario;
    private TbInventarioGanado selectedinventarioganado;
    

    public void H2M(){
        this.selectedlote.setAreaTotalM(new BigDecimal(this.selectedlote.getAreaTotalH().doubleValue()* 10000 , MathContext.DECIMAL64));
    }
    public void M2H(){
        this.selectedlote.setAreaTotalH(new BigDecimal( this.selectedlote.getAreaTotalM().doubleValue() / 10000, MathContext.DECIMAL64));
    }
    
    public void H2M2(){
        this.selectedlote.setAreaRiegoM(new BigDecimal(this.selectedlote.getAreaRiegoH().doubleValue()* 10000 , MathContext.DECIMAL64));
    }
    public void M2H2(){
        this.selectedlote.setAreaRiegoH(new BigDecimal( this.selectedlote.getAreaRiegoM().doubleValue() / 10000, MathContext.DECIMAL64));
    }
    
    private String nombreHijo;
    
    public TbProduccionAgricola getSelectedproduccionagricola() {
        return selectedproduccionagricola;
    }

    public void setSelectedproduccionagricola(TbProduccionAgricola selectedproduccionagricola) {
        this.selectedproduccionagricola = selectedproduccionagricola;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
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

    public TbInventarioGanado getSelectedinventarioganado() {
        return selectedinventarioganado;
    }

    public void setSelectedinventarioganado(TbInventarioGanado selectedinventarioganado) {
        this.selectedinventarioganado = selectedinventarioganado;
    }

    public TbValorTarifa getSelectedvalortarifa() {
        return selectedvalortarifa;
    }

    public void setSelectedvalortarifa(TbValorTarifa selectedvalortarifa) {
        this.selectedvalortarifa = selectedvalortarifa;
    }

    public TbTurnoRiego getSelectedturnoriego() {
        return selectedturnoriego;
    }

    public void setSelectedturnoriego(TbTurnoRiego selectedturnoriego) {
        this.selectedturnoriego = selectedturnoriego;
    }

    public TbPorcentajeRiego getSelectedporcentajeriego() {
        return selectedporcentajeriego;
    }

    public void setSelectedporcentajeriego(TbPorcentajeRiego selectedporcentajeriego) {
        this.selectedporcentajeriego = selectedporcentajeriego;
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

    public TbDatosPersonalesController() {
    }

    public TbDatosPersonales getSelected() {
        return selected;
    }

    public void setSelected(TbDatosPersonales selected) {
        this.selected = selected;
    }
    public TbDatosHijo getSelectedHijo() {
        return selectedhijo;
    }

    public void setSelectedHijo(TbDatosHijo selected) {
        this.selectedhijo = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TbDatosPersonalesFacade getFacade() {
        return ejbFacade;
    }
    public List agregarHijo(){
        this.selectedhijo.setIdDatosPersonales(this.selected);
        this.selected.tbDatosHijoList.add(selectedhijo);
        this.selectedhijo = new TbDatosHijo();
        this.selectedhijo.setIdDatosPersonales(selected);
        return this.selected.tbDatosHijoList;
    }
    public List agregarTenencia(){
        this.selectedporcentajeriego.setIdLote(selectedlote);
        this.selectedturnoriego.setIdLote(selectedlote);
        this.selectedtenencia.setIdLote(selectedlote);
        this.selectedvalortarifa.setIdLote(selectedlote);
        this.selectedfamilia.tbTenenciaTierraList.add(selectedtenencia);
        this.selectedlote = new TbLote();
        this.selectedtenencia = new TbTenenciaTierra();
        this.selectedtenencia.setIdFamilia(this.selectedfamilia);
        //this.selectedtenencia.setIdLote(this.selectedlote);
        this.selectedlote.tbProduccionAgricolaList = new ArrayList<>();
        return this.selectedfamilia.tbTenenciaTierraList;
    }
    public List agregarProduccionAgricola(){
        System.out.print("jojo");
        
        //System.out.print(tenencia_seleccionada);
        //this.selectedlote.tbProduccionAgricolaList.add(selectedproduccionagricola);
        this.selectedlote = selectedproduccionagricola.getIdLote();
        this.selectedlote.tbProduccionAgricolaList.add(selectedproduccionagricola);
        this.selectedproduccionagricola = new TbProduccionAgricola();
        return this.selectedlote.tbProduccionAgricolaList;
    }
    public List agregarProduccionPecuaria(){
        this.selectedproduccionpecuario.setIdFamilia(selectedfamilia);
        this.selectedfamilia.tbProduccionPecuarioList.add(selectedproduccionpecuario);
        this.selectedproduccionpecuario = new TbProduccionPecuario();
        return this.selectedfamilia.tbProduccionPecuarioList;
    }
    public List agregarInventarioGanado(){
        this.selectedinventarioganado.setIdFamilia(selectedfamilia);
        this.selectedfamilia.tbInventarioGanadoList.add(selectedinventarioganado);
        this.selectedinventarioganado = new TbInventarioGanado();
        return this.selectedfamilia.tbInventarioGanadoList;
    }
    
    public void prepareCreate() {
        this.selected = new TbDatosPersonales();
        initializeEmbeddableKey();
        this.selected.tbDatosHijoList = new ArrayList<>();
        this.selected.tbFamiliaList = new ArrayList<>();
    }
    
    public void prepareCreateHijo() {
        this.selectedhijo = new TbDatosHijo();
        this.selectedhijo.setIdDatosPersonales(selected);
    }
    public void prepareCreateC() {
        this.selectedconyuge = new TbDatosConyugue();
        this.selectedconyuge.setIdDatosPersonales(selected);
    }
    public void prepareCreateFamilia() {
        this.selectedfamilia = new TbFamilia();
        this.selectedfamilia.setIdDatosPersonales(selected);
        this.selectedfamilia.setIdDatosConyugue(selectedconyuge);
        this.selectedfamilia.tbTenenciaTierraList = new ArrayList<>();
        this.selectedtenencia = new TbTenenciaTierra();
        this.selectedtenencia.setIdFamilia(selectedfamilia);
        this.selectedlote = new TbLote();
        this.selectedtenencia.setIdLote(selectedlote);
        this.selectedporcentajeriego = new TbPorcentajeRiego();
        this.selectedturnoriego = new TbTurnoRiego();
        this.selectedvalortarifa = new TbValorTarifa();
        
        this.selectedproduccionagricola = new TbProduccionAgricola();
        this.selectedlote.tbProduccionAgricolaList = new ArrayList<>();
        
        this.selectedproduccionpecuario = new TbProduccionPecuario();
        this.selectedfamilia.tbProduccionPecuarioList = new ArrayList<>();
        this.selectedproduccionpecuario.setIdFamilia(selectedfamilia);
        
        this.selectedproduccionleche = new TbProduccionLeche();
        this.selectedfamilia.tbProduccionLecheList = new ArrayList<>();
        
        this.selectedproduccionleche.setIdFamilia(selectedfamilia);
        this.selectedfamilia.tbProduccionLecheList.add(selectedproduccionleche);
        
        this.selectedinventarioganado = new TbInventarioGanado();
        this.selectedfamilia.tbInventarioGanadoList = new ArrayList<>();
        this.selectedinventarioganado.setIdFamilia(selectedfamilia);
        
        
        this.selected.tbFamiliaList.add(selectedfamilia);
        
    }
    public void create() {
        this.selected.setIdDatosConyugue(this.selectedconyuge);
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TbDatosPersonalesCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TbDatosPersonalesUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TbDatosPersonalesDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<TbDatosPersonales> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public TbDatosPersonales getTbDatosPersonales(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<TbDatosPersonales> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<TbDatosPersonales> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = TbDatosPersonales.class)
    public static class TbDatosPersonalesControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TbDatosPersonalesController controller = (TbDatosPersonalesController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tbDatosPersonalesController");
            return controller.getTbDatosPersonales(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof TbDatosPersonales) {
                TbDatosPersonales o = (TbDatosPersonales) object;
                return getStringKey(o.getIdDatosPersonales());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), TbDatosPersonales.class.getName()});
                return null;
            }
        }

    }
  

}
