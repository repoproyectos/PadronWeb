package com.ups.entidades;

import com.ups.entidades.TbDatosConyugue;
import com.ups.entidades.TbDatosHijo;
import com.ups.entidades.TbDatosPersonales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbNivelInstruccion.class)
public class TbNivelInstruccion_ { 

    public static volatile SingularAttribute<TbNivelInstruccion, Integer> idNivelInstruccion;
    public static volatile SingularAttribute<TbNivelInstruccion, String> tipoInstruccion;
    public static volatile ListAttribute<TbNivelInstruccion, TbDatosPersonales> tbDatosPersonalesList;
    public static volatile ListAttribute<TbNivelInstruccion, TbDatosConyugue> tbDatosConyugueList;
    public static volatile ListAttribute<TbNivelInstruccion, TbDatosHijo> tbDatosHijoList;

}