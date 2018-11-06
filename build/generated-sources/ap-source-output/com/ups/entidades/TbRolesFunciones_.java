package com.ups.entidades;

import com.ups.entidades.TbFuncion;
import com.ups.entidades.TbTipoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-08T22:47:48")
@StaticMetamodel(TbRolesFunciones.class)
public class TbRolesFunciones_ { 

    public static volatile SingularAttribute<TbRolesFunciones, Boolean> estado;
    public static volatile SingularAttribute<TbRolesFunciones, TbTipoUsuario> idTipoUsuario;
    public static volatile SingularAttribute<TbRolesFunciones, Integer> idRolesFunciones;
    public static volatile SingularAttribute<TbRolesFunciones, TbFuncion> idFuncion;

}