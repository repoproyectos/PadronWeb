package com.ups.controladores;

import com.ups.entidades.TbPorcentajeRiego;
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

@Named("tbPorcentajeRiegoController")
@SessionScoped
public class TbPorcentajeRiegoController implements Serializable {

    @EJB
    private com.ups.controladores.TbPorcentajeRiegoFacade ejbFacade;
    private List<TbPorcentajeRiego> items = null;
    private TbPorcentajeRiego selected;

    public TbPorcentajeRiegoController() {
    }

    public TbPorcentajeRiego getSelected() {
        return selected;
    }

    public void setSelected(TbPorcentajeRiego selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TbPorcentajeRiegoFacade getFacade() {
        return ejbFacade;
    }

    public TbPorcentajeRiego prepareCreate() {
        selected = new TbPorcentajeRiego();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("TbPorcentajeRiegoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("TbPorcentajeRiegoUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("TbPorcentajeRiegoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<TbPorcentajeRiego> getItems() {
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

    public TbPorcentajeRiego getTbPorcentajeRiego(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<TbPorcentajeRiego> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<TbPorcentajeRiego> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = TbPorcentajeRiego.class)
    public static class TbPorcentajeRiegoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TbPorcentajeRiegoController controller = (TbPorcentajeRiegoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tbPorcentajeRiegoController");
            return controller.getTbPorcentajeRiego(getKey(value));
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
            if (object instanceof TbPorcentajeRiego) {
                TbPorcentajeRiego o = (TbPorcentajeRiego) object;
                return getStringKey(o.getIdPorcentajeRiego());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), TbPorcentajeRiego.class.getName()});
                return null;
            }
        }

    }

}
