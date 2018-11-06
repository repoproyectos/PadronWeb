package com.ups.entidades;

import com.ups.entidades.TbDatosPersonales;
import com.ups.entidades.TbLote;
import com.ups.entidades.TbParroquia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbComunidad.class)
public class TbComunidad_ { 

    public static volatile SingularAttribute<TbComunidad, String> nomComunidad;
    public static volatile ListAttribute<TbComunidad, TbDatosPersonales> tbDatosPersonalesList;
    public static volatile SingularAttribute<TbComunidad, Integer> idComunidad;
    public static volatile ListAttribute<TbComunidad, TbLote> tbLoteList;
    public static volatile SingularAttribute<TbComunidad, TbParroquia> idParroquia;

}