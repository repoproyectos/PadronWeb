package com.ups.entidades;

import com.ups.entidades.TbProduccionAgricola;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbCultivo.class)
public class TbCultivo_ { 

    public static volatile SingularAttribute<TbCultivo, String> tipoCultivo;
    public static volatile ListAttribute<TbCultivo, TbProduccionAgricola> tbProduccionAgricolaList;
    public static volatile SingularAttribute<TbCultivo, Integer> idCultivo;

}