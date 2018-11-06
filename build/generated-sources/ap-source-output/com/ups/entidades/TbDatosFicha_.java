package com.ups.entidades;

import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbUsuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbDatosFicha.class)
public class TbDatosFicha_ { 

    public static volatile SingularAttribute<TbDatosFicha, TbFamilia> idFamilia;
    public static volatile SingularAttribute<TbDatosFicha, TbUsuario> idUsuario;
    public static volatile SingularAttribute<TbDatosFicha, String> nombreEncuestador;
    public static volatile SingularAttribute<TbDatosFicha, Date> fechaEncuesta;
    public static volatile SingularAttribute<TbDatosFicha, Integer> idDatosFicha;

}