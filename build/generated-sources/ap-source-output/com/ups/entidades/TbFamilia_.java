package com.ups.entidades;

import com.ups.entidades.TbDatosConyugue;
import com.ups.entidades.TbDatosFicha;
import com.ups.entidades.TbDatosHijo;
import com.ups.entidades.TbDatosPersonales;
import com.ups.entidades.TbInventarioGanado;
import com.ups.entidades.TbProduccionLeche;
import com.ups.entidades.TbProduccionPecuario;
import com.ups.entidades.TbTenenciaTierra;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbFamilia.class)
public class TbFamilia_ { 

    public static volatile SingularAttribute<TbFamilia, Integer> idFamilia;
    public static volatile ListAttribute<TbFamilia, TbDatosFicha> tbDatosFichaList;
    public static volatile ListAttribute<TbFamilia, TbInventarioGanado> tbInventarioGanadoList;
    public static volatile SingularAttribute<TbFamilia, TbDatosConyugue> idDatosConyugue;
    public static volatile ListAttribute<TbFamilia, TbProduccionPecuario> tbProduccionPecuarioList;
    public static volatile ListAttribute<TbFamilia, TbTenenciaTierra> tbTenenciaTierraList;
    public static volatile SingularAttribute<TbFamilia, TbDatosPersonales> idDatosPersonales;
    public static volatile ListAttribute<TbFamilia, TbDatosHijo> tbDatosHijoList;
    public static volatile ListAttribute<TbFamilia, TbProduccionLeche> tbProduccionLecheList;

}