package com.ups.entidades;

import com.ups.entidades.TbLote;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbOvalo.class)
public class TbOvalo_ { 

    public static volatile SingularAttribute<TbOvalo, Integer> idOvalo;
    public static volatile SingularAttribute<TbOvalo, String> nomOvalo;
    public static volatile ListAttribute<TbOvalo, TbLote> tbLoteList;

}