package com.ups.entidades;

import com.ups.entidades.TbActividadPrincipal;
import com.ups.entidades.TbDatosHijo;
import com.ups.entidades.TbDatosPersonales;
import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbNivelInstruccion;
import com.ups.entidades.TbSexo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:49")
@StaticMetamodel(TbDatosConyugue.class)
public class TbDatosConyugue_ { 

    public static volatile SingularAttribute<TbDatosConyugue, String> cedulaConyugue;
    public static volatile SingularAttribute<TbDatosConyugue, String> nombresConyugue;
    public static volatile SingularAttribute<TbDatosConyugue, TbNivelInstruccion> idNivelInstruccion;
    public static volatile ListAttribute<TbDatosConyugue, TbDatosPersonales> tbDatosPersonalesList;
    public static volatile SingularAttribute<TbDatosConyugue, Integer> edadConyugue;
    public static volatile SingularAttribute<TbDatosConyugue, TbActividadPrincipal> idActividadPrincipal;
    public static volatile SingularAttribute<TbDatosConyugue, TbDatosPersonales> idDatosPersonales;
    public static volatile SingularAttribute<TbDatosConyugue, TbSexo> idSexo;
    public static volatile SingularAttribute<TbDatosConyugue, Integer> idDatosConyugue;
    public static volatile SingularAttribute<TbDatosConyugue, Date> fechaReg;
    public static volatile SingularAttribute<TbDatosConyugue, String> apellidosConyugue;
    public static volatile ListAttribute<TbDatosConyugue, TbFamilia> tbFamiliaList;
    public static volatile ListAttribute<TbDatosConyugue, TbDatosHijo> tbDatosHijoList;

}