package com.ups.entidades;

import com.ups.entidades.TbDatosConyugue;
import com.ups.entidades.TbDatosHijo;
import com.ups.entidades.TbDatosPersonales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbActividadPrincipal.class)
public class TbActividadPrincipal_ { 

    public static volatile SingularAttribute<TbActividadPrincipal, String> nomActividadPrincipal;
    public static volatile ListAttribute<TbActividadPrincipal, TbDatosPersonales> tbDatosPersonalesList;
    public static volatile SingularAttribute<TbActividadPrincipal, Integer> idActividadPrincipal;
    public static volatile ListAttribute<TbActividadPrincipal, TbDatosConyugue> tbDatosConyugueList;
    public static volatile ListAttribute<TbActividadPrincipal, TbDatosHijo> tbDatosHijoList;

}