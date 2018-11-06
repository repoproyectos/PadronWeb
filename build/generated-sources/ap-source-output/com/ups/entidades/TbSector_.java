package com.ups.entidades;

import com.ups.entidades.TbLote;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbSector.class)
public class TbSector_ { 

    public static volatile SingularAttribute<TbSector, String> nomSector;
    public static volatile SingularAttribute<TbSector, Integer> idSector;
    public static volatile ListAttribute<TbSector, TbLote> tbLoteList;

}