package com.ups.entidades;

import com.ups.entidades.TbAcequia;
import com.ups.entidades.TbComunidad;
import com.ups.entidades.TbOrganizacionRiego;
import com.ups.entidades.TbOvalo;
import com.ups.entidades.TbPorcentajeRiego;
import com.ups.entidades.TbProduccionAgricola;
import com.ups.entidades.TbSector;
import com.ups.entidades.TbTenenciaTierra;
import com.ups.entidades.TbTurnoRiego;
import com.ups.entidades.TbValorTarifa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbLote.class)
public class TbLote_ { 

    public static volatile SingularAttribute<TbLote, BigDecimal> areaRiegoM;
    public static volatile SingularAttribute<TbLote, TbOvalo> idOvalo;
    public static volatile ListAttribute<TbLote, TbTenenciaTierra> tbTenenciaTierraList;
    public static volatile ListAttribute<TbLote, TbTurnoRiego> tbTurnoRiegoList;
    public static volatile SingularAttribute<TbLote, TbComunidad> idComunidad;
    public static volatile SingularAttribute<TbLote, TbSector> idSector;
    public static volatile ListAttribute<TbLote, TbValorTarifa> tbValorTarifaList;
    public static volatile ListAttribute<TbLote, TbPorcentajeRiego> tbPorcentajeRiegoList;
    public static volatile SingularAttribute<TbLote, TbOrganizacionRiego> idOrganizacionRiego;
    public static volatile SingularAttribute<TbLote, Date> fechaReg;
    public static volatile SingularAttribute<TbLote, TbAcequia> idAcequia;
    public static volatile ListAttribute<TbLote, TbProduccionAgricola> tbProduccionAgricolaList;
    public static volatile SingularAttribute<TbLote, String> codigoLote;
    public static volatile SingularAttribute<TbLote, BigDecimal> areaTotalH;
    public static volatile SingularAttribute<TbLote, BigDecimal> areaRiegoH;
    public static volatile SingularAttribute<TbLote, Integer> idLote;
    public static volatile SingularAttribute<TbLote, BigDecimal> areaTotalM;

}