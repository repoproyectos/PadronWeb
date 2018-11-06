package com.ups.entidades;

import com.ups.entidades.TbCultivo;
import com.ups.entidades.TbLote;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbProduccionAgricola.class)
public class TbProduccionAgricola_ { 

    public static volatile SingularAttribute<TbProduccionAgricola, BigDecimal> superficieCultivo;
    public static volatile SingularAttribute<TbProduccionAgricola, Date> fechaReg;
    public static volatile SingularAttribute<TbProduccionAgricola, Integer> idProduccionAgricola;
    public static volatile SingularAttribute<TbProduccionAgricola, TbCultivo> idCultivo;
    public static volatile SingularAttribute<TbProduccionAgricola, TbLote> idLote;

}