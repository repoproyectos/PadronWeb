package com.ups.entidades;

import com.ups.entidades.TbPorcentajeRiego;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbMetodoRiego.class)
public class TbMetodoRiego_ { 

    public static volatile SingularAttribute<TbMetodoRiego, Integer> idMetodoRiego;
    public static volatile SingularAttribute<TbMetodoRiego, String> tipoMetodo;
    public static volatile ListAttribute<TbMetodoRiego, TbPorcentajeRiego> tbPorcentajeRiegoList;

}