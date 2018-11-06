package com.ups.entidades;

import com.ups.entidades.TbFrecuenciaRiego;
import com.ups.entidades.TbLote;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbTurnoRiego.class)
public class TbTurnoRiego_ { 

    public static volatile SingularAttribute<TbTurnoRiego, Date> fechaReg;
    public static volatile SingularAttribute<TbTurnoRiego, TbFrecuenciaRiego> idFrecuenciaRiego;
    public static volatile SingularAttribute<TbTurnoRiego, Integer> numDias;
    public static volatile SingularAttribute<TbTurnoRiego, Integer> idTurnoRiego;
    public static volatile SingularAttribute<TbTurnoRiego, Integer> horasTurno;
    public static volatile SingularAttribute<TbTurnoRiego, TbLote> idLote;

}