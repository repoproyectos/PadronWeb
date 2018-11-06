package com.ups.entidades;

import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbLote;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbTenenciaTierra.class)
public class TbTenenciaTierra_ { 

    public static volatile SingularAttribute<TbTenenciaTierra, TbFamilia> idFamilia;
    public static volatile SingularAttribute<TbTenenciaTierra, Date> fechaReg;
    public static volatile SingularAttribute<TbTenenciaTierra, String> propietario;
    public static volatile SingularAttribute<TbTenenciaTierra, String> estadoTierra;
    public static volatile SingularAttribute<TbTenenciaTierra, Integer> idTenenciaTierra;
    public static volatile SingularAttribute<TbTenenciaTierra, TbLote> idLote;

}