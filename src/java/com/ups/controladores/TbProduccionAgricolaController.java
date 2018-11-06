package com.ups.controladores;

import com.ups.entidades.TbProduccionAgricola;
import com.ups.controladores.util.JsfUtil;
import com.ups.controladores.util.JsfUtil.PersistAction;

import java.io.Serializable;
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

@Named("tbProduccionAgricolaController")
@SessionScoped
public class TbProduccionAgricolaController implements Serializable {

    @EJB
    private com.ups.controladores.TbProduccionAgricolaFacade ejbFacade;
    private List<TbProduccionAgricola> items = null;
    private TbProduccionAgricola selected;

    public TbProduccionAgricolaController() {
    }

    public TbProduccionAgricola getSelected() {
        return selected;
    }

    public void setSelected(TbProduccionAgricola selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TbProduccionAgricolaFacade getFacade() {
        return ejbFacade;
    }

    public TbProduccionAgricola prepareCreate() {
        selected = new TbProduccionAgricola();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TbProduccionAgricolaCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TbProduccionAgricolaUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TbProduccionAgricolaDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<TbProduccionAgricola> getItems() {
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

    public TbProduccionAgricola getTbProduccionAgricola(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<TbProduccionAgricola> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<TbProduccionAgricola> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = TbProduccionAgricola.class)
    public static class TbProduccionAgricolaControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TbProduccionAgricolaController controller = (TbProduccionAgricolaController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tbProduccionAgricolaController");
            return controller.getTbProduccionAgricola(getKey(value));
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
            if (object instanceof TbProduccionAgricola) {
                TbProduccionAgricola o = (TbProduccionAgricola) object;
                return getStringKey(o.getIdProduccionAgricola());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), TbProduccionAgricola.class.getName()});
                return null;
            }
        }

    }

}
