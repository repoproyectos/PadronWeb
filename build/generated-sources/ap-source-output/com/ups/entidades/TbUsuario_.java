package com.ups.entidades;

import com.ups.entidades.TbDatosFicha;
import com.ups.entidades.TbRegistroUsuario;
import com.ups.entidades.TbTipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbUsuario.class)
public class TbUsuario_ { 

    public static volatile SingularAttribute<TbUsuario, TbRegistroUsuario> idRegistroUsuario;
    public static volatile ListAttribute<TbUsuario, TbDatosFicha> tbDatosFichaList;
    public static volatile SingularAttribute<TbUsuario, TbTipoUsuario> idTipoUsuario;
    public static volatile SingularAttribute<TbUsuario, Integer> idUsuario;
    public static volatile SingularAttribute<TbUsuario, String> nomUsuario;
    public static volatile SingularAttribute<TbUsuario, String> contrasena;

}