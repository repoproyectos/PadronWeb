package com.ups.entidades;

import com.ups.entidades.TbTurnoRiego;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbFrecuenciaRiego.class)
public class TbFrecuenciaRiego_ { 

    public static volatile SingularAttribute<TbFrecuenciaRiego, Integer> idFrecuenciaRiego;
    public static volatile ListAttribute<TbFrecuenciaRiego, TbTurnoRiego> tbTurnoRiegoList;
    public static volatile SingularAttribute<TbFrecuenciaRiego, String> tipoFrecuencia;

}