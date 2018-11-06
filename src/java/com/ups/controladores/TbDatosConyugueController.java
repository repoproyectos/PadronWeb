package com.ups.controladores;

import com.ups.entidades.TbDatosConyugue;
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

@Named("tbDatosConyugueController")
@SessionScoped
public class TbDatosConyugueController implements Serializable {

    @EJB
    private com.ups.controladores.TbDatosConyugueFacade ejbFacade;
    private List<TbDatosConyugue> items = null;
    private TbDatosConyugue selected;

    public TbDatosConyugueController() {
    }

    public TbDatosConyugue getSelected() {
        return selected;
    }

    public void setSelected(TbDatosConyugue selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TbDatosConyugueFacade getFacade() {
        return ejbFacade;
    }

    public TbDatosConyugue prepareCreate() {
        selected = new TbDatosConyugue();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TbDatosConyugueCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TbDatosConyugueUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TbDatosConyugueDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<TbDatosConyugue> getItems() {
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

    public TbDatosConyugue getTbDatosConyugue(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<TbDatosConyugue> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<TbDatosConyugue> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = TbDatosConyugue.class)
    public static class TbDatosConyugueControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TbDatosConyugueController controller = (TbDatosConyugueController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tbDatosConyugueController");
            return controller.getTbDatosConyugue(getKey(value));
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
            if (object instanceof TbDatosConyugue) {
                TbDatosConyugue o = (TbDatosConyugue) object;
                return getStringKey(o.getIdDatosConyugue());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), TbDatosConyugue.class.getName()});
                return null;
            }
        }

    }

}
