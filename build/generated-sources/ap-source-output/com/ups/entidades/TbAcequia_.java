package com.ups.entidades;

import com.ups.entidades.TbLote;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbAcequia.class)
public class TbAcequia_ { 

    public static volatile SingularAttribute<TbAcequia, Integer> idAcequia;
    public static volatile SingularAttribute<TbAcequia, String> nomAcequia;
    public static volatile ListAttribute<TbAcequia, TbLote> tbLoteList;

}