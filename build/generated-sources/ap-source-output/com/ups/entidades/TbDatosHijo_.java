package com.ups.entidades;

import com.ups.entidades.TbActividadPrincipal;
import com.ups.entidades.TbDatosConyugue;
import com.ups.entidades.TbDatosPersonales;
import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbNivelInstruccion;
import com.ups.entidades.TbSexo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbDatosHijo.class)
public class TbDatosHijo_ { 

    public static volatile SingularAttribute<TbDatosHijo, TbFamilia> idFamilia;
    public static volatile SingularAttribute<TbDatosHijo, TbNivelInstruccion> idNivelInstruccion;
    public static volatile SingularAttribute<TbDatosHijo, String> apellidosHijo;
    public static volatile SingularAttribute<TbDatosHijo, Integer> edadHijo;
    public static volatile SingularAttribute<TbDatosHijo, TbActividadPrincipal> idActividadPrincipal;
    public static volatile SingularAttribute<TbDatosHijo, TbDatosPersonales> idDatosPersonales;
    public static volatile SingularAttribute<TbDatosHijo, TbSexo> idSexo;
    public static volatile SingularAttribute<TbDatosHijo, Date> fechaReg;
    public static volatile SingularAttribute<TbDatosHijo, TbDatosConyugue> idDatosConyugue;
    public static volatile SingularAttribute<TbDatosHijo, Integer> idDatosHijo;
    public static volatile SingularAttribute<TbDatosHijo, String> cedulaHijo;
    public static volatile SingularAttribute<TbDatosHijo, String> dependiente;
    public static volatile SingularAttribute<TbDatosHijo, String> nombresHijo;

}