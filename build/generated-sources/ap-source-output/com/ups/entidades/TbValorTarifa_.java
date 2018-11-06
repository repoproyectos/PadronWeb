package com.ups.entidades;

import com.ups.entidades.TbLote;
import com.ups.entidades.TbTipoTarifa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbValorTarifa.class)
public class TbValorTarifa_ { 

    public static volatile SingularAttribute<TbValorTarifa, Date> fechaReg;
    public static volatile SingularAttribute<TbValorTarifa, TbTipoTarifa> idTipoTarifa;
    public static volatile SingularAttribute<TbValorTarifa, BigDecimal> valorTarifa;
    public static volatile SingularAttribute<TbValorTarifa, Integer> idValorTarifa;
    public static volatile SingularAttribute<TbValorTarifa, TbLote> idLote;

}