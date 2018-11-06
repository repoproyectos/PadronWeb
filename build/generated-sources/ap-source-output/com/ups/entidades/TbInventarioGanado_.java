package com.ups.entidades;

import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbGanado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbInventarioGanado.class)
public class TbInventarioGanado_ { 

    public static volatile SingularAttribute<TbInventarioGanado, TbFamilia> idFamilia;
    public static volatile SingularAttribute<TbInventarioGanado, Integer> numGanado;
    public static volatile SingularAttribute<TbInventarioGanado, Date> fechaReg;
    public static volatile SingularAttribute<TbInventarioGanado, Integer> idInventarioGanado;
    public static volatile SingularAttribute<TbInventarioGanado, TbGanado> idGanado;

}