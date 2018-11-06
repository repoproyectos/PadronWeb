package com.ups.entidades;

import com.ups.entidades.TbRolesFunciones;
import com.ups.entidades.TbUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbTipoUsuario.class)
public class TbTipoUsuario_ { 

    public static volatile SingularAttribute<TbTipoUsuario, Integer> idTipoUsuario;
    public static volatile ListAttribute<TbTipoUsuario, TbUsuario> tbUsuarioList;
    public static volatile SingularAttribute<TbTipoUsuario, String> tipoUsuario;
    public static volatile ListAttribute<TbTipoUsuario, TbRolesFunciones> tbRolesFuncionesList;

}