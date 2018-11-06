package com.ups.entidades;

import com.ups.entidades.TbDatosPersonales;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbEstadoCivil.class)
public class TbEstadoCivil_ { 

    public static volatile SingularAttribute<TbEstadoCivil, Integer> idEstadoCivil;
    public static volatile SingularAttribute<TbEstadoCivil, String> tipoEstadoCivil;
    public static volatile ListAttribute<TbEstadoCivil, TbDatosPersonales> tbDatosPersonalesList;

}