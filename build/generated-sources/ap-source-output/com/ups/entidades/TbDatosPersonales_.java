package com.ups.entidades;

import com.ups.entidades.TbActividadPrincipal;
import com.ups.entidades.TbComunidad;
import com.ups.entidades.TbDatosConyugue;
import com.ups.entidades.TbDatosHijo;
import com.ups.entidades.TbEstadoCivil;
import com.ups.entidades.TbFamilia;
import com.ups.entidades.TbNivelInstruccion;
import com.ups.entidades.TbSexo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbDatosPersonales.class)
public class TbDatosPersonales_ { 

    public static volatile SingularAttribute<TbDatosPersonales, String> apellidos;
    public static volatile SingularAttribute<TbDatosPersonales, TbEstadoCivil> idEstadoCivil;
    public static volatile SingularAttribute<TbDatosPersonales, TbNivelInstruccion> idNivelInstruccion;
    public static volatile SingularAttribute<TbDatosPersonales, String> cedula;
    public static volatile SingularAttribute<TbDatosPersonales, Integer> idDatosPersonales;
    public static volatile SingularAttribute<TbDatosPersonales, TbActividadPrincipal> idActividadPrincipal;
    public static volatile SingularAttribute<TbDatosPersonales, TbComunidad> idComunidad;
    public static volatile SingularAttribute<TbDatosPersonales, Integer> edad;
    public static volatile SingularAttribute<TbDatosPersonales, String> nombres;
    public static volatile SingularAttribute<TbDatosPersonales, String> numTelMovil;
    public static volatile SingularAttribute<TbDatosPersonales, String> numTelFijo;
    public static volatile SingularAttribute<TbDatosPersonales, TbSexo> idSexo;
    public static volatile SingularAttribute<TbDatosPersonales, Date> fechaReg;
    public static volatile SingularAttribute<TbDatosPersonales, TbDatosConyugue> idDatosConyugue;
    public static volatile ListAttribute<TbDatosPersonales, TbFamilia> tbFamiliaList;
    public static volatile SingularAttribute<TbDatosPersonales, String> jefeHogar;
    public static volatile ListAttribute<TbDatosPersonales, TbDatosHijo> tbDatosHijoList;

}