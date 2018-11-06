package com.ups.entidades;

import com.ups.entidades.TbCanton;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbProvincia.class)
public class TbProvincia_ { 

    public static volatile SingularAttribute<TbProvincia, Integer> idProvincia;
    public static volatile SingularAttribute<TbProvincia, String> nomProvincia;
    public static volatile ListAttribute<TbProvincia, TbCanton> tbCantonList;

}