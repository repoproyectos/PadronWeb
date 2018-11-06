package com.ups.entidades;

import com.ups.entidades.TbCanton;
import com.ups.entidades.TbComunidad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbParroquia.class)
public class TbParroquia_ { 

    public static volatile SingularAttribute<TbParroquia, String> nomParroquia;
    public static volatile SingularAttribute<TbParroquia, TbCanton> idCanton;
    public static volatile ListAttribute<TbParroquia, TbComunidad> tbComunidadList;
    public static volatile SingularAttribute<TbParroquia, Integer> idParroquia;

}