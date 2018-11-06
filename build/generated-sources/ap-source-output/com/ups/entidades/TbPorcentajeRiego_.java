package com.ups.entidades;

import com.ups.entidades.TbLote;
import com.ups.entidades.TbMetodoRiego;
import com.ups.entidades.TbTipoAspersor;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbPorcentajeRiego.class)
public class TbPorcentajeRiego_ { 

    public static volatile SingularAttribute<TbPorcentajeRiego, TbTipoAspersor> idTipoAspersor;
    public static volatile SingularAttribute<TbPorcentajeRiego, Integer> idPorcentajeRiego;
    public static volatile SingularAttribute<TbPorcentajeRiego, Date> fechaReg;
    public static volatile SingularAttribute<TbPorcentajeRiego, TbMetodoRiego> idMetodoRiego;
    public static volatile SingularAttribute<TbPorcentajeRiego, Integer> porcentaje;
    public static volatile SingularAttribute<TbPorcentajeRiego, TbLote> idLote;
    public static volatile SingularAttribute<TbPorcentajeRiego, Integer> numAspersoresSitio;

}