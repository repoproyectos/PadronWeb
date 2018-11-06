package com.ups.controladores;

import com.ups.entidades.TbTipoAspersor;
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

@Named("tbTipoAspersorController")
@SessionScoped
public class TbTipoAspersorController implements Serializable {

    @EJB
    private com.ups.controladores.TbTipoAspersorFacade ejbFacade;
    private List<TbTipoAspersor> items = null;
    private TbTipoAspersor selected;

    public TbTipoAspersorController() {
    }

    public TbTipoAspersor getSelected() {
        return selected;
    }

    public void setSelected(TbTipoAspersor selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TbTipoAspersorFacade getFacade() {
        return ejbFacade;
    }

    public TbTipoAspersor prepareCreate() {
        selected = new TbTipoAspersor();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TbTipoAspersorCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TbTipoAspersorUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TbTipoAspersorDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<TbTipoAspersor> getItems() {
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

    public TbTipoAspersor getTbTipoAspersor(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<TbTipoAspersor> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<TbTipoAspersor> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = TbTipoAspersor.class)
    public static class TbTipoAspersorControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TbTipoAspersorController controller = (TbTipoAspersorController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tbTipoAspersorController");
            return controller.getTbTipoAspersor(getKey(value));
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
            if (object instanceof TbTipoAspersor) {
                TbTipoAspersor o = (TbTipoAspersor) object;
                return getStringKey(o.getIdTipoAspersor());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), TbTipoAspersor.class.getName()});
                return null;
            }
        }

    }

}
