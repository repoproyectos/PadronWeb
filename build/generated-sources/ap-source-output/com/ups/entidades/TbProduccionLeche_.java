package com.ups.entidades;

import com.ups.entidades.TbFamilia;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbProduccionLeche.class)
public class TbProduccionLeche_ { 

    public static volatile SingularAttribute<TbProduccionLeche, TbFamilia> idFamilia;
    public static volatile SingularAttribute<TbProduccionLeche, Integer> idProduccionLeche;
    public static volatile SingularAttribute<TbProduccionLeche, Date> fechaReg;
    public static volatile SingularAttribute<TbProduccionLeche, BigDecimal> produccionDiariaLeche;

}