package com.ups.entidades;

import com.ups.entidades.TbParroquia;
import com.ups.entidades.TbProvincia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbCanton.class)
public class TbCanton_ { 

    public static volatile SingularAttribute<TbCanton, TbProvincia> idProvincia;
    public static volatile SingularAttribute<TbCanton, Integer> idCanton;
    public static volatile ListAttribute<TbCanton, TbParroquia> tbParroquiaList;
    public static volatile SingularAttribute<TbCanton, String> nomCanton;

}